/*
 * ******************************************************************************
 *  *  Copyright 2016 Pitney Bowes Inc
 *  *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 *  *    You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an
 *  *   "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *   See the License for the specific language governing permissions and limitations under the License.
 *  ******************************************************************************
 */

package com.pb.identify.identifyEntity;

import android.content.Context;

import com.google.gson.Gson;
import com.pb.identify.OAuth.AuthToken;
import com.pb.identify.OAuth.OAuthService;
import com.pb.identify.identifyEntity.extractEntities.model.Options;
import com.pb.identify.identifyEntity.extractEntities.model.Record;
import com.pb.identify.identifyEntity.extractEntities.model.ExtractEntitiesAPIRequest;
import com.pb.identify.identifyEntity.extractEntities.model.ExtractEntitiesAPIResponseList;
import com.pb.identify.interfaces.RequestObserver;
import com.pb.identify.network.ErrorResponse;
import com.pb.identify.network.IdentifyErrorResponse;
import com.pb.identify.network.PostRestService;
import com.pb.identify.utils.Log;
import com.pb.identify.utils.UrlMaker;
import com.pb.identify.utils.Utils;

import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class IdentifyEntityServiceImpl extends OAuthService implements IdentifyEntityService {
    private static final Logger _LOG = LoggerFactory.getLogger(IdentifyEntityServiceImpl.class);
    private static final String ERROR_MSG = "Please provide valid values for method parameters";

    private PostRestService _PostRestService = null;
    UrlMaker urlMaker = null;
    private static final String extractEntitiesURL = "/identifyentity/v1/rest/extractentities/results.json";

    @Override
    public void extractEntities(final Context context, final List<Record> records, final Options options, final RequestObserver<ExtractEntitiesAPIResponseList> requestObserver) {

        if(context == null || records == null || records.isEmpty())
        {
            _LOG.info("something is null");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(ERROR_MSG);

            ErrorResponse errorResponse = new ErrorResponse(Utils.getInternalErrorResponseObject(illegalArgumentException.getMessage(), illegalArgumentException));
            errorResponse.setRootErrorMessage(illegalArgumentException.getMessage());

            IdentifyErrorResponse identifyErrorResponse = new IdentifyErrorResponse();
            errorResponse.setIdentifyErrorResponse(identifyErrorResponse);

            requestObserver.onFailure(errorResponse);
            return;
        }
        super.getAuthenticationToken(context, new RequestObserver<AuthToken>() {

            @Override
            public void onSucess(AuthToken data) {

                Log.d("Authentication is sucessfull, It's time to call Identify API ");
                processExtractEntitiesRequest(context,records,options,requestObserver);
            }

            @Override
            public void onRequestStart() {
                Log.d("Authentication request has been started for Identify ");

            }

            @Override
            public void onFailure(ErrorResponse errorData) {
                Log.e("Authentication request has been failed" + errorData);
                requestObserver.onFailure(errorData);
            }
        });

    }

    private void processExtractEntitiesRequest(Context context, List<Record> records, final Options options, final RequestObserver<ExtractEntitiesAPIResponseList> requestObserver) {

        urlMaker = UrlMaker.getInstance();

        StringBuilder urlBuilder = new StringBuilder(urlMaker.getAbsoluteUrl(extractEntitiesURL));

        Log.d("URL : "+urlBuilder);

        ExtractEntitiesAPIRequest request = new ExtractEntitiesAPIRequest();
        request.getInputRecord().getRecords().addAll(records);
        request.setOptions(options);

        Gson gson = new Gson();

        JSONObject jsonObject = null;

        try
        {
            String json = gson.toJson(request);
            Log.d("gson extract entities request : "+json);
            jsonObject = new JSONObject(json);
        }
        catch (JSONException e1)
        {
            Log.e("Excpetion in Json parsing of extract entities request : "+ e1.getMessage());
        }
        _PostRestService = new PostRestService(context, urlBuilder.toString(), jsonObject, this, new RequestObserver<String>() {

            @Override
            public void onSucess(String data) {

                ExtractEntitiesAPIResponseList response = null;
                try {
                    JSONObject jsonResponse = new JSONObject(data);
                    Gson gson = new Gson();
                    response = gson.fromJson(jsonResponse.toString(),
                            ExtractEntitiesAPIResponseList.class);

                    Log.d("Got the extract entities response " + response);

                } catch (JSONException e) {
                    Log.e("Excpetion in Json parsing of extract entities reponse : "
                            + e.getMessage());
                    ErrorResponse errorResponse = new ErrorResponse(
                            Utils.getInternalErrorResponseObject(
                                    e.getMessage(), e));
                    errorResponse.setRootErrorMessage(e.getMessage());

                    requestObserver.onFailure(errorResponse);
                    return;
                }
                requestObserver.onSucess(response);
            }

            @Override
            public void onRequestStart() {
                Log.d("Extract Entities request has been started");
                requestObserver.onRequestStart();
            }

            @Override
            public void onFailure(ErrorResponse errorData) {
                Log.e("Oops Retrieval of Extract Entities Details failed");
                requestObserver.onFailure(errorData);
            }
        });
        _PostRestService.execute();

    }
}

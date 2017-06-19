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

package com.pb.identify.identifyAddress;

import android.content.Context;

import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.pb.identify.OAuth.AuthToken;
import com.pb.identify.OAuth.OAuthService;
import com.pb.identify.identifyAddress.getPostalCodes.model.GetPostalCodesAPIResponseList;
import com.pb.identify.identifyAddress.getPostalCodes.model.GetPostalCodesAPIRequest;
import com.pb.identify.identifyAddress.validateMailingAddress.model.ValidateMailingAddressAPIRequest;
import com.pb.identify.identifyAddress.validateMailingAddress.model.ValidateMailingAddressAPIResponseList;
import com.pb.identify.identifyAddress.validateMailingAddressPro.model.ValidateMailingAddressProAPIResponseList;
import com.pb.identify.identifyAddress.validateMailingAddressPro.model.ValidateMailingAddressProAPIRequest;
import com.pb.identify.identifyAddress.validateMailingAddressPremium.model.ValidateMailingAddressPremiumAPIResponseList;
import com.pb.identify.identifyAddress.validateMailingAddressPremium.model.ValidateMailingAddressPremiumAPIRequest;
import com.pb.identify.identifyAddress.getCityStateProvince.model.GetCityStateProvinceAPIResponseList;
import com.pb.identify.identifyAddress.getCityStateProvince.model.GetCityStateProvinceAPIRequest;
import com.pb.identify.interfaces.RequestObserver;
import com.pb.identify.network.ErrorResponse;
import com.pb.identify.network.IdentifyErrorResponse;
import com.pb.identify.network.PostRestService;
import com.pb.identify.utils.Log;
import com.pb.identify.utils.UrlMaker;
import com.pb.identify.utils.Utils;

public class IdentifyAddressServiceImpl extends OAuthService implements IdentifyAddressService {

	private static final Logger _LOG = LoggerFactory.getLogger(IdentifyAddressServiceImpl.class);
    private static final String ERROR_MSG = "Please provide valid values for method parameters";

    private PostRestService _PostRestService = null;
    UrlMaker urlMaker = null;
	private static final String validateMailingAddressURL = "/identifyaddress/v1/rest/validatemailingaddress/results.json";
	private static final String validateMailingAddressProURL = "/identifyaddress/v1/rest/validatemailingaddresspro/results.json";
	private static final String validateMailingAddressPremiumURL = "/identifyaddress/v1/rest/validatemailingaddresspremium/results.json";
	private static final String getCityStateProvinceURL = "/identifyaddress/v1/rest/getcitystateprovince/results.json";
	private static final String getPostalCodesURL = "/identifyaddress/v1/rest/getpostalcodes/results.json";
    @Override
    public void validateMailingAddress(final Context context, final List<com.pb.identify.identifyAddress.validateMailingAddress.model.Address> addresses, final com.pb.identify.identifyAddress.validateMailingAddress.model.Options options, final RequestObserver<ValidateMailingAddressAPIResponseList> requestObserver) {

        if(context == null || addresses == null || addresses.isEmpty())
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
                processValidateMailingAddressRequest(context,addresses,options,requestObserver);
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

	private void processValidateMailingAddressRequest(Context context, List<com.pb.identify.identifyAddress.validateMailingAddress.model.Address> addresses, final com.pb.identify.identifyAddress.validateMailingAddress.model.Options options, final RequestObserver<ValidateMailingAddressAPIResponseList> requestObserver) {

		urlMaker = UrlMaker.getInstance();

		StringBuilder urlBuilder = new StringBuilder(urlMaker.getAbsoluteUrl(validateMailingAddressURL));

		Log.d("URL : "+urlBuilder);

        ValidateMailingAddressAPIRequest request = new ValidateMailingAddressAPIRequest();
        request.getInputAddress().getAddresses().addAll(addresses);
		request.setOptions(options);

		Gson gson = new Gson();

		JSONObject jsonObject = null;

		try
		{
			String json = gson.toJson(request);
			Log.d("gson validate mailing address request : "+json);
			jsonObject = new JSONObject(json);
		}
		catch (JSONException e1)
		{
			Log.e("Excpetion in Json parsing of validate mailing address request : "+ e1.getMessage());
		}
		_PostRestService = new PostRestService(context, urlBuilder.toString(), jsonObject, this, new RequestObserver<String>() {

			@Override
			public void onSucess(String data) {

				ValidateMailingAddressAPIResponseList response = null;
				try {
					JSONObject jsonResponse = new JSONObject(data);
					Gson gson = new Gson();
					response = gson.fromJson(jsonResponse.toString(),
							ValidateMailingAddressAPIResponseList.class);

					Log.d("Got the validate mailing address response " + response);

				} catch (JSONException e) {
					Log.e("Excpetion in Json parsing of validate mailing address reponse : "
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
				Log.d("Validate Mailing Address request has been started");
				requestObserver.onRequestStart();
			}

			@Override
			public void onFailure(ErrorResponse errorData) {
				Log.e("Oops Retrieval of Validate Mailing Address Details failed");
				requestObserver.onFailure(errorData);
			}
		});
		_PostRestService.execute();

	}

	@Override
	public void validateMailingAddressPro(final Context context, final List<com.pb.identify.identifyAddress.validateMailingAddressPro.model.Address> addresses, final com.pb.identify.identifyAddress.validateMailingAddressPro.model.Options options,
										  final RequestObserver<ValidateMailingAddressProAPIResponseList> requestObserver){

		if(context == null || addresses == null || addresses.isEmpty())
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
				processValidateMailingAddressProRequest(context,addresses,options,requestObserver);
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

	private void processValidateMailingAddressProRequest(Context context, List<com.pb.identify.identifyAddress.validateMailingAddressPro.model.Address> addresses, final com.pb.identify.identifyAddress.validateMailingAddressPro.model.Options options, final RequestObserver<ValidateMailingAddressProAPIResponseList> requestObserver) {

		urlMaker = UrlMaker.getInstance();

		StringBuilder urlBuilder = new StringBuilder(urlMaker.getAbsoluteUrl(validateMailingAddressProURL));

		Log.d("URL : "+urlBuilder);

		ValidateMailingAddressProAPIRequest request = new ValidateMailingAddressProAPIRequest();
		request.getInputAddress().getAddresses().addAll(addresses);
		request.setOptions(options);

		Gson gson = new Gson();

		JSONObject jsonObject = null;

		try
		{
			String json = gson.toJson(request);
			Log.d("gson validate mailing address pro request : "+json);
			jsonObject = new JSONObject(json);
		}
		catch (JSONException e1)
		{
			Log.e("Excpetion in Json parsing of validate mailing address pro request : "+ e1.getMessage());
		}
		_PostRestService = new PostRestService(context, urlBuilder.toString(), jsonObject, this, new RequestObserver<String>() {

			@Override
			public void onSucess(String data) {

				ValidateMailingAddressProAPIResponseList response = null;
				try {
					JSONObject jsonResponse = new JSONObject(data);
					Gson gson = new Gson();
					response = gson.fromJson(jsonResponse.toString(),
							ValidateMailingAddressProAPIResponseList.class);

					Log.d("Got the validate mailing address pro response " + response);

				} catch (JSONException e) {
					Log.e("Excpetion in Json parsing of validate mailing address pro reponse : "
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
				Log.d("Validate Mailing Address Pro request has been started");
				requestObserver.onRequestStart();
			}

			@Override
			public void onFailure(ErrorResponse errorData) {
				Log.e("Oops Retrieval of Validate Mailing Address Pro Details failed");
				requestObserver.onFailure(errorData);
			}
		});
		_PostRestService.execute();

	}

	@Override
	public void validateMailingAddressPremium(final Context context, final List<com.pb.identify.identifyAddress.validateMailingAddressPremium.model.Address> addresses, final com.pb.identify.identifyAddress.validateMailingAddressPremium.model.Options options,
										  final RequestObserver<ValidateMailingAddressPremiumAPIResponseList> requestObserver){

		if(context == null || addresses == null || addresses.isEmpty())
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
				processValidateMailingAddressPremiumRequest(context,addresses,options,requestObserver);
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

	private void processValidateMailingAddressPremiumRequest(Context context, List<com.pb.identify.identifyAddress.validateMailingAddressPremium.model.Address> addresses, final com.pb.identify.identifyAddress.validateMailingAddressPremium.model.Options options, final RequestObserver<ValidateMailingAddressPremiumAPIResponseList> requestObserver) {

		urlMaker = UrlMaker.getInstance();

		StringBuilder urlBuilder = new StringBuilder(urlMaker.getAbsoluteUrl(validateMailingAddressPremiumURL));

		Log.d("URL : "+urlBuilder);

		ValidateMailingAddressPremiumAPIRequest request = new ValidateMailingAddressPremiumAPIRequest();
		request.getInputAddress().getAddresses().addAll(addresses);
		request.setOptions(options);

		Gson gson = new Gson();

		JSONObject jsonObject = null;

		try
		{
			String json = gson.toJson(request);
			Log.d("gson validate mailing address premium request : "+json);
			jsonObject = new JSONObject(json);
		}
		catch (JSONException e1)
		{
			Log.e("Excpetion in Json parsing of validate mailing address premium request : "+ e1.getMessage());
		}
		_PostRestService = new PostRestService(context, urlBuilder.toString(), jsonObject, this, new RequestObserver<String>() {

			@Override
			public void onSucess(String data) {

				ValidateMailingAddressPremiumAPIResponseList response = null;
				try {
					JSONObject jsonResponse = new JSONObject(data);
					Gson gson = new Gson();
					response = gson.fromJson(jsonResponse.toString(),
							ValidateMailingAddressPremiumAPIResponseList.class);

					Log.d("Got the validate mailing address premium response " + response);

				} catch (JSONException e) {
					Log.e("Excpetion in Json parsing of validate mailing address premium reponse : "
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
				Log.d("Validate Mailing Address Premium request has been started");
				requestObserver.onRequestStart();
			}

			@Override
			public void onFailure(ErrorResponse errorData) {
				Log.e("Oops Retrieval of Validate Mailing Address Premium Details failed");
				requestObserver.onFailure(errorData);
			}
		});
		_PostRestService.execute();

	}

	@Override
	public void getCityStateProvince(final Context context, final List<com.pb.identify.identifyAddress.getCityStateProvince.model.Record> records, final com.pb.identify.identifyAddress.getCityStateProvince.model.Options options,
											  final RequestObserver<GetCityStateProvinceAPIResponseList> requestObserver){

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
				processGetCityStateProvinceRequest(context,records,options,requestObserver);
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

	private void processGetCityStateProvinceRequest(Context context, List<com.pb.identify.identifyAddress.getCityStateProvince.model.Record> records, final com.pb.identify.identifyAddress.getCityStateProvince.model.Options options, final RequestObserver<GetCityStateProvinceAPIResponseList> requestObserver) {

		urlMaker = UrlMaker.getInstance();

		StringBuilder urlBuilder = new StringBuilder(urlMaker.getAbsoluteUrl(getCityStateProvinceURL));

		Log.d("URL : "+urlBuilder);

		GetCityStateProvinceAPIRequest request = new GetCityStateProvinceAPIRequest();
		request.getInputRecord().getRecords().addAll(records);
		request.setOptions(options);

		Gson gson = new Gson();

		JSONObject jsonObject = null;

		try
		{
			String json = gson.toJson(request);
			Log.d("gson get city state province request : "+json);
			jsonObject = new JSONObject(json);
		}
		catch (JSONException e1)
		{
			Log.e("Excpetion in Json parsing of get city state province request : "+ e1.getMessage());
		}
		_PostRestService = new PostRestService(context, urlBuilder.toString(), jsonObject, this, new RequestObserver<String>() {

			@Override
			public void onSucess(String data) {

				GetCityStateProvinceAPIResponseList response = null;
				try {
					JSONObject jsonResponse = new JSONObject(data);
					Gson gson = new Gson();
					response = gson.fromJson(jsonResponse.toString(),
							GetCityStateProvinceAPIResponseList.class);

					Log.d("Got the get city state province response " + response);

				} catch (JSONException e) {
					Log.e("Excpetion in Json parsing of get city state province reponse : "
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
				Log.d("Get City State Province request has been started");
				requestObserver.onRequestStart();
			}

			@Override
			public void onFailure(ErrorResponse errorData) {
				Log.e("Oops Retrieval of Get City State Province Details failed");
				requestObserver.onFailure(errorData);
			}
		});
		_PostRestService.execute();

	}

	@Override
	public void getPostalCodes(final Context context, final List<com.pb.identify.identifyAddress.getPostalCodes.model.Record> records, final com.pb.identify.identifyAddress.getPostalCodes.model.Options options,
									 final RequestObserver<GetPostalCodesAPIResponseList> requestObserver){

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
				processGetPostalCodesRequest(context,records,options,requestObserver);
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

	private void processGetPostalCodesRequest(Context context, List<com.pb.identify.identifyAddress.getPostalCodes.model.Record> records, final com.pb.identify.identifyAddress.getPostalCodes.model.Options options, final RequestObserver<GetPostalCodesAPIResponseList> requestObserver) {

		urlMaker = UrlMaker.getInstance();

		StringBuilder urlBuilder = new StringBuilder(urlMaker.getAbsoluteUrl(getPostalCodesURL));

		Log.d("URL : "+urlBuilder);

		GetPostalCodesAPIRequest request = new GetPostalCodesAPIRequest();
		request.getInputRecord().getRecords().addAll(records);
		request.setOptions(options);

		Gson gson = new Gson();

		JSONObject jsonObject = null;

		try
		{
			String json = gson.toJson(request);
			Log.d("gson get postal codes request : "+json);
			jsonObject = new JSONObject(json);
		}
		catch (JSONException e1)
		{
			Log.e("Excpetion in Json parsing of get postal codes request : "+ e1.getMessage());
		}
		_PostRestService = new PostRestService(context, urlBuilder.toString(), jsonObject, this, new RequestObserver<String>() {

			@Override
			public void onSucess(String data) {

				GetPostalCodesAPIResponseList response = null;
				try {
					JSONObject jsonResponse = new JSONObject(data);
					Gson gson = new Gson();
					response = gson.fromJson(jsonResponse.toString(),
							GetPostalCodesAPIResponseList.class);

					Log.d("Got the get postal codes response " + response);

				} catch (JSONException e) {
					Log.e("Excpetion in Json parsing of get postal codes reponse : "
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
				Log.d("Get Postal Codes request has been started");
				requestObserver.onRequestStart();
			}

			@Override
			public void onFailure(ErrorResponse errorData) {
				Log.e("Oops Retrieval of Get Postal Codes details failed");
				requestObserver.onFailure(errorData);
			}
		});
		_PostRestService.execute();

	}

}
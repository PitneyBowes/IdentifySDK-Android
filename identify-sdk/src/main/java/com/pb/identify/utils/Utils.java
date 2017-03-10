

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

package com.pb.identify.utils;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Map;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.pb.identify.network.InternalErrorResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Utils {


    private static final Logger _LOG = LoggerFactory.getLogger(Utils.class);
	
    public static InternalErrorResponse getInternalErrorResponseObject(
            String erMessage, Exception e) {
        InternalErrorResponse irErrorResponse = new InternalErrorResponse();
        irErrorResponse.setGenericErrorMessage(erMessage);
        irErrorResponse.setException(e);
        return irErrorResponse;
    }

}
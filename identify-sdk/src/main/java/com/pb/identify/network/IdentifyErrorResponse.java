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

package com.pb.identify.network;

/**
 * Class to handle IDENTIFY specific exceptions from Network
 * 
 */
public class IdentifyErrorResponse {




    // IDENTIFY specific exceptions from Network
    private IdentifyError identifyError;
    // Network failure status like 400 Not Found
    private int httpStatusCode;

    public IdentifyError getIdentifyError() {
        return identifyError;
    }

    public void setIdentifyError(IdentifyError identifyError) {
        this.identifyError = identifyError;
    }

    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(int httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

}


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

import com.pb.identify.network.IdentifyError.Errors;

/**
 * This class is responsible for providing all kinds of exceptions and errors
 * which may occur any time while consuming Identify services.
 * 
 *
 */
public class ErrorResponse {

    // A root cause error, which simplifies the error without going in detail
    private String rootCauseErrorMessage;

    // All input validations, system specific and internal errors
    private InternalErrorResponse internalErrorResponse;

    // All IDENTIFY and Messery Authentication specific errors
    private IdentifyErrorResponse identifyErrorResponse;

    private ErrorResponseType errorResponseType;

    // Error Response type
    public enum ErrorResponseType {
        IDENTIFY, INTERNAL
    };

    public String getRootErrorMessage() {
        return rootCauseErrorMessage;
    }

    public void setRootErrorMessage(String rootCauseErrorMessage) {
        this.rootCauseErrorMessage = rootCauseErrorMessage;
    }

    public InternalErrorResponse getInternalErrorResponse() {
        return internalErrorResponse;
    }

    public void setInternalErrorResponse(
            InternalErrorResponse internalErrorResponse) {
        this.internalErrorResponse = internalErrorResponse;
    }

    public IdentifyErrorResponse getIdentifyErrorResponse() {
        return identifyErrorResponse;
    }

    public void setIdentifyErrorResponse(IdentifyErrorResponse identifyErrorResponse) {
        this.identifyErrorResponse = identifyErrorResponse;
    }

    public ErrorResponse() {
        internalErrorResponse = null;
        identifyErrorResponse = null;
        errorResponseType = null;
    }

    public ErrorResponse(InternalErrorResponse internalErrorResponse) {
        this.internalErrorResponse = internalErrorResponse;
        errorResponseType = ErrorResponseType.INTERNAL;
    }

    public ErrorResponse(IdentifyErrorResponse identifyErrorResponse) {
        this.identifyErrorResponse = identifyErrorResponse;
        errorResponseType = ErrorResponseType.IDENTIFY;

    }

    public ErrorResponseType getErrorResponseType() {
        return errorResponseType;
    }

    public void setErrorResponseType(ErrorResponseType errorResponseType) {
        this.errorResponseType = errorResponseType;
    }

    /**
     * Returns HTTP Status code
     * 
     * @return {@link IdentifyErrorResponse} or 0 for Other Internal errors
     */
    public int getHttpStatusCode() {
        int httpStatusCode = 0;
        if (this.identifyErrorResponse != null) {
            return this.identifyErrorResponse.getHttpStatusCode();
        }
        return httpStatusCode;
    }

    /**
     * Get IDENTIFY Specific Errors
     * 
     * @return Errors[] {@link Errors} or Null for Internal Errors
     */
    public Errors[] getIdentifyError() {

        Errors[] error = null;
        if (this.identifyErrorResponse != null
                && this.identifyErrorResponse.getIdentifyError() != null) {
            error = this.identifyErrorResponse.getIdentifyError().getErrors();
        }

        return error;

    }

}

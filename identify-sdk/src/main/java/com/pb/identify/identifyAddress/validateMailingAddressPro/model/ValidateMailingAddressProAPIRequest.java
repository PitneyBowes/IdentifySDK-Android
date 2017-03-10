
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

package com.pb.identify.identifyAddress.validateMailingAddressPro.model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * This class is used to create the request body for the ValidateMailingAddressPro API
 *
 */
public class ValidateMailingAddressProAPIRequest {
    protected Options options= new Options();
    public Options getOptions() {
        return options;
    }
    public void setOptions(Options options) {
        this.options=options;
    }
    @SerializedName("Input")
    protected InputAddress input = new InputAddress();
    public class InputAddress{
        @SerializedName("Row")
        protected List<Address> row;

        public List<Address> getAddresses() {
            if (row == null) {
                row = new ArrayList<Address>();
            }
            return this.row;
        }
    }
    public InputAddress getInputAddress(){
        return input;
    }
}

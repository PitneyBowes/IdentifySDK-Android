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
package com.pb.identify.identifyAddress.getCityStateProvince.model;

import com.google.gson.annotations.SerializedName;
import com.pb.identify.common.model.UserField;

import java.util.List;

/**
 * Model class for GetCityStateProvince input
 *
 */

public class Record {
    @SerializedName(value="PostalCode")
    private String postalCode;
    @SerializedName(value="user_fields")
    private List<UserField> userFields;

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public List<UserField> getUserFields() {
        return userFields;
    }

    public void setUserFields(List<UserField> userFields) {
        this.userFields = userFields;
    }
}

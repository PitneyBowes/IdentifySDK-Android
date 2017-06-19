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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.pb.identify.common.model.UserField;

/**
 * This class represents a single validated address in the response from GetCityStateProvince API
 *
 */

public class GetCityStateProvinceAPIResponse {
    @SerializedName(value="City")
    private String city;
    @SerializedName(value="City.Type")
    private String city_Type;
    @SerializedName(value="PostalCode")
    private String postalCode;
    @SerializedName(value="StateProvince")
    private String stateProvince;
    private List<UserField> user_fields;
    @SerializedName(value="Status")
    private String status;
    @SerializedName(value="Status.Code")
    private String status_code;
    @SerializedName(value="Status.Description")
    private String status_description;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity_Type() {
        return city_Type;
    }

    public void setCity_Type(String city_Type) {
        this.city_Type = city_Type;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public List<UserField> getUser_fields() {
        return user_fields;
    }

    public void setUser_fields(List<UserField> user_fields) {
        this.user_fields = user_fields;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus_code() {
        return status_code;
    }

    public void setStatus_code(String status_code) {
        this.status_code = status_code;
    }

    public String getStatus_description() {
        return status_description;
    }

    public void setStatus_description(String status_description) {
        this.status_description = status_description;
    }
}

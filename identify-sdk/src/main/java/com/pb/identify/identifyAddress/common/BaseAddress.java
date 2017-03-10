
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

package com.pb.identify.identifyAddress.common;

import com.google.gson.annotations.SerializedName;
import com.pb.identify.common.model.UserField;

import java.util.List;

/**
 * Base class for ValidateMailingAddress input
 *
 */
public abstract class BaseAddress {

    @SerializedName(value="AddressLine1")
    private String addressLine1;
    @SerializedName(value="AddressLine2")
    private String addressLine2;
    @SerializedName(value="City")
    private String city;
    @SerializedName(value="Country")
    private String country;
    @SerializedName(value="StateProvince")
    private String stateProvince;
    @SerializedName(value="PostalCode")
    private String postalCode;
    @SerializedName(value="FirmName")
    private String firmName;
    @SerializedName(value="user_fields")
    private List<UserField> userFields;

    public String getAddressLine1() {
        return addressLine1;
    }
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }
    public String getAddressLine2() {
        return addressLine2;
    }
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getStateProvince() {
        return stateProvince;
    }
    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public String getFirmName() {
        return firmName;
    }
    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }
    public List<UserField> getUserFields() {
        return userFields;
    }
    public void setUserFields(List<UserField> userFields) {
        this.userFields = userFields;
    }
}


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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.pb.identify.common.model.UserField;

/**
 * Base Response class for ValidateMailingAddress API
 *
 */
public abstract class BaseResponse {
    @SerializedName(value="Status")
    private String status;
    @SerializedName(value="Status.Code")
    private String status_code;
    @SerializedName(value="Status.Description")
    private String status_description ;
    @SerializedName(value="AddressLine1")
    private String addressLine1;
    @SerializedName(value="AddressLine2")
    private String addressLine2;
    @SerializedName(value="City")
    private String city;
    @SerializedName(value="StateProvince")
    private String stateProvince;
    @SerializedName(value="PostalCode")
    private String postalCode;
    @SerializedName(value="Country")
    private String country;
    @SerializedName(value="FirmName")
    private String firmname;
    @SerializedName(value="BlockAddress")
    private String blockAddress;
    @SerializedName(value="PostalCode.Base")
    private String postalCode_base;
    @SerializedName(value="PostalCode.AddOn")
    private String postalCode_addOn;
    private List<UserField> user_fields;
    @SerializedName(value="AdditionalInputData")
    private String additionalInputData;

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
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getFirmname() {
        return firmname;
    }
    public void setFirmname(String firmname) {
        this.firmname = firmname;
    }
    public String getBlockAddress() {
        return blockAddress;
    }
    public void setBlockAddress(String blockAddress) {
        this.blockAddress = blockAddress;
    }
    public String getPostalCode_base() {
        return postalCode_base;
    }
    public void setPostalCode_base(String postalCode_base) {
        this.postalCode_base = postalCode_base;
    }
    public String getPostalCode_addOn() {
        return postalCode_addOn;
    }
    public void setPostalCode_addOn(String postalCode_addOn) {
        this.postalCode_addOn = postalCode_addOn;
    }
    public List<UserField> getUser_fields() {
        return user_fields;
    }
    public void setUser_fields(List<UserField> user_fields) {
        this.user_fields = user_fields;
    }
    public String getAdditionalInputData() {
        return additionalInputData;
    }
    public void setAdditionalInputData(String additionalInputData) {
        this.additionalInputData = additionalInputData;
    }
}

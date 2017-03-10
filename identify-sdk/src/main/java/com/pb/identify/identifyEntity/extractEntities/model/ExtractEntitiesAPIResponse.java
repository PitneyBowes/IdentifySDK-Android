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

package com.pb.identify.identifyEntity.extractEntities.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.pb.identify.common.model.UserField;

/**
 * This class represents a single matched record in the response from ExtractEntities API
 *
 */
public class ExtractEntitiesAPIResponse {

    @SerializedName(value="Text")
    private String text;
    @SerializedName(value="Type")
    private String type;
    @SerializedName(value="Count")
    private String count;
    @SerializedName(value="Status")
    private String status;
    @SerializedName(value="Status.Code")
    private String status_code;
    @SerializedName(value="Status.Description")
    private String status_descriptioin;
    private List<UserField> user_fields;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
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

    public String getStatus_descriptioin() {
        return status_descriptioin;
    }

    public void setStatus_descriptioin(String status_descriptioin) {
        this.status_descriptioin = status_descriptioin;
    }

    public List<UserField> getUser_fields() {
        return user_fields;
    }

    public void setUser_fields(List<UserField> user_fields) {
        this.user_fields = user_fields;
    }
}

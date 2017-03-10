
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

package com.pb.identify.identifyEmail.validateEmailAddress.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.pb.identify.common.model.UserField;

/**
 * Model class for ValidateEmailAddress input
 *
 */
public class Record {

	@SerializedName(value="bogus")
	private String bogus;
	@SerializedName(value="complain")
	private String complain;
	@SerializedName(value="disposable")
	private String disposable;
	@SerializedName(value="atc")
	private String atc;
	@SerializedName(value="emailAddress")
	private String emailAddress;
	@SerializedName(value="emps")
	private String emps;
	@SerializedName(value="fccwireless")
	private String fccWireless;
	@SerializedName(value="language")
	private String language;
	@SerializedName(value="role")
	private String role;
	@SerializedName(value="rtc")
	private String rtc;
	@SerializedName(value="rtc_timeout")
	private String rtcTimeOut;
	@SerializedName(value="user_fields")
	private List<UserField> userFields;
	public String getBogus() {
		return bogus;
	}
	public void setBogus(String bogus) {
		this.bogus = bogus;
	}
	public String getComplain() {
		return complain;
	}
	public void setComplain(String complain) {
		this.complain = complain;
	}
	public String getDisposable() {
		return disposable;
	}
	public void setDisposable(String disposable) {
		this.disposable = disposable;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getEmps() {
		return emps;
	}
	public void setEmps(String emps) {
		this.emps = emps;
	}
	public String getFccWireless() {
		return fccWireless;
	}
	public void setFccWireless(String fccWireless) {
		this.fccWireless = fccWireless;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getRtc() {
		return rtc;
	}
	public void setRtc(String rtc) {
		this.rtc = rtc;
	}
	public String getRtcTimeOut() {
		return rtcTimeOut;
	}
	public void setRtcTimeOut(String rtcTimeOut) {
		this.rtcTimeOut = rtcTimeOut;
	}
	public String getAtc() { return atc; }
	public void setAtc(String atc) { this.atc = atc; }
	public List<UserField> getUserFields() {
		return userFields;
	}
	public void setUserFields(List<UserField> userFields) {
		this.userFields = userFields;
	}
	
	
}

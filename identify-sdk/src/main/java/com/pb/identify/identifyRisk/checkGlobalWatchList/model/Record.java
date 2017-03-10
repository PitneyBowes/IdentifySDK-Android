
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

package com.pb.identify.identifyRisk.checkGlobalWatchList.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.pb.identify.common.model.UserField;

/**
 * Model class for checkGlobalWatchList input
 *
 */
public class Record {

	@SerializedName(value="AddressLine1")
	private String addressLine1;
	@SerializedName(value="AddressLine2")
	private String addressLine2;
	@SerializedName(value="AddressLine3")
	private String addressLine3;
	@SerializedName(value="Citizenship")
	private String citizenship;
	@SerializedName(value="Country")
	private String country;
	@SerializedName(value="DOB")
	private String dob;
	@SerializedName(value="FirstName")
	private String firstname;
	@SerializedName(value="IDNumber")
	private String idnumber;
	@SerializedName(value="LastName")
	private String lastname;
	@SerializedName(value="Name")
	private String name;
	@SerializedName(value="Nationality")
	private String nationality;
	@SerializedName(value="PlaceOfBirth")
	private String placeofbirth;
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
	public String getAddressLine3() {
		return addressLine3;
	}
	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}
	public String getCitizenship() {
		return citizenship;
	}
	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getIdnumber() {
		return idnumber;
	}
	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getPlaceofbirth() {
		return placeofbirth;
	}
	public void setPlaceofbirth(String placeofbirth) {
		this.placeofbirth = placeofbirth;
	}
	public List<UserField> getUserFields() {
		return userFields;
	}
	public void setUserFields(List<UserField> userFields) {
		this.userFields = userFields;
	}
	
	
	
}

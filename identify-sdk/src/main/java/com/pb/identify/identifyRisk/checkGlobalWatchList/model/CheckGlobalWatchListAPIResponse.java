
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
 * This class represents a single matched record in the response from CheckGlobalWatchList API
 *
 */
public class CheckGlobalWatchListAPIResponse {

	
	@SerializedName(value="Status")
	 private String status;
	 @SerializedName(value="Status.Code")
	 private String status_code;
	 @SerializedName(value="Status.Description")
	 private String status_description;
	 @SerializedName(value="MatchStatus")
	 private String matchstatus;
	 @SerializedName(value="InputName")
	 private String inputname;
	 @SerializedName(value="InputFilteredName")
	 private String inputfilteredname;
	 @SerializedName(value="Name")
	 private String name;
	 @SerializedName(value="InputFirstName")
	 private String inputfirstname;
	 @SerializedName(value="InputFilteredFirstName")
	 private String inputfilteredfirstname;
	 @SerializedName(value="FirstName")
	 private String firstname;
	 @SerializedName(value="InputLastName")
	 private String inputlastname;
	 @SerializedName(value="InputFilteredLastName")
	 private String inputfilteredlastname;
	 @SerializedName(value="LastName")
	 private String lastname;
	 @SerializedName(value="NameScore")
	 private String namescore;
	 @SerializedName(value="NameMatchIdentified")
	 private String namematchidentified;
	 @SerializedName(value="NameProvided")
	 private String nameprovided;
	 @SerializedName(value="InputAddressLine1")
	 private String inputAddressLine1;
	 @SerializedName(value="AddressLine1")
	 private String addressLine1;
	 @SerializedName(value="InputAddressLine2")
	 private String inputAddressLine2;
	 @SerializedName(value="AddressLine2")
	 private String addressLine2;
	 @SerializedName(value="InputAddressLine3")
	 private String inputaddressLine3;
	 @SerializedName(value="AddressLine3")
	 private String addressLine3;
	 @SerializedName(value="AddressScore")
	 private String addressscore;
	 @SerializedName(value="AddressMatchIdentified")
	 private String addressmatchidentified;
	 @SerializedName(value="AddressProvided")
	 private String addressprovided;
	 @SerializedName(value="InputCountry")
	 private String inputcountry;
	 @SerializedName(value="Country")
	 private String country;
	 @SerializedName(value="InputIDNumber")
	 private String inputidnumber;
	 @SerializedName(value="IDNumber")
	 private String idnumber;
	 @SerializedName(value="IDNumberScore")
	 private String idnumberscore;
	 @SerializedName(value="IDNumberMatchIdentified")
	 private String idnumbermatchidentified;
	 @SerializedName(value="IDNumberProvided")
	 private String idnumberprovided;
	 @SerializedName(value="InputPlaceOfBirth")
	 private String inputplaceofbirth;
	 @SerializedName(value="PlaceOfBirth")
	 private String placeofbirth;
	 @SerializedName(value="PlaceOfBirthScore")
	 private String placeofbirthscore;
	 @SerializedName(value="PlaceOfBirthMatchIdentified")
	 private String placeofbirthmatchidentified;
	 @SerializedName(value="PlaceOfBirthProvided")
	 private String placeofbirthprovided;
	 @SerializedName(value="InputDOB")
	 private String inputdob;
	 @SerializedName(value="DOB")
	 private String dob;
	 @SerializedName(value="DOBScore")
	 private String dobscore;
	 @SerializedName(value="DOBMatchIdentified")
	 private String dobmatchidentified;
	 @SerializedName(value="DOBProvided")
	 private String dobprovided;
	 @SerializedName(value="InputCitizenship")
	 private String inputcitizenship;
	 @SerializedName(value="Citizenship")
	 private String citizenship;
	 @SerializedName(value="CitizenshipScore")
	 private String citizenshipscore;
	 @SerializedName(value="CitizenshipMatchIdentified")
	 private String citizenshipmatchidentified;
	 @SerializedName(value="CitizenshipProvided")
	 private String citizenshipprovided;
	 @SerializedName(value="InputNationality")
	 private String inputNationality;
	 @SerializedName(value="Nationality")
	 private String nationality;
	 @SerializedName(value="NationalityScore")
	 private String nationalityscore;
	 @SerializedName(value="NationalityMatchIdentified")
	 private String nationalitymatchidentified;
	 @SerializedName(value="NationalityProvided")
	 private String nationalityprovided;
	 @SerializedName(value="EntryID")
	 private String entryid;
	 @SerializedName(value="ListType")
	 private String listtype;
	 @SerializedName(value="City")
	 private String city;
	 @SerializedName(value="FirmName")
	 private String firmname;
	 @SerializedName(value="OverallRiskLevel")
	 private String overallrisklevel;
	 @SerializedName(value="SanctionedCountryIdentified")
	 private String sanctionedcountryidentified;
	 private List<UserField> user_fields;
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
	public String getInputname() {
		return inputname;
	}
	public void setInputname(String inputname) {
		this.inputname = inputname;
	}
	public String getInputfilteredname() {
		return inputfilteredname;
	}
	public void setInputfilteredname(String inputfilteredname) {
		this.inputfilteredname = inputfilteredname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInputfirstname() {
		return inputfirstname;
	}
	public void setInputfirstname(String inputfirstname) {
		this.inputfirstname = inputfirstname;
	}
	public String getInputfilteredfirstname() {
		return inputfilteredfirstname;
	}
	public void setInputfilteredfirstname(String inputfilteredfirstname) {
		this.inputfilteredfirstname = inputfilteredfirstname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getInputlastname() {
		return inputlastname;
	}
	public void setInputlastname(String inputlastname) {
		this.inputlastname = inputlastname;
	}
	public String getInputfilteredlastname() {
		return inputfilteredlastname;
	}
	public void setInputfilteredlastname(String inputfilteredlastname) {
		this.inputfilteredlastname = inputfilteredlastname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getNamescore() {
		return namescore;
	}
	public void setNamescore(String namescore) {
		this.namescore = namescore;
	}
	public String getNamematchidentified() {
		return namematchidentified;
	}
	public void setNamematchidentified(String namematchidentified) {
		this.namematchidentified = namematchidentified;
	}
	public String getNameprovided() {
		return nameprovided;
	}
	public void setNameprovided(String nameprovided) {
		this.nameprovided = nameprovided;
	}
	public String getInputAddressLine1() {
		return inputAddressLine1;
	}
	public void setInputAddressLine1(String inputAddressLine1) {
		this.inputAddressLine1 = inputAddressLine1;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getInputAddressLine2() {
		return inputAddressLine2;
	}
	public void setInputAddressLine2(String inputAddressLine2) {
		this.inputAddressLine2 = inputAddressLine2;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getInputaddressLine3() {
		return inputaddressLine3;
	}
	public void setInputaddressLine3(String inputaddressLine3) {
		this.inputaddressLine3 = inputaddressLine3;
	}
	public String getMatchstatus() {return matchstatus;}
	public void setMatchstatus(String matchstatus) {this.matchstatus = matchstatus;}
	public String getAddressLine3() {
		return addressLine3;
	}
	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}
	public String getAddressscore() {
		return addressscore;
	}
	public void setAddressscore(String addressscore) {
		this.addressscore = addressscore;
	}
	public String getAddressmatchidentified() {
		return addressmatchidentified;
	}
	public void setAddressmatchidentified(String addressmatchidentified) {
		this.addressmatchidentified = addressmatchidentified;
	}
	public String getAddressprovided() {
		return addressprovided;
	}
	public void setAddressprovided(String addressprovided) {
		this.addressprovided = addressprovided;
	}
	public String getInputcountry() {
		return inputcountry;
	}
	public void setInputcountry(String inputcountry) {
		this.inputcountry = inputcountry;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getInputidnumber() {
		return inputidnumber;
	}
	public void setInputidnumber(String inputidnumber) {
		this.inputidnumber = inputidnumber;
	}
	public String getIdnumber() {
		return idnumber;
	}
	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}
	public String getIdnumberscore() {
		return idnumberscore;
	}
	public void setIdnumberscore(String idnumberscore) {
		this.idnumberscore = idnumberscore;
	}
	public String getIdnumbermatchidentified() {
		return idnumbermatchidentified;
	}
	public void setIdnumbermatchidentified(String idnumbermatchidentified) {
		this.idnumbermatchidentified = idnumbermatchidentified;
	}
	public String getIdnumberprovided() {
		return idnumberprovided;
	}
	public void setIdnumberprovided(String idnumberprovided) {
		this.idnumberprovided = idnumberprovided;
	}
	public String getInputplaceofbirth() {
		return inputplaceofbirth;
	}
	public void setInputplaceofbirth(String inputplaceofbirth) {
		this.inputplaceofbirth = inputplaceofbirth;
	}
	public String getPlaceofbirth() {
		return placeofbirth;
	}
	public void setPlaceofbirth(String placeofbirth) {
		this.placeofbirth = placeofbirth;
	}
	public String getPlaceofbirthscore() {
		return placeofbirthscore;
	}
	public void setPlaceofbirthscore(String placeofbirthscore) {
		this.placeofbirthscore = placeofbirthscore;
	}
	public String getPlaceofbirthmatchidentified() {
		return placeofbirthmatchidentified;
	}
	public void setPlaceofbirthmatchidentified(String placeofbirthmatchidentified) {
		this.placeofbirthmatchidentified = placeofbirthmatchidentified;
	}
	public String getPlaceofbirthprovided() {
		return placeofbirthprovided;
	}
	public void setPlaceofbirthprovided(String placeofbirthprovided) {
		this.placeofbirthprovided = placeofbirthprovided;
	}
	public String getInputdob() {
		return inputdob;
	}
	public void setInputdob(String inputdob) {
		this.inputdob = inputdob;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDobscore() {
		return dobscore;
	}
	public void setDobscore(String dobscore) {
		this.dobscore = dobscore;
	}
	public String getDobmatchidentified() {
		return dobmatchidentified;
	}
	public void setDobmatchidentified(String dobmatchidentified) {
		this.dobmatchidentified = dobmatchidentified;
	}
	public String getDobprovided() {
		return dobprovided;
	}
	public void setDobprovided(String dobprovided) {
		this.dobprovided = dobprovided;
	}
	public String getInputcitizenship() {
		return inputcitizenship;
	}
	public void setInputcitizenship(String inputcitizenship) {
		this.inputcitizenship = inputcitizenship;
	}
	public String getCitizenship() {
		return citizenship;
	}
	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}
	public String getCitizenshipscore() {
		return citizenshipscore;
	}
	public void setCitizenshipscore(String citizenshipscore) {
		this.citizenshipscore = citizenshipscore;
	}
	public String getCitizenshipmatchidentified() {
		return citizenshipmatchidentified;
	}
	public void setCitizenshipmatchidentified(String citizenshipmatchidentified) {
		this.citizenshipmatchidentified = citizenshipmatchidentified;
	}
	public String getCitizenshipprovided() {
		return citizenshipprovided;
	}
	public void setCitizenshipprovided(String citizenshipprovided) {
		this.citizenshipprovided = citizenshipprovided;
	}
	public String getInputNationality() {
		return inputNationality;
	}
	public void setInputNationality(String inputNationality) {
		this.inputNationality = inputNationality;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getNationalityscore() {
		return nationalityscore;
	}
	public void setNationalityscore(String nationalityscore) {
		this.nationalityscore = nationalityscore;
	}
	public String getNationalitymatchidentified() {
		return nationalitymatchidentified;
	}
	public void setNationalitymatchidentified(String nationalitymatchidentified) {
		this.nationalitymatchidentified = nationalitymatchidentified;
	}
	public String getNationalityprovided() {
		return nationalityprovided;
	}
	public void setNationalityprovided(String nationalityprovided) {
		this.nationalityprovided = nationalityprovided;
	}
	public String getEntryid() {
		return entryid;
	}
	public void setEntryid(String entryid) {
		this.entryid = entryid;
	}
	public String getListtype() {
		return listtype;
	}
	public void setListtype(String listtype) {
		this.listtype = listtype;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getFirmname() {
		return firmname;
	}
	public void setFirmname(String firmname) {
		this.firmname = firmname;
	}
	public String getOverallrisklevel() {
		return overallrisklevel;
	}
	public void setOverallrisklevel(String overallrisklevel) {
		this.overallrisklevel = overallrisklevel;
	}
	public String getSanctionedcountryidentified() {
		return sanctionedcountryidentified;
	}
	public void setSanctionedcountryidentified(String sanctionedcountryidentified) {
		this.sanctionedcountryidentified = sanctionedcountryidentified;
	}
	public List<UserField> getUser_fields() {
		return user_fields;
	}
	public void setUser_fields(List<UserField> user_fields) {
		this.user_fields = user_fields;
	}
	 	 
	
}
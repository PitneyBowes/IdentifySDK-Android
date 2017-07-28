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

package com.pb.identify.identifyAddress.validateMailingAddressUSCAN.model;

import com.google.gson.annotations.SerializedName;
import com.pb.identify.identifyAddress.common.BaseResponse;

/**
 * This class represents a single validated address in the response from ValidateMailingAddressUSCAN API
 *
 */
public class ValidateMailingAddressUSCANAPIResponse extends BaseResponse {

	@SerializedName(value="CouldNotValidate")
    private String couldNotValidate;
    @SerializedName(value="Confidence")
    private String Confidence;
    @SerializedName(value="RecordType")
    private String RecordType;
    @SerializedName(value="RecordType.Default")
    private String recordType_default;
    @SerializedName(value="MultipleMatches")
    private String MultipleMatches;
    @SerializedName(value="CountryLevel")
    private String CountryLevel;
    @SerializedName(value="AddressFormat")
    private String AddressFormat;
    @SerializedName(value="AddressLine3")
    private String AddressLine3;
    @SerializedName(value="AddressLine4")
    private String AddressLine4;
    @SerializedName(value="HouseNumber")
    private String houseNumber;
    @SerializedName(value="LeadingDirectional")
    private String leadingDirectional;
    @SerializedName(value="StreetName")
    private String streetName;
    @SerializedName(value="StreetSuffix")
    private String streetSuffix;
    @SerializedName(value="TrailingDirectional")
    private String trailingDirectional;
    @SerializedName(value="ApartmentLabel")
    private String apartmentLabel;
    @SerializedName(value="ApartmentNumber")
    private String apartmentNumber;
    @SerializedName(value="RRHC")
    private String rrhc;
    @SerializedName(value="POBox")
    private String poBox;
    @SerializedName(value="PrivateMailbox")
    private String privateMailbox;
    @SerializedName(value="PrivateMailbox.Type")
    private String privateMailbox_type;
    @SerializedName(value="HouseNumber.Input")
    private String houseNumber_input;
    @SerializedName(value="LeadingDirectional.Input")
    private String leadingDirectional_input;
    @SerializedName(value="StreetName.Input")
    private String streetName_input;
    @SerializedName(value="StreetSuffix.Input")
    private String streetSuffix_input;
    @SerializedName(value="TrailingDirectional.Input")
    private String trailingDirectional_input;
    @SerializedName(value="ApartmentLabel.Input")
    private String apartmentLabel_input;
    @SerializedName(value="ApartmentNumber.Input")
    private String apartmentNumber_input;
    @SerializedName(value="RRHC.Input")
    private String rrhc_input;
    @SerializedName(value="POBox.Input")
    private String poBox_input;
    @SerializedName(value="PrivateMailbox.Input")
    private String privateMailbox_input;
    @SerializedName(value="PrivateMailbox.Type.Input")
    private String privateMailbox_type_input;
    @SerializedName(value="City.Input")
    private String city_input;
    @SerializedName(value="StateProvince.Input")
    private String stateProvince_input;
    @SerializedName(value="PostalCode.Input")
    private String postalCode_input;
    @SerializedName(value="Country.Input")
    private String country_input;
    @SerializedName(value="FirmName.Input")
    private String firmName_input;
    @SerializedName(value="HouseNumber.Result")
    private String houseNumber_result;
    @SerializedName(value="LeadingDirectional.Result")
    private String leadingDirectional_result;
    @SerializedName(value="Street.Result")
    private String street_result;
    @SerializedName(value="StreetName.Result")
    private String streetName_result;
    @SerializedName(value="StreetName.Alias.Type")
    private String streetName_alias_type;
    @SerializedName(value="StreetSuffix.Result")
    private String streetSuffix_result;
    @SerializedName(value="TrailingDirectional.Result")
    private String trailingDirectional_result;
    @SerializedName(value="ApartmentLabel.Result")
    private String apartmentLabel_result;
    @SerializedName(value="ApartmentNumber.Result")
    private String apartmentNumber_result;
    @SerializedName(value="RRHC.Result")
    private String rrhc_result;
    @SerializedName(value="RRHC.Type")
    private String rrhc_type;
    @SerializedName(value="POBox.Result")
    private String poBox_result;
    @SerializedName(value="City.Result")
    private String city_result;
    @SerializedName(value="StateProvince.Result")
    private String stateProvince_result;
    @SerializedName(value="PostalCode.Result")
    private String postalCode_result;
    @SerializedName(value="PostalCodeCity.Result")
    private String postalCodeCity_result;
    @SerializedName(value="AddressRecord.Result")
    private String addressRecord_result;
    @SerializedName(value="PostalCode.Source")
    private String postalCode_source;
    @SerializedName(value="PostalCode.Type")
    private String postalCode_type;
    @SerializedName(value="Country.Result")
    private String country_result;
    @SerializedName(value="FirmName.Result")
    private String firmName_result;
    @SerializedName(value="StreetNamePreferredAlias.Result")
    private String streetNamePreferredAlias_result;
    @SerializedName(value="StreetNameAbbreviatedAlias.Result")
    private String streetNameAbbreviatedAlias_result;
    @SerializedName(value="MatchScore")
    private String matchScore;
    @SerializedName(value="USLACS")
    private String uSLACS;
    @SerializedName(value="USLACS.ReturnCode")
    private String USLACS_ReturnCode;
    @SerializedName(value="RDI")
    private String rdi;
    @SerializedName(value="DPV")
    private String dpv;
    @SerializedName(value="CMRA")
    private String cmra;
    @SerializedName(value="DPVFootnote")
    private String dPVFootnote;
    @SerializedName(value="SuiteLinkReturnCode")
    private String suiteLinkReturnCode;
    @SerializedName(value="SuiteLinkMatchCode")
    private String suiteLinkMatchCode;
    @SerializedName(value="SuiteLinkFidelity")
    private String suiteLinkFidelity;
    @SerializedName(value="USBCCheckDigit")
    private String uSBCCheckDigit;
    @SerializedName(value="PostalBarCode")
    private String postalBarCode;
    @SerializedName(value="USCarrierRouteCode")
    private String uSCarrierRouteCode;
    @SerializedName(value="USFIPSCountyNumber")
    private String uSFIPSCountyNumber;
    @SerializedName(value="USCountyName")
    private String uSCountyName;
    @SerializedName(value="USCongressionalDistrict")
    private String uSCongressionalDistrict;
    @SerializedName(value="USAltAddr")
    private String uSAltAddr;
    @SerializedName(value="USLastLineNumber")
    private String uSLastLineNumber;
    @SerializedName(value="USFinanceNumber")
    private String uSFinanceNumber;
    @SerializedName(value="AddressBlock1")
    private String addressBlock1;
    @SerializedName(value="AddressBlock2")
    private String addressBlock2;
    @SerializedName(value="AddressBlock3")
    private String addressBlock3;
    @SerializedName(value="AddressBlock4")
    private String addressBlock4;
    @SerializedName(value="AddressBlock5")
    private String addressBlock5;
    @SerializedName(value="AddressBlock6")
    private String addressBlock6;
    @SerializedName(value="AddressBlock7")
    private String addressBlock7;
    @SerializedName(value="AddressBlock8")
    private String addressBlock8;
    @SerializedName(value="AddressBlock9")
    private String addressBlock9;
    @SerializedName(value="CanadianSERPCode")
    private String canadianSERPCode;
    @SerializedName(value="CanLanguage")
    private String canLanguage;
    @SerializedName(value="DPVNoStat")
    private String dPVNoStat;
    @SerializedName(value="DPVVacant")
    private String dPVVacant;
    
	public String getCouldNotValidate() {
		return couldNotValidate;
	}
	public void setCouldNotValidate(String couldNotValidate) {
		this.couldNotValidate = couldNotValidate;
	}
	
	public String getConfidence() {
		return Confidence;
	}
	public void setConfidence(String confidence) {
		Confidence = confidence;
	}
	public String getRecordType() {
		return RecordType;
	}
	public void setRecordType(String recordType) {
		RecordType = recordType;
	}
	public String getRecordType_default() {
		return recordType_default;
	}
	public void setRecordType_default(String recordType_default) {
		this.recordType_default = recordType_default;
	}
	public String getMultipleMatches() {
		return MultipleMatches;
	}
	public void setMultipleMatches(String multipleMatches) {
		MultipleMatches = multipleMatches;
	}
	public String getCountryLevel() {
		return CountryLevel;
	}
	public void setCountryLevel(String countryLevel) {
		CountryLevel = countryLevel;
	}
	public String getAddressFormat() {
		return AddressFormat;
	}
	public void setAddressFormat(String addressFormat) {
		AddressFormat = addressFormat;
	}
	public String getAddressLine3() {
		return AddressLine3;
	}
	public void setAddressLine3(String addressLine3) {
		AddressLine3 = addressLine3;
	}
	public String getAddressLine4() {
		return AddressLine4;
	}
	public void setAddressLine4(String addressLine4) {
		AddressLine4 = addressLine4;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getLeadingDirectional() {
		return leadingDirectional;
	}
	public void setLeadingDirectional(String leadingDirectional) {
		this.leadingDirectional = leadingDirectional;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getStreetSuffix() {
		return streetSuffix;
	}
	public void setStreetSuffix(String streetSuffix) {
		this.streetSuffix = streetSuffix;
	}
	public String getTrailingDirectional() {
		return trailingDirectional;
	}
	public void setTrailingDirectional(String trailingDirectional) {
		this.trailingDirectional = trailingDirectional;
	}
	

	public String getApartmentNumber() {
		return apartmentNumber;
	}
	public void setApartmentNumber(String apartmentNumber) {
		this.apartmentNumber = apartmentNumber;
	}
	
	public String getRrhc() {
		return rrhc;
	}
	public void setRrhc(String rrhc) {
		this.rrhc = rrhc;
	}
	public String getPoBox() {
		return poBox;
	}
	public void setPoBox(String poBox) {
		this.poBox = poBox;
	}
	public String getPrivateMailbox() {
		return privateMailbox;
	}
	public void setPrivateMailbox(String privateMailbox) {
		this.privateMailbox = privateMailbox;
	}
	public String getPrivateMailbox_type() {
		return privateMailbox_type;
	}
	public void setPrivateMailbox_type(String privateMailbox_type) {
		this.privateMailbox_type = privateMailbox_type;
	}
	public String getHouseNumber_input() {
		return houseNumber_input;
	}
	public void setHouseNumber_input(String houseNumber_input) {
		this.houseNumber_input = houseNumber_input;
	}
	public String getLeadingDirectional_input() {
		return leadingDirectional_input;
	}
	public void setLeadingDirectional_input(String leadingDirectional_input) {
		this.leadingDirectional_input = leadingDirectional_input;
	}
	public String getStreetName_input() {
		return streetName_input;
	}
	public void setStreetName_input(String streetName_input) {
		this.streetName_input = streetName_input;
	}
	public String getTrailingDirectional_input() {
		return trailingDirectional_input;
	}
	public void setTrailingDirectional_input(String trailingDirectional_input) {
		this.trailingDirectional_input = trailingDirectional_input;
	}
	public String getApartmentLabel_input() {
		return apartmentLabel_input;
	}
	public void setApartmentLabel_input(String apartmentLabel_input) {
		this.apartmentLabel_input = apartmentLabel_input;
	}
	public String getApartmentNumber_input() {
		return apartmentNumber_input;
	}
	public void setApartmentNumber_input(String apartmentNumber_input) {
		this.apartmentNumber_input = apartmentNumber_input;
	}
	public String getRrhc_input() {
		return rrhc_input;
	}
	public void setRrhc_input(String rrhc_input) {
		this.rrhc_input = rrhc_input;
	}
	public String getPoBox_input() {
		return poBox_input;
	}
	public void setPoBox_input(String poBox_input) {
		this.poBox_input = poBox_input;
	}
	public String getPrivateMailbox_input() {
		return privateMailbox_input;
	}
	public void setPrivateMailbox_input(String privateMailbox_input) {
		this.privateMailbox_input = privateMailbox_input;
	}
	public String getPrivateMailbox_type_input() {
		return privateMailbox_type_input;
	}
	public void setPrivateMailbox_type_input(String privateMailbox_type_input) {
		this.privateMailbox_type_input = privateMailbox_type_input;
	}
	public String getCity_input() {
		return city_input;
	}
	public void setCity_input(String city_input) {
		this.city_input = city_input;
	}
	public String getStateProvince_input() {
		return stateProvince_input;
	}
	public void setStateProvince_input(String stateProvince_input) {
		this.stateProvince_input = stateProvince_input;
	}
	public String getPostalCode_input() {
		return postalCode_input;
	}
	public void setPostalCode_input(String postalCode_input) {
		this.postalCode_input = postalCode_input;
	}
	public String getCountry_input() {
		return country_input;
	}
	public void setCountry_input(String country_input) {
		this.country_input = country_input;
	}
	public String getFirmName_input() {
		return firmName_input;
	}
	public void setFirmName_input(String firmName_input) {
		this.firmName_input = firmName_input;
	}
	public String getHouseNumber_result() {
		return houseNumber_result;
	}
	public void setHouseNumber_result(String houseNumber_result) {
		this.houseNumber_result = houseNumber_result;
	}
	public String getLeadingDirectional_result() {
		return leadingDirectional_result;
	}
	public void setLeadingDirectional_result(String leadingDirectional_result) {
		this.leadingDirectional_result = leadingDirectional_result;
	}
	public String getStreet_result() {
		return street_result;
	}
	public void setStreet_result(String street_result) {
		this.street_result = street_result;
	}
	public String getStreetName_result() {
		return streetName_result;
	}
	public void setStreetName_result(String streetName_result) {
		this.streetName_result = streetName_result;
	}
	public String getStreetName_alias_type() {
		return streetName_alias_type;
	}
	public void setStreetName_alias_type(String streetName_alias_type) {
		this.streetName_alias_type = streetName_alias_type;
	}
	public String getStreetSuffix_result() {
		return streetSuffix_result;
	}
	public void setStreetSuffix_result(String streetSuffix_result) {
		this.streetSuffix_result = streetSuffix_result;
	}
	public String getTrailingDirectional_result() {
		return trailingDirectional_result;
	}
	public void setTrailingDirectional_result(String trailingDirectional_result) {
		this.trailingDirectional_result = trailingDirectional_result;
	}
	public String getApartmentLabel_result() {
		return apartmentLabel_result;
	}
	public void setApartmentLabel_result(String apartmentLabel_result) {
		this.apartmentLabel_result = apartmentLabel_result;
	}
	public String getApartmentNumber_result() {
		return apartmentNumber_result;
	}
	public void setApartmentNumber_result(String apartmentNumber_result) {
		this.apartmentNumber_result = apartmentNumber_result;
	}
	
	public String getRrhc_result() {
		return rrhc_result;
	}
	public void setRrhc_result(String rrhc_result) {
		this.rrhc_result = rrhc_result;
	}
	public String getRrhc_type() {
		return rrhc_type;
	}
	public void setRrhc_type(String rrhc_type) {
		this.rrhc_type = rrhc_type;
	}
	public String getPoBox_result() {
		return poBox_result;
	}
	public void setPoBox_result(String poBox_result) {
		this.poBox_result = poBox_result;
	}
	public String getCity_result() {
		return city_result;
	}
	public void setCity_result(String city_result) {
		this.city_result = city_result;
	}
	public String getStateProvince_result() {
		return stateProvince_result;
	}
	public void setStateProvince_result(String stateProvince_result) {
		this.stateProvince_result = stateProvince_result;
	}
	public String getPostalCode_result() {
		return postalCode_result;
	}
	public void setPostalCode_result(String postalCode_result) {
		this.postalCode_result = postalCode_result;
	}
	public String getPostalCodeCity_result() {
		return postalCodeCity_result;
	}
	public void setPostalCodeCity_result(String postalCodeCity_result) {
		this.postalCodeCity_result = postalCodeCity_result;
	}
	public String getAddressRecord_result() {
		return addressRecord_result;
	}
	public void setAddressRecord_result(String addressRecord_result) {
		this.addressRecord_result = addressRecord_result;
	}
	public String getPostalCode_source() {
		return postalCode_source;
	}
	public void setPostalCode_source(String postalCode_source) {
		this.postalCode_source = postalCode_source;
	}
	public String getPostalCode_type() {
		return postalCode_type;
	}
	public void setPostalCode_type(String postalCode_type) {
		this.postalCode_type = postalCode_type;
	}
	public String getCountry_result() {
		return country_result;
	}
	public void setCountry_result(String country_result) {
		this.country_result = country_result;
	}
	public String getFirmName_result() {
		return firmName_result;
	}
	public void setFirmName_result(String firmName_result) {
		this.firmName_result = firmName_result;
	}
	public String getStreetNamePreferredAlias_result() {
		return streetNamePreferredAlias_result;
	}
	public void setStreetNamePreferredAlias_result(
			String streetNamePreferredAlias_result) {
		this.streetNamePreferredAlias_result = streetNamePreferredAlias_result;
	}
	public String getStreetNameAbbreviatedAlias_result() {
		return streetNameAbbreviatedAlias_result;
	}
	public void setStreetNameAbbreviatedAlias_result(
			String streetNameAbbreviatedAlias_result) {
		this.streetNameAbbreviatedAlias_result = streetNameAbbreviatedAlias_result;
	}
	
	public String getStreetSuffix_input() {
		return streetSuffix_input;
	}
	public void setStreetSuffix_input(String streetSuffix_input) {
		this.streetSuffix_input = streetSuffix_input;
	}
	public String getApartmentLabel() {
		return apartmentLabel;
	}
	public void setApartmentLabel(String apartmentLabel) {
		this.apartmentLabel = apartmentLabel;
	}
	public String getMatchScore() {
		return matchScore;
	}
	public void setMatchScore(String matchScore) {
		this.matchScore = matchScore;
	}
	public String getuSLACS() {
		return uSLACS;
	}
	public void setuSLACS(String uSLACS) {
		this.uSLACS = uSLACS;
	}
	public String getUSLACS_ReturnCode() {
		return USLACS_ReturnCode;
	}
	public void setUSLACS_ReturnCode(String uSLACS_ReturnCode) {
		USLACS_ReturnCode = uSLACS_ReturnCode;
	}
	public String getRdi() {
		return rdi;
	}
	public void setRdi(String rdi) {
		this.rdi = rdi;
	}
	public String getDpv() {
		return dpv;
	}
	public void setDpv(String dpv) {
		this.dpv = dpv;
	}
	public String getCmra() {
		return cmra;
	}
	public void setCmra(String cmra) {
		this.cmra = cmra;
	}

	public String getSuiteLinkReturnCode() {
		return suiteLinkReturnCode;
	}
	public void setSuiteLinkReturnCode(String suiteLinkReturnCode) {
		suiteLinkReturnCode = suiteLinkReturnCode;
	}
	public String getSuiteLinkMatchCode() {
		return suiteLinkMatchCode;
	}
	public void setSuiteLinkMatchCode(String suiteLinkMatchCode) {
		suiteLinkMatchCode = suiteLinkMatchCode;
	}
	public String getSuiteLinkFidelity() {
		return suiteLinkFidelity;
	}
	public void setSuiteLinkFidelity(String suiteLinkFidelity) {
		suiteLinkFidelity = suiteLinkFidelity;
	}
	public String getdPVFootnote() {
		return dPVFootnote;
	}
	public void setdPVFootnote(String dPVFootnote) {
		this.dPVFootnote = dPVFootnote;
	}
	public String getuSBCCheckDigit() {
		return uSBCCheckDigit;
	}
	public void setuSBCCheckDigit(String uSBCCheckDigit) {
		this.uSBCCheckDigit = uSBCCheckDigit;
	}
	public String getPostalBarCode() {
		return postalBarCode;
	}
	public void setPostalBarCode(String postalBarCode) {
		this.postalBarCode = postalBarCode;
	}
	public String getuSCarrierRouteCode() {
		return uSCarrierRouteCode;
	}
	public void setuSCarrierRouteCode(String uSCarrierRouteCode) {
		this.uSCarrierRouteCode = uSCarrierRouteCode;
	}
	public String getuSFIPSCountyNumber() {
		return uSFIPSCountyNumber;
	}
	public void setuSFIPSCountyNumber(String uSFIPSCountyNumber) {
		this.uSFIPSCountyNumber = uSFIPSCountyNumber;
	}
	public String getuSCountyName() {
		return uSCountyName;
	}
	public void setuSCountyName(String uSCountyName) {
		this.uSCountyName = uSCountyName;
	}
	public String getuSCongressionalDistrict() {
		return uSCongressionalDistrict;
	}
	public void setuSCongressionalDistrict(String uSCongressionalDistrict) {
		this.uSCongressionalDistrict = uSCongressionalDistrict;
	}
	public String getuSAltAddr() {
		return uSAltAddr;
	}
	public void setuSAltAddr(String uSAltAddr) {
		this.uSAltAddr = uSAltAddr;
	}
	public String getuSLastLineNumber() {
		return uSLastLineNumber;
	}
	public void setuSLastLineNumber(String uSLastLineNumber) {
		this.uSLastLineNumber = uSLastLineNumber;
	}
	public String getuSFinanceNumber() {
		return uSFinanceNumber;
	}
	public void setuSFinanceNumber(String uSFinanceNumber) {
		this.uSFinanceNumber = uSFinanceNumber;
	}
	public String getAddressBlock1() {
		return addressBlock1;
	}
	public void setAddressBlock1(String addressBlock1) {
		this.addressBlock1 = addressBlock1;
	}
	public String getAddressBlock2() {
		return addressBlock2;
	}
	public void setAddressBlock2(String addressBlock2) {
		this.addressBlock2 = addressBlock2;
	}
	public String getAddressBlock3() {
		return addressBlock3;
	}
	public void setAddressBlock3(String addressBlock3) {
		this.addressBlock3 = addressBlock3;
	}
	public String getAddressBlock4() {
		return addressBlock4;
	}
	public void setAddressBlock4(String addressBlock4) {
		this.addressBlock4 = addressBlock4;
	}
	public String getAddressBlock5() {
		return addressBlock5;
	}
	public void setAddressBlock5(String addressBlock5) {
		this.addressBlock5 = addressBlock5;
	}
	public String getAddressBlock6() {
		return addressBlock6;
	}
	public void setAddressBlock6(String addressBlock6) {
		this.addressBlock6 = addressBlock6;
	}
	public String getAddressBlock7() {
		return addressBlock7;
	}
	public void setAddressBlock7(String addressBlock7) {
		this.addressBlock7 = addressBlock7;
	}
	public String getAddressBlock8() {
		return addressBlock8;
	}
	public void setAddressBlock8(String addressBlock8) {
		this.addressBlock8 = addressBlock8;
	}
	public String getAddressBlock9() {
		return addressBlock9;
	}
	public void setAddressBlock9(String addressBlock9) {
		this.addressBlock9 = addressBlock9;
	}
	public String getCanadianSERPCode() {
		return canadianSERPCode;
	}
	public void setCanadianSERPCode(String canadianSERPCode) {
		this.canadianSERPCode = canadianSERPCode;
	}

    public String getCanLanguage() {
		return canLanguage;
	}
	public void setCanLanguage(String canLanguage) {
		this.canLanguage = canLanguage;
	}
	public String getdPVNoStat() {
		return dPVNoStat;
	}
	public void setdPVNoStat(String dPVNoStat) {
		this.dPVNoStat = dPVNoStat;
	}
	public String getdPVVacant() {
		return dPVVacant;
	}
	public void setdPVVacant(String dPVVacant) {
		this.dPVVacant = dPVVacant;
	}
	
	
}

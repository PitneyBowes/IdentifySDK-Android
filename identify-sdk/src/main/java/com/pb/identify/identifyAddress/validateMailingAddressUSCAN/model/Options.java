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

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.google.gson.annotations.SerializedName;

import com.pb.identify.identifyAddress.common.*;

/**
 * Model class for ValidateMailingAddressUSCAN input options
 *
 */
public class Options extends BaseOptions {
	
	public Options(OutputCasing outputCasing, KeepMultimatch keepMultimatch, OutputAddressBlocks outputAddressBlocks,
			OutputCountryFormat outputCountryFormat, Set<OutputRecordType> outputRecordType, OutputFieldLevelReturnCodes outputFieldLevelReturnCodes,int maximumResults, DPVDetermineNoStat dPVDetermineNoStat,
StreetMatchingStrictness streetMatchingStrictness,CanFrenchApartmentLabel canFrenchApartmentLabel,OutputAbbreviatedAlias outputAbbreviatedAlias,DPVSuccessfulStatusCondition dPVSuccessfulStatusCondition,String standardAddressPMBLine,FirmMatchingStrictness firmMatchingStrictness,CanRuralRouteFormat canRuralRouteFormat,CanPreferHouseNum canPreferHouseNum,OutputPreferredAlias outputPreferredAlias,DirectionalMatchingStrictness directionalMatchingStrictness,ExtractFirm extractFirm,FailOnCMRAMatch failOnCMRAMatch,CanNonCivicFormat canNonCivicFormat,CanSSLVRFlg canSSLVRFlg,OutputStreetNameAlias outputStreetNameAlias,PerformEWS performEWS,CanOutputCityFormat canOutputCityFormat,DualAddressLogic dualAddressLogic,PerformSuiteLink performSuiteLink,CanStandardAddressFormat canStandardAddressFormat,OutputPreferredCity outputPreferredCity,OutputMultinationalCharacters outputMultinationalCharacters,CanDeliveryOfficeFormat canDeliveryOfficeFormat,PerformLACSLink performLACSLink,CanDualAddressLogic canDualAddressLogic,ExtractUrb extractUrb,StandardAddressFormat standardAddressFormat,CanFrenchFormat canFrenchFormat,DPVDetermineVacancy dPVDetermineVacancy,CanEnglishApartmentLabel canEnglishApartmentLabel,SuppressZplusPhantomCarrierR777 suppressZplusPhantomCarrierR777,CanOutputCityAlias canOutputCityAlias,OutputShortCityName outputShortCityName
){
		this.setOutputCasing(outputCasing);
		this.setKeepMultimatch(keepMultimatch);
		this.setOutputAddressBlocks(outputAddressBlocks);
		this.setOutputCountryFormat(outputCountryFormat);
		this.setOutputRecordType(outputRecordType);
		this.setOutputFieldLevelReturnCodes(outputFieldLevelReturnCodes);
		this.setMaximumResults(Integer.toString(maximumResults));
		this.setCanDeliveryOfficeFormat(canDeliveryOfficeFormat);
		this.setCanDualAddressLogic(canDualAddressLogic);
		this.setCanEnglishApartmentLabel(canEnglishApartmentLabel);
		this.setCanFrenchApartmentLabel(canFrenchApartmentLabel);
		this.setCanFrenchFormat(canFrenchFormat);
		this.setCanNonCivicFormat(canNonCivicFormat);
		this.setCanOutputCityAlias(canOutputCityAlias);
		this.setCanOutputCityFormat(canOutputCityFormat);
		this.setCanPreferHouseNum(canPreferHouseNum);
		this.setCanRuralRouteFormat(canRuralRouteFormat);
		this.setCanSSLVRFlg(canSSLVRFlg);
		this.setCanStandardAddressFormat(canStandardAddressFormat);
		this.setDirectionalMatchingStrictness(directionalMatchingStrictness);
		this.setdPVDetermineNoStat(dPVDetermineNoStat);
		this.setdPVDetermineVacancy(dPVDetermineVacancy);
		this.setdPVSuccessfulStatusCondition(dPVSuccessfulStatusCondition);
		this.setDualAddressLogic(dualAddressLogic);
		this.setExtractFirm(extractFirm);
		this.setExtractUrb(extractUrb);
		this.setFailOnCMRAMatch(failOnCMRAMatch);
		this.setFirmMatchingStrictness(firmMatchingStrictness);
		this.setOutputAbbreviatedAlias(outputAbbreviatedAlias);
		this.setOutputMultinationalCharacters(outputMultinationalCharacters);
		this.setOutputPreferredAlias(outputPreferredAlias);
		this.setOutputPreferredCity(outputPreferredCity);
		this.setOutputShortCityName(outputShortCityName);
		this.setOutputStreetNameAlias(outputStreetNameAlias);
		this.setPerformEWS(performEWS);
		this.setPerformLACSLink(performLACSLink);
		this.setPerformSuiteLink(performSuiteLink);
		this.setStandardAddressFormat(standardAddressFormat);
		this.setStandardAddressPMBLine(standardAddressPMBLine);
		this.setStreetMatchingStrictness(streetMatchingStrictness);
		this.setSuppressZplusPhantomCarrierR777(suppressZplusPhantomCarrierR777);
		
	}
	
	public Options()
	{
		Set<OutputRecordType> outputRecordTypeSet = new HashSet<OutputRecordType>(Arrays.asList(OutputRecordType.A));
		this.setOutputCasing(OutputCasing.M);
		this.setKeepMultimatch(KeepMultimatch.N);
		this.setOutputAddressBlocks(OutputAddressBlocks.Y);
		this.setOutputCountryFormat(OutputCountryFormat.E);
		this.setOutputRecordType(outputRecordTypeSet);
		this.setOutputFieldLevelReturnCodes(OutputFieldLevelReturnCodes.N);
		this.setMaximumResults("10");
		this.setCanDeliveryOfficeFormat(CanDeliveryOfficeFormat.I);
		this.setCanDualAddressLogic(CanDualAddressLogic.D);
		this.setCanEnglishApartmentLabel(CanEnglishApartmentLabel.Apt);
		this.setCanFrenchApartmentLabel(CanFrenchApartmentLabel.Appartement);
		this.setCanFrenchFormat(CanFrenchFormat.C);
		this.setCanNonCivicFormat(CanNonCivicFormat.A);
		this.setCanOutputCityAlias(CanOutputCityAlias.N);
		this.setCanOutputCityFormat(CanOutputCityFormat.D);
		this.setCanPreferHouseNum(CanPreferHouseNum.N);
		this.setCanRuralRouteFormat(CanRuralRouteFormat.A);
		this.setCanSSLVRFlg(CanSSLVRFlg.N);
		this.setCanStandardAddressFormat(CanStandardAddressFormat.D);
		this.setDirectionalMatchingStrictness(DirectionalMatchingStrictness.M);
		this.setdPVDetermineNoStat(DPVDetermineNoStat.N);
		this.setdPVDetermineVacancy(DPVDetermineVacancy.N);
		this.setdPVSuccessfulStatusCondition(DPVSuccessfulStatusCondition.A);
		this.setDualAddressLogic(DualAddressLogic.N);
		this.setExtractFirm(ExtractFirm.N);
		this.setExtractUrb(ExtractUrb.N);
		this.setFailOnCMRAMatch(FailOnCMRAMatch.N);
		this.setFirmMatchingStrictness(FirmMatchingStrictness.M);
		this.setOutputAbbreviatedAlias(OutputAbbreviatedAlias.N);
		this.setOutputMultinationalCharacters(OutputMultinationalCharacters.N);
		this.setOutputPreferredAlias(OutputPreferredAlias.N);
		this.setOutputPreferredCity(OutputPreferredCity.Z);
		this.setOutputShortCityName(OutputShortCityName.N);
		this.setOutputStreetNameAlias(OutputStreetNameAlias.Y);
		this.setPerformEWS(PerformEWS.N);
		this.setPerformLACSLink(PerformLACSLink.Y);
		this.setPerformSuiteLink(PerformSuiteLink.N);
		this.setStandardAddressFormat(StandardAddressFormat.C);
		this.setStandardAddressPMBLine("N");
		this.setStreetMatchingStrictness(StreetMatchingStrictness.M);
		this.setSuppressZplusPhantomCarrierR777(SuppressZplusPhantomCarrierR777.N);
	
	}

	@SerializedName(value="MaximumResults")
	private String maximumResults;
	@SerializedName(value="KeepMultimatch")
	private KeepMultimatch keepMultimatch;
	@SerializedName(value="OutputCountryFormat")
	private OutputCountryFormat outputCountryFormat;
	@SerializedName(value="OutputAddressBlocks")
	private OutputAddressBlocks outputAddressBlocks;
	@SerializedName(value="OutputRecordType")
	private String outputRecordType;
	@SerializedName(value="OutputFieldLevelReturnCodes")
	private OutputFieldLevelReturnCodes outputFieldLevelReturnCodes;
	
	@SerializedName(value="DPVDetermineNoStat")
	private DPVDetermineNoStat dPVDetermineNoStat;
	@SerializedName(value="StreetMatchingStrictness")
	private StreetMatchingStrictness streetMatchingStrictness;
	@SerializedName(value="CanFrenchApartmentLabel")
	private CanFrenchApartmentLabel canFrenchApartmentLabel;
	@SerializedName(value="OutputAbbreviatedAlias")
	private OutputAbbreviatedAlias outputAbbreviatedAlias;
	@SerializedName(value="DPVSuccessfulStatusCondition")
	private DPVSuccessfulStatusCondition dPVSuccessfulStatusCondition;
	@SerializedName(value="StandardAddressPMBLine")
	private String standardAddressPMBLine;
	@SerializedName(value="FirmMatchingStrictness")
	private FirmMatchingStrictness firmMatchingStrictness;
	
	@SerializedName(value="CanRuralRouteFormat")
	private CanRuralRouteFormat canRuralRouteFormat;
	@SerializedName(value="CanPreferHouseNum")
	private CanPreferHouseNum canPreferHouseNum;
	@SerializedName(value="OutputPreferredAlias")
	private OutputPreferredAlias outputPreferredAlias;
	@SerializedName(value="DirectionalMatchingStrictness")
	private DirectionalMatchingStrictness directionalMatchingStrictness;
	@SerializedName(value="ExtractFirm")
	private ExtractFirm ExtractFirm;
	@SerializedName(value="FailOnCMRAMatch")
	private FailOnCMRAMatch failOnCMRAMatch;
	@SerializedName(value="CanNonCivicFormat")
	private CanNonCivicFormat canNonCivicFormat;
	
	
	@SerializedName(value="CanSSLVRFlg")
	private CanSSLVRFlg canSSLVRFlg;
	@SerializedName(value="OutputStreetNameAlias")
	private OutputStreetNameAlias outputStreetNameAlias;
	@SerializedName(value="PerformEWS")
	private PerformEWS performEWS;
	@SerializedName(value="CanOutputCityFormat")
	private CanOutputCityFormat canOutputCityFormat;
	@SerializedName(value="DualAddressLogic")
	private DualAddressLogic dualAddressLogic;
	@SerializedName(value="PerformSuiteLink")
	private PerformSuiteLink performSuiteLink;

	@SerializedName(value="CanStandardAddressFormat")
	private CanStandardAddressFormat canStandardAddressFormat;
	@SerializedName(value="OutputPreferredCity")
	private OutputPreferredCity outputPreferredCity;
	@SerializedName(value="OutputMultinationalCharacters")
	private OutputMultinationalCharacters outputMultinationalCharacters;
	@SerializedName(value="CanDeliveryOfficeFormat")
	private CanDeliveryOfficeFormat canDeliveryOfficeFormat;
	@SerializedName(value="PerformLACSLink")
	private PerformLACSLink performLACSLink;
	@SerializedName(value="CanDualAddressLogic")
	private CanDualAddressLogic canDualAddressLogic;
	@SerializedName(value="ExtractUrb")
	private ExtractUrb extractUrb;
	
	@SerializedName(value="StandardAddressFormat")
	private StandardAddressFormat standardAddressFormat;
	@SerializedName(value="CanFrenchFormat")
	private CanFrenchFormat canFrenchFormat;
	@SerializedName(value="DPVDetermineVacancy")
	private DPVDetermineVacancy dPVDetermineVacancy;
	@SerializedName(value="CanEnglishApartmentLabel")
	private CanEnglishApartmentLabel canEnglishApartmentLabel;
	@SerializedName(value="SuppressZplusPhantomCarrierR777")
	private SuppressZplusPhantomCarrierR777 suppressZplusPhantomCarrierR777;
	@SerializedName(value="CanOutputCityAlias")
	private CanOutputCityAlias canOutputCityAlias;
	@SerializedName(value="OutputShortCityName")
	private OutputShortCityName outputShortCityName;

	
	public String getMaximumResults() {
		return maximumResults;
	}

	public void setMaximumResults(String maximumResults) {
		this.maximumResults = maximumResults;
	}

	public KeepMultimatch getKeepMultimatch() {
		return keepMultimatch;
	}

	public void setKeepMultimatch(KeepMultimatch keepMultimatch) {
		this.keepMultimatch = keepMultimatch;
	}

	public OutputCountryFormat getOutputCountryFormat() {
		return outputCountryFormat;
	}

	public void setOutputCountryFormat(OutputCountryFormat outputCountryFormat) {
		this.outputCountryFormat = outputCountryFormat;
	}

	
	public OutputAddressBlocks getOutputAddressBlocks() {
		return outputAddressBlocks;
	}

	public void setOutputAddressBlocks(OutputAddressBlocks outputAddressBlocks) {
		this.outputAddressBlocks = outputAddressBlocks;
	}

	public String getOutputRecordType() {
		return outputRecordType;
	}

	public void setOutputRecordType(Set<OutputRecordType> outputRecordType) {
		StringBuilder sOutputRecordType = new StringBuilder();
		for(OutputRecordType o : outputRecordType)
		{
			sOutputRecordType.append(o.toString());
		}
		this.outputRecordType = sOutputRecordType.toString();
	}

	public OutputFieldLevelReturnCodes getOutputFieldLevelReturnCodes() {
		return outputFieldLevelReturnCodes;
	}

	public void setOutputFieldLevelReturnCodes(
			OutputFieldLevelReturnCodes outputFieldLevelReturnCodes) {
		this.outputFieldLevelReturnCodes = outputFieldLevelReturnCodes;
	}

	public DPVDetermineNoStat getdPVDetermineNoStat() {
		return dPVDetermineNoStat;
	}

	public void setdPVDetermineNoStat(DPVDetermineNoStat dPVDetermineNoStat) {
		this.dPVDetermineNoStat = dPVDetermineNoStat;
	}

	public StreetMatchingStrictness getStreetMatchingStrictness() {
		return streetMatchingStrictness;
	}

	public void setStreetMatchingStrictness(StreetMatchingStrictness streetMatchingStrictness) {
		this.streetMatchingStrictness = streetMatchingStrictness;
	}

	public CanFrenchApartmentLabel getCanFrenchApartmentLabel() {
		return canFrenchApartmentLabel;
	}

	public void setCanFrenchApartmentLabel(CanFrenchApartmentLabel canFrenchApartmentLabel) {
		this.canFrenchApartmentLabel = canFrenchApartmentLabel;
	}

	public OutputAbbreviatedAlias getOutputAbbreviatedAlias() {
		return outputAbbreviatedAlias;
	}

	public void setOutputAbbreviatedAlias(OutputAbbreviatedAlias outputAbbreviatedAlias) {
		this.outputAbbreviatedAlias = outputAbbreviatedAlias;
	}

	public DPVSuccessfulStatusCondition getdPVSuccessfulStatusCondition() {
		return dPVSuccessfulStatusCondition;
	}

	public void setdPVSuccessfulStatusCondition(DPVSuccessfulStatusCondition dPVSuccessfulStatusCondition) {
		this.dPVSuccessfulStatusCondition = dPVSuccessfulStatusCondition;
	}

	public String getStandardAddressPMBLine() {
		return standardAddressPMBLine;
	}

	public void setStandardAddressPMBLine(String standardAddressPMBLine) {
		this.standardAddressPMBLine = standardAddressPMBLine;
	}

	public FirmMatchingStrictness getFirmMatchingStrictness() {
		return firmMatchingStrictness;
	}

	public void setFirmMatchingStrictness(FirmMatchingStrictness firmMatchingStrictness) {
		this.firmMatchingStrictness = firmMatchingStrictness;
	}

	public CanRuralRouteFormat getCanRuralRouteFormat() {
		return canRuralRouteFormat;
	}

	public void setCanRuralRouteFormat(CanRuralRouteFormat canRuralRouteFormat) {
		this.canRuralRouteFormat = canRuralRouteFormat;
	}

	public CanPreferHouseNum getCanPreferHouseNum() {
		return canPreferHouseNum;
	}

	public void setCanPreferHouseNum(CanPreferHouseNum canPreferHouseNum) {
		this.canPreferHouseNum = canPreferHouseNum;
	}

	public OutputPreferredAlias getOutputPreferredAlias() {
		return outputPreferredAlias;
	}

	public void setOutputPreferredAlias(OutputPreferredAlias outputPreferredAlias) {
		this.outputPreferredAlias = outputPreferredAlias;
	}

	public DirectionalMatchingStrictness getDirectionalMatchingStrictness() {
		return directionalMatchingStrictness;
	}

	public void setDirectionalMatchingStrictness(DirectionalMatchingStrictness directionalMatchingStrictness) {
		this.directionalMatchingStrictness = directionalMatchingStrictness;
	}

	public ExtractFirm getExtractFirm() {
		return ExtractFirm;
	}

	public void setExtractFirm(ExtractFirm extractFirm) {
		ExtractFirm = extractFirm;
	}

	public FailOnCMRAMatch getFailOnCMRAMatch() {
		return failOnCMRAMatch;
	}

	public void setFailOnCMRAMatch(FailOnCMRAMatch failOnCMRAMatch) {
		this.failOnCMRAMatch = failOnCMRAMatch;
	}

	public CanNonCivicFormat getCanNonCivicFormat() {
		return canNonCivicFormat;
	}

	public void setCanNonCivicFormat(CanNonCivicFormat canNonCivicFormat) {
		this.canNonCivicFormat = canNonCivicFormat;
	}

	
	public CanSSLVRFlg getCanSSLVRFlg() {
		return canSSLVRFlg;
	}

	public void setCanSSLVRFlg(CanSSLVRFlg canSSLVRFlg) {
		this.canSSLVRFlg = canSSLVRFlg;
	}

	public OutputStreetNameAlias getOutputStreetNameAlias() {
		return outputStreetNameAlias;
	}

	public void setOutputStreetNameAlias(OutputStreetNameAlias outputStreetNameAlias) {
		this.outputStreetNameAlias = outputStreetNameAlias;
	}

	public PerformEWS getPerformEWS() {
		return performEWS;
	}

	public void setPerformEWS(PerformEWS performEWS) {
		this.performEWS = performEWS;
	}

	public CanOutputCityFormat getCanOutputCityFormat() {
		return canOutputCityFormat;
	}

	public void setCanOutputCityFormat(CanOutputCityFormat canOutputCityFormat) {
		this.canOutputCityFormat = canOutputCityFormat;
	}

	public DualAddressLogic getDualAddressLogic() {
		return dualAddressLogic;
	}

	public void setDualAddressLogic(DualAddressLogic dualAddressLogic) {
		this.dualAddressLogic = dualAddressLogic;
	}

	public PerformSuiteLink getPerformSuiteLink() {
		return performSuiteLink;
	}

	public void setPerformSuiteLink(PerformSuiteLink performSuiteLink) {
		this.performSuiteLink = performSuiteLink;
	}

	public CanStandardAddressFormat getCanStandardAddressFormat() {
		return canStandardAddressFormat;
	}

	public void setCanStandardAddressFormat(CanStandardAddressFormat canStandardAddressFormat) {
		this.canStandardAddressFormat = canStandardAddressFormat;
	}

	public OutputPreferredCity getOutputPreferredCity() {
		return outputPreferredCity;
	}

	public void setOutputPreferredCity(OutputPreferredCity outputPreferredCity) {
		this.outputPreferredCity = outputPreferredCity;
	}

	public OutputMultinationalCharacters getOutputMultinationalCharacters() {
		return outputMultinationalCharacters;
	}

	public void setOutputMultinationalCharacters(OutputMultinationalCharacters outputMultinationalCharacters) {
		this.outputMultinationalCharacters = outputMultinationalCharacters;
	}

	public CanDeliveryOfficeFormat getCanDeliveryOfficeFormat() {
		return canDeliveryOfficeFormat;
	}

	public void setCanDeliveryOfficeFormat(CanDeliveryOfficeFormat canDeliveryOfficeFormat) {
		this.canDeliveryOfficeFormat = canDeliveryOfficeFormat;
	}

	public PerformLACSLink getPerformLACSLink() {
		return performLACSLink;
	}

	public void setPerformLACSLink(PerformLACSLink performLACSLink) {
		this.performLACSLink = performLACSLink;
	}

	public CanDualAddressLogic getCanDualAddressLogic() {
		return canDualAddressLogic;
	}

	public void setCanDualAddressLogic(CanDualAddressLogic canDualAddressLogic) {
		this.canDualAddressLogic = canDualAddressLogic;
	}

	public ExtractUrb getExtractUrb() {
		return extractUrb;
	}

	public void setExtractUrb(ExtractUrb extractUrb) {
		this.extractUrb = extractUrb;
	}

	public StandardAddressFormat getStandardAddressFormat() {
		return standardAddressFormat;
	}

	public void setStandardAddressFormat(StandardAddressFormat standardAddressFormat) {
		this.standardAddressFormat = standardAddressFormat;
	}

	public CanFrenchFormat getCanFrenchFormat() {
		return canFrenchFormat;
	}

	public void setCanFrenchFormat(CanFrenchFormat canFrenchFormat) {
		this.canFrenchFormat = canFrenchFormat;
	}

	public DPVDetermineVacancy getdPVDetermineVacancy() {
		return dPVDetermineVacancy;
	}

	public void setdPVDetermineVacancy(DPVDetermineVacancy dPVDetermineVacancy) {
		this.dPVDetermineVacancy = dPVDetermineVacancy;
	}

	public CanEnglishApartmentLabel getCanEnglishApartmentLabel() {
		return canEnglishApartmentLabel;
	}

	public void setCanEnglishApartmentLabel(CanEnglishApartmentLabel canEnglishApartmentLabel) {
		this.canEnglishApartmentLabel = canEnglishApartmentLabel;
	}

	public SuppressZplusPhantomCarrierR777 getSuppressZplusPhantomCarrierR777() {
		return suppressZplusPhantomCarrierR777;
	}

	public void setSuppressZplusPhantomCarrierR777(SuppressZplusPhantomCarrierR777 suppressZplusPhantomCarrierR777) {
		this.suppressZplusPhantomCarrierR777 = suppressZplusPhantomCarrierR777;
	}

	public CanOutputCityAlias getCanOutputCityAlias() {
		return canOutputCityAlias;
	}

	public void setCanOutputCityAlias(CanOutputCityAlias canOutputCityAlias) {
		this.canOutputCityAlias = canOutputCityAlias;
	}

	public OutputShortCityName getOutputShortCityName() {
		return outputShortCityName;
	}

	public void setOutputShortCityName(OutputShortCityName outputShortCityName) {
		this.outputShortCityName = outputShortCityName;
	}

	
	
}

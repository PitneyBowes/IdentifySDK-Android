/*******************************************************************************
 *  Copyright 2016 Pitney Bowes Inc
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an
 *   "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  
 *   See the License for the specific language governing permissions and limitations under the License.
 *******************************************************************************/
package com.pb.identify.identifyAddress.getPostalCodes.model;

import com.google.gson.annotations.SerializedName;

/**
 * Model class for GetPostalCodes input options
 *
 */
public class Options {
	@SerializedName(value="OutputVanityCity")
	private OutputVanityCity outputVanityCity;
	@SerializedName(value="OutputCityType")
	private OutputCityType outputCityType;
	
	
	public OutputVanityCity getOutputVanityCity() {
		return outputVanityCity;
	}
	public void setOutputVanityCity(OutputVanityCity outputVanityCity) {
		this.outputVanityCity = outputVanityCity;
	}
	
	public OutputCityType getOutputCityType() {
		return outputCityType;
	}
	public void setOutputCityType(OutputCityType outputCityType) {
		this.outputCityType = outputCityType;
	}
	
	public Options()
	{
		this.setOutputVanityCity(OutputVanityCity.N);
		this.setOutputCityType(OutputCityType.N);
	}
}

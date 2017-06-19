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

import com.google.gson.annotations.SerializedName;
import com.pb.identify.identifyAddress.getCityStateProvince.model.PerformUSProcessing;
import com.pb.identify.identifyAddress.getCityStateProvince.model.PerformCanadianProcessing;
import com.pb.identify.identifyAddress.getCityStateProvince.model.OutputVanityCity;

/**
 * Model class for GetCityStateProvince input options
 *
 */

public class Options {
    @SerializedName(value="PerformUSProcessing")
    private PerformUSProcessing performUSProcessing;
    @SerializedName(value="PerformCanadianProcessing")
    private PerformCanadianProcessing performCanadianProcessing;
    @SerializedName(value="OutputVanityCity")
    private OutputVanityCity outputVanityCity;
    @SerializedName(value="MaximumResults")
    private String maximumResults;

    public PerformUSProcessing getPerformUSProcessing() {
        return performUSProcessing;
    }

    public void setPerformUSProcessing(PerformUSProcessing performUSProcessing) {
        this.performUSProcessing = performUSProcessing;
    }

    public PerformCanadianProcessing getPerformCanadianProcessing() {
        return performCanadianProcessing;
    }

    public void setPerformCanadianProcessing(PerformCanadianProcessing performCanadianProcessing) {
        this.performCanadianProcessing = performCanadianProcessing;
    }

    public OutputVanityCity getOutputVanityCity() {
        return outputVanityCity;
    }

    public void setOutputVanityCity(OutputVanityCity outputVanityCity) {
        this.outputVanityCity = outputVanityCity;
    }

    public String getMaximumResults() {
        return maximumResults;
    }

    public void setMaximumResults(String maximumResults) {
        this.maximumResults = maximumResults;
    }

    public Options()
    {
        this.setPerformUSProcessing(PerformUSProcessing.Y);
        this.setPerformCanadianProcessing(PerformCanadianProcessing.Y);
        this.setOutputVanityCity(OutputVanityCity.N);
        this.setMaximumResults("10");
    }
}

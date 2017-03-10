
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

package com.pb.identify.identifyAddress.validateMailingAddressPro.model;

import com.pb.identify.identifyAddress.common.BaseOptions;
import com.pb.identify.identifyAddress.common.KeepMultimatch;
import com.pb.identify.identifyAddress.common.OutputAddressBlocks;
import com.pb.identify.identifyAddress.common.OutputCasing;

import com.google.gson.annotations.SerializedName;
import com.pb.identify.identifyAddress.common.OutputCountryFormat;
import com.pb.identify.identifyAddress.common.OutputScript;

/**
 * Model class for ValidateMailingAddressPro input options
 *
 */
public class Options extends BaseOptions {
    public Options(OutputCasing outputCasing, KeepMultimatch keepMultimatch, OutputAddressBlocks outputAddressBlocks,
                   OutputCountryFormat outputCountryFormat, OutputScript outputScript, int maximumResults){
        this.setOutputCasing(outputCasing);
        this.setKeepMultimatch(keepMultimatch);
        this.setOutputAddressBlocks(outputAddressBlocks);
        this.setOutputCountryFormat(outputCountryFormat);
        this.setOutputScript(outputScript);
        this.setMaximumResults(Integer.toString(maximumResults));
    }

    public Options()
    {
        this.setOutputCasing(OutputCasing.M);
        this.setKeepMultimatch(KeepMultimatch.N);
        this.setOutputAddressBlocks(OutputAddressBlocks.Y);
        this.setOutputCountryFormat(OutputCountryFormat.E);
        this.setOutputScript(OutputScript.InputScript);
        this.setMaximumResults("10");
    }

    @SerializedName(value="MaximumResults")
    private String maximumResults;
    @SerializedName(value="KeepMultimatch")
    private KeepMultimatch keepMultimatch;
    @SerializedName(value="OutputCountryFormat")
    private OutputCountryFormat outputCountryFormat;
    @SerializedName(value="OutputScript")
    private OutputScript outputScript;
    @SerializedName(value="OutputAddressBlocks")
    private OutputAddressBlocks outputAddressBlocks;

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

    public OutputScript getOutputScript() {
        return outputScript;
    }

    public void setOutputScript(OutputScript outputScript) {
        this.outputScript = outputScript;
    }
}

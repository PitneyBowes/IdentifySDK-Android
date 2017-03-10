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
import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.annotations.SerializedName;

/**
 * Model class for ExtractEntities input options
 *
 */
public class Options {

    @SerializedName(value="EntityList")
    private String entityLists;
    @SerializedName(value="OutputEntityCount")
    private String outputEntityCount;

    public Options(){
        List<EntityList> entityListSet = new ArrayList<EntityList>(Arrays.asList(EntityList.Person,EntityList.Address));
        this.setEntityLists(entityListSet);
    }

    public Options(List<EntityList> entityLists){
        this.setEntityLists(entityLists);
    }

    public String getEntityLists() {
        return entityLists;
    }

    public void setEntityLists(List<EntityList> entityLists) {
        StringBuilder sb = new StringBuilder();
        for(EntityList el: entityLists){
            sb.append(el.toString());
            sb.append(",");
        }

        this.entityLists=sb.substring(0, sb.length()-1);
    }

    public String getOutputEntityCount() {
        return outputEntityCount;
    }

    public void setOutputEntityCount(String outputEntityCount) {
        this.outputEntityCount = outputEntityCount;
    }
}

/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.ic.v20190307.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCardRequest extends AbstractModel{

    /**
    * 应用ID
    */
    @SerializedName("Sdkappid")
    @Expose
    private Integer Sdkappid;

    /**
    * 卡片ID
    */
    @SerializedName("Iccid")
    @Expose
    private String Iccid;

    /**
     * Get 应用ID 
     * @return Sdkappid 应用ID
     */
    public Integer getSdkappid() {
        return this.Sdkappid;
    }

    /**
     * Set 应用ID
     * @param Sdkappid 应用ID
     */
    public void setSdkappid(Integer Sdkappid) {
        this.Sdkappid = Sdkappid;
    }

    /**
     * Get 卡片ID 
     * @return Iccid 卡片ID
     */
    public String getIccid() {
        return this.Iccid;
    }

    /**
     * Set 卡片ID
     * @param Iccid 卡片ID
     */
    public void setIccid(String Iccid) {
        this.Iccid = Iccid;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Sdkappid", this.Sdkappid);
        this.setParamSimple(map, prefix + "Iccid", this.Iccid);

    }
}


/*
 * Copyright (c) 2024, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.api.server.tenant.management.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;
import javax.validation.Valid;
import javax.xml.bind.annotation.*;

public class AdditionalClaims  {
  
    private String claim;
    private String value;

    /**
    * Claim uri.
    **/
    public AdditionalClaims claim(String claim) {

        this.claim = claim;
        return this;
    }
    
    @ApiModelProperty(example = "http://wso2.org/claims/telephone", value = "Claim uri.")
    @JsonProperty("claim")
    @Valid
    public String getClaim() {
        return claim;
    }
    public void setClaim(String claim) {
        this.claim = claim;
    }

    /**
    * Mobile number of the tenant owner.
    **/
    public AdditionalClaims value(String value) {

        this.value = value;
        return this;
    }
    
    @ApiModelProperty(example = "+94 562 8723", value = "Mobile number of the tenant owner.")
    @JsonProperty("value")
    @Valid
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }



    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AdditionalClaims additionalClaims = (AdditionalClaims) o;
        return Objects.equals(this.claim, additionalClaims.claim) &&
            Objects.equals(this.value, additionalClaims.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(claim, value);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class AdditionalClaims {\n");
        
        sb.append("    claim: ").append(toIndentedString(claim)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
    * Convert the given object to string with each line indented by 4 spaces
    * (except the first line).
    */
    private String toIndentedString(java.lang.Object o) {

        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n");
    }
}


/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Azure IaaS VM workload-specific Health Details.
 */
public class AzureIaaSVMHealthDetails {
    /**
     * Health Code.
     */
    @JsonProperty(value = "code")
    private Integer code;

    /**
     * Health Title.
     */
    @JsonProperty(value = "title")
    private String title;

    /**
     * Health Message.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Health Recommended Actions.
     */
    @JsonProperty(value = "recommendations")
    private List<String> recommendations;

    /**
     * Get health Code.
     *
     * @return the code value
     */
    public Integer code() {
        return this.code;
    }

    /**
     * Set health Code.
     *
     * @param code the code value to set
     * @return the AzureIaaSVMHealthDetails object itself.
     */
    public AzureIaaSVMHealthDetails withCode(Integer code) {
        this.code = code;
        return this;
    }

    /**
     * Get health Title.
     *
     * @return the title value
     */
    public String title() {
        return this.title;
    }

    /**
     * Set health Title.
     *
     * @param title the title value to set
     * @return the AzureIaaSVMHealthDetails object itself.
     */
    public AzureIaaSVMHealthDetails withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get health Message.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set health Message.
     *
     * @param message the message value to set
     * @return the AzureIaaSVMHealthDetails object itself.
     */
    public AzureIaaSVMHealthDetails withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get health Recommended Actions.
     *
     * @return the recommendations value
     */
    public List<String> recommendations() {
        return this.recommendations;
    }

    /**
     * Set health Recommended Actions.
     *
     * @param recommendations the recommendations value to set
     * @return the AzureIaaSVMHealthDetails object itself.
     */
    public AzureIaaSVMHealthDetails withRecommendations(List<String> recommendations) {
        this.recommendations = recommendations;
        return this;
    }

}
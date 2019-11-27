/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_08_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Value of resource metric.
 */
public class ResourceMetricValue {
    /**
     * Value timestamp.
     */
    @JsonProperty(value = "timestamp", access = JsonProperty.Access.WRITE_ONLY)
    private String timestamp;

    /**
     * Value average.
     */
    @JsonProperty(value = "average", access = JsonProperty.Access.WRITE_ONLY)
    private Double average;

    /**
     * Value minimum.
     */
    @JsonProperty(value = "minimum", access = JsonProperty.Access.WRITE_ONLY)
    private Double minimum;

    /**
     * Value maximum.
     */
    @JsonProperty(value = "maximum", access = JsonProperty.Access.WRITE_ONLY)
    private Double maximum;

    /**
     * Value total.
     */
    @JsonProperty(value = "total", access = JsonProperty.Access.WRITE_ONLY)
    private Double total;

    /**
     * Value count.
     */
    @JsonProperty(value = "count", access = JsonProperty.Access.WRITE_ONLY)
    private Double count;

    /**
     * Resource metric properties collection.
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceMetricProperty> properties;

    /**
     * Get value timestamp.
     *
     * @return the timestamp value
     */
    public String timestamp() {
        return this.timestamp;
    }

    /**
     * Get value average.
     *
     * @return the average value
     */
    public Double average() {
        return this.average;
    }

    /**
     * Get value minimum.
     *
     * @return the minimum value
     */
    public Double minimum() {
        return this.minimum;
    }

    /**
     * Get value maximum.
     *
     * @return the maximum value
     */
    public Double maximum() {
        return this.maximum;
    }

    /**
     * Get value total.
     *
     * @return the total value
     */
    public Double total() {
        return this.total;
    }

    /**
     * Get value count.
     *
     * @return the count value
     */
    public Double count() {
        return this.count;
    }

    /**
     * Get resource metric properties collection.
     *
     * @return the properties value
     */
    public List<ResourceMetricProperty> properties() {
        return this.properties;
    }

}
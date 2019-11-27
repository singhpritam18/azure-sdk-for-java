/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation;

import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.AuthenticationSettingsContract;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.SubscriptionKeyParameterNamesContract;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.ApiType;
import java.util.List;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.Protocol;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.ApiVersionSetContractDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * API details.
 */
@JsonFlatten
public class ApiContractInner extends ProxyResource {
    /**
     * Description of the API. May include HTML formatting tags.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Collection of authentication settings included into this API.
     */
    @JsonProperty(value = "properties.authenticationSettings")
    private AuthenticationSettingsContract authenticationSettings;

    /**
     * Protocols over which API is made available.
     */
    @JsonProperty(value = "properties.subscriptionKeyParameterNames")
    private SubscriptionKeyParameterNamesContract subscriptionKeyParameterNames;

    /**
     * Type of API. Possible values include: 'http', 'soap'.
     */
    @JsonProperty(value = "properties.type")
    private ApiType apiType;

    /**
     * Describes the Revision of the Api. If no value is provided, default
     * revision 1 is created.
     */
    @JsonProperty(value = "properties.apiRevision")
    private String apiRevision;

    /**
     * Indicates the Version identifier of the API if the API is versioned.
     */
    @JsonProperty(value = "properties.apiVersion")
    private String apiVersion;

    /**
     * Indicates if API revision is current api revision.
     */
    @JsonProperty(value = "properties.isCurrent", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isCurrent;

    /**
     * Indicates if API revision is accessible via the gateway.
     */
    @JsonProperty(value = "properties.isOnline", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isOnline;

    /**
     * Description of the Api Revision.
     */
    @JsonProperty(value = "properties.apiRevisionDescription")
    private String apiRevisionDescription;

    /**
     * Description of the Api Version.
     */
    @JsonProperty(value = "properties.apiVersionDescription")
    private String apiVersionDescription;

    /**
     * A resource identifier for the related ApiVersionSet.
     */
    @JsonProperty(value = "properties.apiVersionSetId")
    private String apiVersionSetId;

    /**
     * Specifies whether an API or Product subscription is required for
     * accessing the API.
     */
    @JsonProperty(value = "properties.subscriptionRequired")
    private Boolean subscriptionRequired;

    /**
     * API name.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * Absolute URL of the backend service implementing this API.
     */
    @JsonProperty(value = "properties.serviceUrl")
    private String serviceUrl;

    /**
     * Relative URL uniquely identifying this API and all of its resource paths
     * within the API Management service instance. It is appended to the API
     * endpoint base URL specified during the service instance creation to form
     * a public URL for this API.
     */
    @JsonProperty(value = "properties.path", required = true)
    private String path;

    /**
     * Describes on which protocols the operations in this API can be invoked.
     */
    @JsonProperty(value = "properties.protocols")
    private List<Protocol> protocols;

    /**
     * The apiVersionSet property.
     */
    @JsonProperty(value = "properties.apiVersionSet")
    private ApiVersionSetContractDetails apiVersionSet;

    /**
     * Get description of the API. May include HTML formatting tags.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set description of the API. May include HTML formatting tags.
     *
     * @param description the description value to set
     * @return the ApiContractInner object itself.
     */
    public ApiContractInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get collection of authentication settings included into this API.
     *
     * @return the authenticationSettings value
     */
    public AuthenticationSettingsContract authenticationSettings() {
        return this.authenticationSettings;
    }

    /**
     * Set collection of authentication settings included into this API.
     *
     * @param authenticationSettings the authenticationSettings value to set
     * @return the ApiContractInner object itself.
     */
    public ApiContractInner withAuthenticationSettings(AuthenticationSettingsContract authenticationSettings) {
        this.authenticationSettings = authenticationSettings;
        return this;
    }

    /**
     * Get protocols over which API is made available.
     *
     * @return the subscriptionKeyParameterNames value
     */
    public SubscriptionKeyParameterNamesContract subscriptionKeyParameterNames() {
        return this.subscriptionKeyParameterNames;
    }

    /**
     * Set protocols over which API is made available.
     *
     * @param subscriptionKeyParameterNames the subscriptionKeyParameterNames value to set
     * @return the ApiContractInner object itself.
     */
    public ApiContractInner withSubscriptionKeyParameterNames(SubscriptionKeyParameterNamesContract subscriptionKeyParameterNames) {
        this.subscriptionKeyParameterNames = subscriptionKeyParameterNames;
        return this;
    }

    /**
     * Get type of API. Possible values include: 'http', 'soap'.
     *
     * @return the apiType value
     */
    public ApiType apiType() {
        return this.apiType;
    }

    /**
     * Set type of API. Possible values include: 'http', 'soap'.
     *
     * @param apiType the apiType value to set
     * @return the ApiContractInner object itself.
     */
    public ApiContractInner withApiType(ApiType apiType) {
        this.apiType = apiType;
        return this;
    }

    /**
     * Get describes the Revision of the Api. If no value is provided, default revision 1 is created.
     *
     * @return the apiRevision value
     */
    public String apiRevision() {
        return this.apiRevision;
    }

    /**
     * Set describes the Revision of the Api. If no value is provided, default revision 1 is created.
     *
     * @param apiRevision the apiRevision value to set
     * @return the ApiContractInner object itself.
     */
    public ApiContractInner withApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }

    /**
     * Get indicates the Version identifier of the API if the API is versioned.
     *
     * @return the apiVersion value
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /**
     * Set indicates the Version identifier of the API if the API is versioned.
     *
     * @param apiVersion the apiVersion value to set
     * @return the ApiContractInner object itself.
     */
    public ApiContractInner withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * Get indicates if API revision is current api revision.
     *
     * @return the isCurrent value
     */
    public Boolean isCurrent() {
        return this.isCurrent;
    }

    /**
     * Get indicates if API revision is accessible via the gateway.
     *
     * @return the isOnline value
     */
    public Boolean isOnline() {
        return this.isOnline;
    }

    /**
     * Get description of the Api Revision.
     *
     * @return the apiRevisionDescription value
     */
    public String apiRevisionDescription() {
        return this.apiRevisionDescription;
    }

    /**
     * Set description of the Api Revision.
     *
     * @param apiRevisionDescription the apiRevisionDescription value to set
     * @return the ApiContractInner object itself.
     */
    public ApiContractInner withApiRevisionDescription(String apiRevisionDescription) {
        this.apiRevisionDescription = apiRevisionDescription;
        return this;
    }

    /**
     * Get description of the Api Version.
     *
     * @return the apiVersionDescription value
     */
    public String apiVersionDescription() {
        return this.apiVersionDescription;
    }

    /**
     * Set description of the Api Version.
     *
     * @param apiVersionDescription the apiVersionDescription value to set
     * @return the ApiContractInner object itself.
     */
    public ApiContractInner withApiVersionDescription(String apiVersionDescription) {
        this.apiVersionDescription = apiVersionDescription;
        return this;
    }

    /**
     * Get a resource identifier for the related ApiVersionSet.
     *
     * @return the apiVersionSetId value
     */
    public String apiVersionSetId() {
        return this.apiVersionSetId;
    }

    /**
     * Set a resource identifier for the related ApiVersionSet.
     *
     * @param apiVersionSetId the apiVersionSetId value to set
     * @return the ApiContractInner object itself.
     */
    public ApiContractInner withApiVersionSetId(String apiVersionSetId) {
        this.apiVersionSetId = apiVersionSetId;
        return this;
    }

    /**
     * Get specifies whether an API or Product subscription is required for accessing the API.
     *
     * @return the subscriptionRequired value
     */
    public Boolean subscriptionRequired() {
        return this.subscriptionRequired;
    }

    /**
     * Set specifies whether an API or Product subscription is required for accessing the API.
     *
     * @param subscriptionRequired the subscriptionRequired value to set
     * @return the ApiContractInner object itself.
     */
    public ApiContractInner withSubscriptionRequired(Boolean subscriptionRequired) {
        this.subscriptionRequired = subscriptionRequired;
        return this;
    }

    /**
     * Get aPI name.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set aPI name.
     *
     * @param displayName the displayName value to set
     * @return the ApiContractInner object itself.
     */
    public ApiContractInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get absolute URL of the backend service implementing this API.
     *
     * @return the serviceUrl value
     */
    public String serviceUrl() {
        return this.serviceUrl;
    }

    /**
     * Set absolute URL of the backend service implementing this API.
     *
     * @param serviceUrl the serviceUrl value to set
     * @return the ApiContractInner object itself.
     */
    public ApiContractInner withServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
        return this;
    }

    /**
     * Get relative URL uniquely identifying this API and all of its resource paths within the API Management service instance. It is appended to the API endpoint base URL specified during the service instance creation to form a public URL for this API.
     *
     * @return the path value
     */
    public String path() {
        return this.path;
    }

    /**
     * Set relative URL uniquely identifying this API and all of its resource paths within the API Management service instance. It is appended to the API endpoint base URL specified during the service instance creation to form a public URL for this API.
     *
     * @param path the path value to set
     * @return the ApiContractInner object itself.
     */
    public ApiContractInner withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get describes on which protocols the operations in this API can be invoked.
     *
     * @return the protocols value
     */
    public List<Protocol> protocols() {
        return this.protocols;
    }

    /**
     * Set describes on which protocols the operations in this API can be invoked.
     *
     * @param protocols the protocols value to set
     * @return the ApiContractInner object itself.
     */
    public ApiContractInner withProtocols(List<Protocol> protocols) {
        this.protocols = protocols;
        return this;
    }

    /**
     * Get the apiVersionSet value.
     *
     * @return the apiVersionSet value
     */
    public ApiVersionSetContractDetails apiVersionSet() {
        return this.apiVersionSet;
    }

    /**
     * Set the apiVersionSet value.
     *
     * @param apiVersionSet the apiVersionSet value to set
     * @return the ApiContractInner object itself.
     */
    public ApiContractInner withApiVersionSet(ApiVersionSetContractDetails apiVersionSet) {
        this.apiVersionSet = apiVersionSet;
        return this;
    }

}
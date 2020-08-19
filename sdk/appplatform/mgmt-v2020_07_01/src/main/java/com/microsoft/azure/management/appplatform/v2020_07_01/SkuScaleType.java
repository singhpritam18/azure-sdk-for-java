/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2020_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SkuScaleType.
 */
public final class SkuScaleType extends ExpandableStringEnum<SkuScaleType> {
    /** Static value None for SkuScaleType. */
    public static final SkuScaleType NONE = fromString("None");

    /** Static value Manual for SkuScaleType. */
    public static final SkuScaleType MANUAL = fromString("Manual");

    /** Static value Automatic for SkuScaleType. */
    public static final SkuScaleType AUTOMATIC = fromString("Automatic");

    /**
     * Creates or finds a SkuScaleType from its string representation.
     * @param name a name to look for
     * @return the corresponding SkuScaleType
     */
    @JsonCreator
    public static SkuScaleType fromString(String name) {
        return fromString(name, SkuScaleType.class);
    }

    /**
     * @return known SkuScaleType values
     */
    public static Collection<SkuScaleType> values() {
        return values(SkuScaleType.class);
    }
}

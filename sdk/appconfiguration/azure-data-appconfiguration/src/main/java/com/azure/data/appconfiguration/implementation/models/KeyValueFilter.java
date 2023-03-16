// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.data.appconfiguration.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Enables filtering of key-values. */
@Fluent
public final class KeyValueFilter {
    /*
     * Filters key-values by their key field.
     */
    @JsonProperty(value = "key", required = true)
    private String key;

    /*
     * Filters key-values by their label field.
     */
    @JsonProperty(value = "label")
    private String label;

    /** Creates an instance of KeyValueFilter class. */
    public KeyValueFilter() {}

    /**
     * Get the key property: Filters key-values by their key field.
     *
     * @return the key value.
     */
    public String getKey() {
        return this.key;
    }

    /**
     * Set the key property: Filters key-values by their key field.
     *
     * @param key the key value to set.
     * @return the KeyValueFilter object itself.
     */
    public KeyValueFilter setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the label property: Filters key-values by their label field.
     *
     * @return the label value.
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * Set the label property: Filters key-values by their label field.
     *
     * @param label the label value to set.
     * @return the KeyValueFilter object itself.
     */
    public KeyValueFilter setLabel(String label) {
        this.label = label;
        return this;
    }
}
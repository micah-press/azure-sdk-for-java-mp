// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.securityinsights.fluent.models.EntityQueryInner;
import com.azure.resourcemanager.securityinsights.fluent.models.ExpansionEntityQueriesProperties;
import java.io.IOException;
import java.util.List;

/**
 * Represents Expansion entity query.
 */
@Fluent
public final class ExpansionEntityQuery extends EntityQueryInner {
    /*
     * the entity query kind
     */
    private EntityQueryKind kind = EntityQueryKind.EXPANSION;

    /*
     * Expansion entity query properties
     */
    private ExpansionEntityQueriesProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of ExpansionEntityQuery class.
     */
    public ExpansionEntityQuery() {
    }

    /**
     * Get the kind property: the entity query kind.
     * 
     * @return the kind value.
     */
    @Override
    public EntityQueryKind kind() {
        return this.kind;
    }

    /**
     * Get the innerProperties property: Expansion entity query properties.
     * 
     * @return the innerProperties value.
     */
    private ExpansionEntityQueriesProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    @Override
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExpansionEntityQuery withEtag(String etag) {
        super.withEtag(etag);
        return this;
    }

    /**
     * Get the dataSources property: List of the data sources that are required to run the query.
     * 
     * @return the dataSources value.
     */
    public List<String> dataSources() {
        return this.innerProperties() == null ? null : this.innerProperties().dataSources();
    }

    /**
     * Set the dataSources property: List of the data sources that are required to run the query.
     * 
     * @param dataSources the dataSources value to set.
     * @return the ExpansionEntityQuery object itself.
     */
    public ExpansionEntityQuery withDataSources(List<String> dataSources) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpansionEntityQueriesProperties();
        }
        this.innerProperties().withDataSources(dataSources);
        return this;
    }

    /**
     * Get the displayName property: The query display name.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: The query display name.
     * 
     * @param displayName the displayName value to set.
     * @return the ExpansionEntityQuery object itself.
     */
    public ExpansionEntityQuery withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpansionEntityQueriesProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the inputEntityType property: The type of the query's source entity.
     * 
     * @return the inputEntityType value.
     */
    public EntityType inputEntityType() {
        return this.innerProperties() == null ? null : this.innerProperties().inputEntityType();
    }

    /**
     * Set the inputEntityType property: The type of the query's source entity.
     * 
     * @param inputEntityType the inputEntityType value to set.
     * @return the ExpansionEntityQuery object itself.
     */
    public ExpansionEntityQuery withInputEntityType(EntityType inputEntityType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpansionEntityQueriesProperties();
        }
        this.innerProperties().withInputEntityType(inputEntityType);
        return this;
    }

    /**
     * Get the inputFields property: List of the fields of the source entity that are required to run the query.
     * 
     * @return the inputFields value.
     */
    public List<String> inputFields() {
        return this.innerProperties() == null ? null : this.innerProperties().inputFields();
    }

    /**
     * Set the inputFields property: List of the fields of the source entity that are required to run the query.
     * 
     * @param inputFields the inputFields value to set.
     * @return the ExpansionEntityQuery object itself.
     */
    public ExpansionEntityQuery withInputFields(List<String> inputFields) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpansionEntityQueriesProperties();
        }
        this.innerProperties().withInputFields(inputFields);
        return this;
    }

    /**
     * Get the outputEntityTypes property: List of the desired output types to be constructed from the result.
     * 
     * @return the outputEntityTypes value.
     */
    public List<EntityType> outputEntityTypes() {
        return this.innerProperties() == null ? null : this.innerProperties().outputEntityTypes();
    }

    /**
     * Set the outputEntityTypes property: List of the desired output types to be constructed from the result.
     * 
     * @param outputEntityTypes the outputEntityTypes value to set.
     * @return the ExpansionEntityQuery object itself.
     */
    public ExpansionEntityQuery withOutputEntityTypes(List<EntityType> outputEntityTypes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpansionEntityQueriesProperties();
        }
        this.innerProperties().withOutputEntityTypes(outputEntityTypes);
        return this;
    }

    /**
     * Get the queryTemplate property: The template query string to be parsed and formatted.
     * 
     * @return the queryTemplate value.
     */
    public String queryTemplate() {
        return this.innerProperties() == null ? null : this.innerProperties().queryTemplate();
    }

    /**
     * Set the queryTemplate property: The template query string to be parsed and formatted.
     * 
     * @param queryTemplate the queryTemplate value to set.
     * @return the ExpansionEntityQuery object itself.
     */
    public ExpansionEntityQuery withQueryTemplate(String queryTemplate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpansionEntityQueriesProperties();
        }
        this.innerProperties().withQueryTemplate(queryTemplate);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("etag", etag());
        jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExpansionEntityQuery from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExpansionEntityQuery if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ExpansionEntityQuery.
     */
    public static ExpansionEntityQuery fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExpansionEntityQuery deserializedExpansionEntityQuery = new ExpansionEntityQuery();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedExpansionEntityQuery.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedExpansionEntityQuery.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedExpansionEntityQuery.type = reader.getString();
                } else if ("etag".equals(fieldName)) {
                    deserializedExpansionEntityQuery.withEtag(reader.getString());
                } else if ("systemData".equals(fieldName)) {
                    deserializedExpansionEntityQuery.systemData = SystemData.fromJson(reader);
                } else if ("kind".equals(fieldName)) {
                    deserializedExpansionEntityQuery.kind = EntityQueryKind.fromString(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedExpansionEntityQuery.innerProperties
                        = ExpansionEntityQueriesProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExpansionEntityQuery;
        });
    }
}

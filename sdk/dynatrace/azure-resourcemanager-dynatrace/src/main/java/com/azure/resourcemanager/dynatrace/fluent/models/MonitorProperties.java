// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dynatrace.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.dynatrace.models.DynatraceEnvironmentProperties;
import com.azure.resourcemanager.dynatrace.models.LiftrResourceCategories;
import com.azure.resourcemanager.dynatrace.models.MarketplaceSubscriptionStatus;
import com.azure.resourcemanager.dynatrace.models.MonitoringStatus;
import com.azure.resourcemanager.dynatrace.models.PlanData;
import com.azure.resourcemanager.dynatrace.models.ProvisioningState;
import com.azure.resourcemanager.dynatrace.models.UserInfo;
import java.io.IOException;

/**
 * Properties specific to the monitor resource.
 */
@Fluent
public final class MonitorProperties implements JsonSerializable<MonitorProperties> {
    /*
     * Status of the monitor.
     */
    private MonitoringStatus monitoringStatus;

    /*
     * Marketplace subscription status.
     */
    private MarketplaceSubscriptionStatus marketplaceSubscriptionStatus;

    /*
     * Properties of the Dynatrace environment.
     */
    private DynatraceEnvironmentProperties dynatraceEnvironmentProperties;

    /*
     * User info.
     */
    private UserInfo userInfo;

    /*
     * Billing plan information.
     */
    private PlanData planData;

    /*
     * Liftr Resource category.
     */
    private LiftrResourceCategories liftrResourceCategory;

    /*
     * The priority of the resource.
     */
    private Integer liftrResourcePreference;

    /*
     * Provisioning state of the resource.
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of MonitorProperties class.
     */
    public MonitorProperties() {
    }

    /**
     * Get the monitoringStatus property: Status of the monitor.
     * 
     * @return the monitoringStatus value.
     */
    public MonitoringStatus monitoringStatus() {
        return this.monitoringStatus;
    }

    /**
     * Set the monitoringStatus property: Status of the monitor.
     * 
     * @param monitoringStatus the monitoringStatus value to set.
     * @return the MonitorProperties object itself.
     */
    public MonitorProperties withMonitoringStatus(MonitoringStatus monitoringStatus) {
        this.monitoringStatus = monitoringStatus;
        return this;
    }

    /**
     * Get the marketplaceSubscriptionStatus property: Marketplace subscription status.
     * 
     * @return the marketplaceSubscriptionStatus value.
     */
    public MarketplaceSubscriptionStatus marketplaceSubscriptionStatus() {
        return this.marketplaceSubscriptionStatus;
    }

    /**
     * Set the marketplaceSubscriptionStatus property: Marketplace subscription status.
     * 
     * @param marketplaceSubscriptionStatus the marketplaceSubscriptionStatus value to set.
     * @return the MonitorProperties object itself.
     */
    public MonitorProperties
        withMarketplaceSubscriptionStatus(MarketplaceSubscriptionStatus marketplaceSubscriptionStatus) {
        this.marketplaceSubscriptionStatus = marketplaceSubscriptionStatus;
        return this;
    }

    /**
     * Get the dynatraceEnvironmentProperties property: Properties of the Dynatrace environment.
     * 
     * @return the dynatraceEnvironmentProperties value.
     */
    public DynatraceEnvironmentProperties dynatraceEnvironmentProperties() {
        return this.dynatraceEnvironmentProperties;
    }

    /**
     * Set the dynatraceEnvironmentProperties property: Properties of the Dynatrace environment.
     * 
     * @param dynatraceEnvironmentProperties the dynatraceEnvironmentProperties value to set.
     * @return the MonitorProperties object itself.
     */
    public MonitorProperties
        withDynatraceEnvironmentProperties(DynatraceEnvironmentProperties dynatraceEnvironmentProperties) {
        this.dynatraceEnvironmentProperties = dynatraceEnvironmentProperties;
        return this;
    }

    /**
     * Get the userInfo property: User info.
     * 
     * @return the userInfo value.
     */
    public UserInfo userInfo() {
        return this.userInfo;
    }

    /**
     * Set the userInfo property: User info.
     * 
     * @param userInfo the userInfo value to set.
     * @return the MonitorProperties object itself.
     */
    public MonitorProperties withUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }

    /**
     * Get the planData property: Billing plan information.
     * 
     * @return the planData value.
     */
    public PlanData planData() {
        return this.planData;
    }

    /**
     * Set the planData property: Billing plan information.
     * 
     * @param planData the planData value to set.
     * @return the MonitorProperties object itself.
     */
    public MonitorProperties withPlanData(PlanData planData) {
        this.planData = planData;
        return this;
    }

    /**
     * Get the liftrResourceCategory property: Liftr Resource category.
     * 
     * @return the liftrResourceCategory value.
     */
    public LiftrResourceCategories liftrResourceCategory() {
        return this.liftrResourceCategory;
    }

    /**
     * Get the liftrResourcePreference property: The priority of the resource.
     * 
     * @return the liftrResourcePreference value.
     */
    public Integer liftrResourcePreference() {
        return this.liftrResourcePreference;
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dynatraceEnvironmentProperties() != null) {
            dynatraceEnvironmentProperties().validate();
        }
        if (userInfo() != null) {
            userInfo().validate();
        }
        if (planData() != null) {
            planData().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("monitoringStatus",
            this.monitoringStatus == null ? null : this.monitoringStatus.toString());
        jsonWriter.writeStringField("marketplaceSubscriptionStatus",
            this.marketplaceSubscriptionStatus == null ? null : this.marketplaceSubscriptionStatus.toString());
        jsonWriter.writeJsonField("dynatraceEnvironmentProperties", this.dynatraceEnvironmentProperties);
        jsonWriter.writeJsonField("userInfo", this.userInfo);
        jsonWriter.writeJsonField("planData", this.planData);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MonitorProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MonitorProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the MonitorProperties.
     */
    public static MonitorProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MonitorProperties deserializedMonitorProperties = new MonitorProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("monitoringStatus".equals(fieldName)) {
                    deserializedMonitorProperties.monitoringStatus = MonitoringStatus.fromString(reader.getString());
                } else if ("marketplaceSubscriptionStatus".equals(fieldName)) {
                    deserializedMonitorProperties.marketplaceSubscriptionStatus
                        = MarketplaceSubscriptionStatus.fromString(reader.getString());
                } else if ("dynatraceEnvironmentProperties".equals(fieldName)) {
                    deserializedMonitorProperties.dynatraceEnvironmentProperties
                        = DynatraceEnvironmentProperties.fromJson(reader);
                } else if ("userInfo".equals(fieldName)) {
                    deserializedMonitorProperties.userInfo = UserInfo.fromJson(reader);
                } else if ("planData".equals(fieldName)) {
                    deserializedMonitorProperties.planData = PlanData.fromJson(reader);
                } else if ("liftrResourceCategory".equals(fieldName)) {
                    deserializedMonitorProperties.liftrResourceCategory
                        = LiftrResourceCategories.fromString(reader.getString());
                } else if ("liftrResourcePreference".equals(fieldName)) {
                    deserializedMonitorProperties.liftrResourcePreference = reader.getNullable(JsonReader::getInt);
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedMonitorProperties.provisioningState = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMonitorProperties;
        });
    }
}

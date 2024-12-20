// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securityinsights.models.MLBehaviorAnalyticsAlertRule;
import org.junit.jupiter.api.Assertions;

public final class MLBehaviorAnalyticsAlertRuleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MLBehaviorAnalyticsAlertRule model = BinaryData.fromString(
            "{\"kind\":\"MLBehaviorAnalytics\",\"properties\":{\"alertRuleTemplateName\":\"pqvyb\",\"description\":\"gvmxnok\",\"displayName\":\"t\",\"enabled\":true,\"lastModifiedUtc\":\"2021-01-01T17:46:17Z\",\"severity\":\"Informational\",\"tactics\":[\"ImpairProcessControl\",\"InhibitResponseFunction\",\"CommandAndControl\"],\"techniques\":[\"rhunlp\"]},\"etag\":\"ykycndzfqi\",\"id\":\"reuykbbmnwagl\",\"name\":\"bxoeeonql\",\"type\":\"fwmyymv\"}")
            .toObject(MLBehaviorAnalyticsAlertRule.class);
        Assertions.assertEquals("ykycndzfqi", model.etag());
        Assertions.assertEquals("pqvyb", model.alertRuleTemplateName());
        Assertions.assertEquals(true, model.enabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MLBehaviorAnalyticsAlertRule model = new MLBehaviorAnalyticsAlertRule().withEtag("ykycndzfqi")
            .withAlertRuleTemplateName("pqvyb")
            .withEnabled(true);
        model = BinaryData.fromObject(model).toObject(MLBehaviorAnalyticsAlertRule.class);
        Assertions.assertEquals("ykycndzfqi", model.etag());
        Assertions.assertEquals("pqvyb", model.alertRuleTemplateName());
        Assertions.assertEquals(true, model.enabled());
    }
}

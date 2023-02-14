// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.models.RecommendedSensitivityLabelUpdate;
import com.azure.resourcemanager.synapse.models.RecommendedSensitivityLabelUpdateKind;
import org.junit.jupiter.api.Assertions;

public final class RecommendedSensitivityLabelUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RecommendedSensitivityLabelUpdate model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"op\":\"disable\",\"schema\":\"hfwpracstwit\",\"table\":\"khevxccedc\",\"column\":\"nmdyodnwzxl\"},\"id\":\"jc\",\"name\":\"nhltiugcxn\",\"type\":\"vvwxqi\"}")
                .toObject(RecommendedSensitivityLabelUpdate.class);
        Assertions.assertEquals(RecommendedSensitivityLabelUpdateKind.DISABLE, model.op());
        Assertions.assertEquals("hfwpracstwit", model.schema());
        Assertions.assertEquals("khevxccedc", model.table());
        Assertions.assertEquals("nmdyodnwzxl", model.column());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RecommendedSensitivityLabelUpdate model =
            new RecommendedSensitivityLabelUpdate()
                .withOp(RecommendedSensitivityLabelUpdateKind.DISABLE)
                .withSchema("hfwpracstwit")
                .withTable("khevxccedc")
                .withColumn("nmdyodnwzxl");
        model = BinaryData.fromObject(model).toObject(RecommendedSensitivityLabelUpdate.class);
        Assertions.assertEquals(RecommendedSensitivityLabelUpdateKind.DISABLE, model.op());
        Assertions.assertEquals("hfwpracstwit", model.schema());
        Assertions.assertEquals("khevxccedc", model.table());
        Assertions.assertEquals("nmdyodnwzxl", model.column());
    }
}
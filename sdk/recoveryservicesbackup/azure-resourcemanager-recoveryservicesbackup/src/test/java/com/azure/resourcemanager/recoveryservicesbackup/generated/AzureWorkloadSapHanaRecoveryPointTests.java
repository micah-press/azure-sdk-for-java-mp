// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureWorkloadSapHanaRecoveryPoint;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointMoveReadinessInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointProperties;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointTierInformationV2;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointTierStatus;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointTierType;
import com.azure.resourcemanager.recoveryservicesbackup.models.RestorePointType;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureWorkloadSapHanaRecoveryPointTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureWorkloadSapHanaRecoveryPoint model =
            BinaryData
                .fromString(
                    "{\"objectType\":\"AzureWorkloadSAPHanaRecoveryPoint\",\"recoveryPointTimeInUTC\":\"2021-07-17T20:12:30Z\",\"type\":\"Full\",\"recoveryPointTierDetails\":[{\"type\":\"Invalid\",\"status\":\"Deleted\",\"extendedInfo\":{\"utlwxezwzhok\":\"ylkdghrje\",\"ehgpp\":\"bwnhhtql\",\"csheafidltugsr\":\"pifhpfeoajvgcxtx\"}},{\"type\":\"Invalid\",\"status\":\"Invalid\",\"extendedInfo\":{\"iftxfkf\":\"h\",\"ucb\":\"egprhptil\",\"riz\":\"qtgdqohmcwsl\",\"a\":\"tpwb\"}},{\"type\":\"InstantRP\",\"status\":\"Deleted\",\"extendedInfo\":{\"ankjpdnjzh\":\"bqzmizaka\",\"lmuoyxprimrsopte\":\"joylh\",\"wxdzaumweoohgu\":\"cjmeislstvasy\",\"emwmdxmebwjs\":\"fuzboyjathwtzolb\"}}],\"recoveryPointMoveReadinessInfo\":{\"xnmwmqtibxyijddt\":{\"isReadyForMove\":false,\"additionalInfo\":\"xveabf\"}},\"recoveryPointProperties\":{\"expiryTime\":\"ttadijae\",\"ruleName\":\"mrsieekp\"}}")
                .toObject(AzureWorkloadSapHanaRecoveryPoint.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-17T20:12:30Z"), model.recoveryPointTimeInUtc());
        Assertions.assertEquals(RestorePointType.FULL, model.type());
        Assertions.assertEquals(RecoveryPointTierType.INVALID, model.recoveryPointTierDetails().get(0).type());
        Assertions.assertEquals(RecoveryPointTierStatus.DELETED, model.recoveryPointTierDetails().get(0).status());
        Assertions
            .assertEquals("ylkdghrje", model.recoveryPointTierDetails().get(0).extendedInfo().get("utlwxezwzhok"));
        Assertions.assertEquals(false, model.recoveryPointMoveReadinessInfo().get("xnmwmqtibxyijddt").isReadyForMove());
        Assertions
            .assertEquals("xveabf", model.recoveryPointMoveReadinessInfo().get("xnmwmqtibxyijddt").additionalInfo());
        Assertions.assertEquals("ttadijae", model.recoveryPointProperties().expiryTime());
        Assertions.assertEquals("mrsieekp", model.recoveryPointProperties().ruleName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureWorkloadSapHanaRecoveryPoint model =
            new AzureWorkloadSapHanaRecoveryPoint()
                .withRecoveryPointTimeInUtc(OffsetDateTime.parse("2021-07-17T20:12:30Z"))
                .withType(RestorePointType.FULL)
                .withRecoveryPointTierDetails(
                    Arrays
                        .asList(
                            new RecoveryPointTierInformationV2()
                                .withType(RecoveryPointTierType.INVALID)
                                .withStatus(RecoveryPointTierStatus.DELETED)
                                .withExtendedInfo(
                                    mapOf(
                                        "utlwxezwzhok",
                                        "ylkdghrje",
                                        "ehgpp",
                                        "bwnhhtql",
                                        "csheafidltugsr",
                                        "pifhpfeoajvgcxtx")),
                            new RecoveryPointTierInformationV2()
                                .withType(RecoveryPointTierType.INVALID)
                                .withStatus(RecoveryPointTierStatus.INVALID)
                                .withExtendedInfo(
                                    mapOf("iftxfkf", "h", "ucb", "egprhptil", "riz", "qtgdqohmcwsl", "a", "tpwb")),
                            new RecoveryPointTierInformationV2()
                                .withType(RecoveryPointTierType.INSTANT_RP)
                                .withStatus(RecoveryPointTierStatus.DELETED)
                                .withExtendedInfo(
                                    mapOf(
                                        "ankjpdnjzh",
                                        "bqzmizaka",
                                        "lmuoyxprimrsopte",
                                        "joylh",
                                        "wxdzaumweoohgu",
                                        "cjmeislstvasy",
                                        "emwmdxmebwjs",
                                        "fuzboyjathwtzolb"))))
                .withRecoveryPointMoveReadinessInfo(
                    mapOf(
                        "xnmwmqtibxyijddt",
                        new RecoveryPointMoveReadinessInfo().withIsReadyForMove(false).withAdditionalInfo("xveabf")))
                .withRecoveryPointProperties(
                    new RecoveryPointProperties().withExpiryTime("ttadijae").withRuleName("mrsieekp"));
        model = BinaryData.fromObject(model).toObject(AzureWorkloadSapHanaRecoveryPoint.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-17T20:12:30Z"), model.recoveryPointTimeInUtc());
        Assertions.assertEquals(RestorePointType.FULL, model.type());
        Assertions.assertEquals(RecoveryPointTierType.INVALID, model.recoveryPointTierDetails().get(0).type());
        Assertions.assertEquals(RecoveryPointTierStatus.DELETED, model.recoveryPointTierDetails().get(0).status());
        Assertions
            .assertEquals("ylkdghrje", model.recoveryPointTierDetails().get(0).extendedInfo().get("utlwxezwzhok"));
        Assertions.assertEquals(false, model.recoveryPointMoveReadinessInfo().get("xnmwmqtibxyijddt").isReadyForMove());
        Assertions
            .assertEquals("xveabf", model.recoveryPointMoveReadinessInfo().get("xnmwmqtibxyijddt").additionalInfo());
        Assertions.assertEquals("ttadijae", model.recoveryPointProperties().expiryTime());
        Assertions.assertEquals("mrsieekp", model.recoveryPointProperties().ruleName());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
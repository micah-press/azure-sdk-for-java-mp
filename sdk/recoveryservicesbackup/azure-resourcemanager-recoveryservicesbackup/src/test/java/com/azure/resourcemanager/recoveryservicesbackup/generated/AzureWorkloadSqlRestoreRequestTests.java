// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureWorkloadSqlRestoreRequest;
import com.azure.resourcemanager.recoveryservicesbackup.models.OverwriteOptions;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryMode;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryType;
import com.azure.resourcemanager.recoveryservicesbackup.models.SqlDataDirectoryMapping;
import com.azure.resourcemanager.recoveryservicesbackup.models.SqlDataDirectoryType;
import com.azure.resourcemanager.recoveryservicesbackup.models.TargetRestoreInfo;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureWorkloadSqlRestoreRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureWorkloadSqlRestoreRequest model =
            BinaryData
                .fromString(
                    "{\"objectType\":\"AzureWorkloadSQLRestoreRequest\",\"shouldUseAlternateTargetLocation\":true,\"isNonRecoverable\":true,\"alternateDirectoryPaths\":[{\"mappingType\":\"Data\",\"sourceLogicalName\":\"hcmavmqfo\",\"sourcePath\":\"or\",\"targetPath\":\"gyyprotwy\"},{\"mappingType\":\"Log\",\"sourceLogicalName\":\"mbxhugcmjkav\",\"sourcePath\":\"or\",\"targetPath\":\"ftpmdtzfjltfv\"},{\"mappingType\":\"Data\",\"sourceLogicalName\":\"jtotpvopvpbd\",\"sourcePath\":\"qgqqihedsvqwthmk\",\"targetPath\":\"bcysih\"},{\"mappingType\":\"Data\",\"sourceLogicalName\":\"wdhohsdtmcdzsu\",\"sourcePath\":\"ohdxbzlmcmu\",\"targetPath\":\"cvhd\"}],\"recoveryType\":\"Invalid\",\"sourceResourceId\":\"qqxeyskon\",\"propertyBag\":{\"wxeqocljmygvkzqk\":\"nkfkbgbzb\",\"rtle\":\"jeokbzefezrxccz\",\"zdix\":\"pqxbkwvzgnzvdf\"},\"targetInfo\":{\"overwriteOption\":\"Invalid\",\"containerId\":\"odawopqhewjptmcg\",\"databaseName\":\"ostzelndlatu\",\"targetDirectoryForFileRestore\":\"zlbiojlvfhrbbpn\"},\"recoveryMode\":\"FileRecovery\",\"targetVirtualMachineId\":\"wwyyurmoch\"}")
                .toObject(AzureWorkloadSqlRestoreRequest.class);
        Assertions.assertEquals(RecoveryType.INVALID, model.recoveryType());
        Assertions.assertEquals("qqxeyskon", model.sourceResourceId());
        Assertions.assertEquals("nkfkbgbzb", model.propertyBag().get("wxeqocljmygvkzqk"));
        Assertions.assertEquals(OverwriteOptions.INVALID, model.targetInfo().overwriteOption());
        Assertions.assertEquals("odawopqhewjptmcg", model.targetInfo().containerId());
        Assertions.assertEquals("ostzelndlatu", model.targetInfo().databaseName());
        Assertions.assertEquals("zlbiojlvfhrbbpn", model.targetInfo().targetDirectoryForFileRestore());
        Assertions.assertEquals(RecoveryMode.FILE_RECOVERY, model.recoveryMode());
        Assertions.assertEquals("wwyyurmoch", model.targetVirtualMachineId());
        Assertions.assertEquals(true, model.shouldUseAlternateTargetLocation());
        Assertions.assertEquals(true, model.isNonRecoverable());
        Assertions.assertEquals(SqlDataDirectoryType.DATA, model.alternateDirectoryPaths().get(0).mappingType());
        Assertions.assertEquals("hcmavmqfo", model.alternateDirectoryPaths().get(0).sourceLogicalName());
        Assertions.assertEquals("or", model.alternateDirectoryPaths().get(0).sourcePath());
        Assertions.assertEquals("gyyprotwy", model.alternateDirectoryPaths().get(0).targetPath());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureWorkloadSqlRestoreRequest model =
            new AzureWorkloadSqlRestoreRequest()
                .withRecoveryType(RecoveryType.INVALID)
                .withSourceResourceId("qqxeyskon")
                .withPropertyBag(
                    mapOf("wxeqocljmygvkzqk", "nkfkbgbzb", "rtle", "jeokbzefezrxccz", "zdix", "pqxbkwvzgnzvdf"))
                .withTargetInfo(
                    new TargetRestoreInfo()
                        .withOverwriteOption(OverwriteOptions.INVALID)
                        .withContainerId("odawopqhewjptmcg")
                        .withDatabaseName("ostzelndlatu")
                        .withTargetDirectoryForFileRestore("zlbiojlvfhrbbpn"))
                .withRecoveryMode(RecoveryMode.FILE_RECOVERY)
                .withTargetVirtualMachineId("wwyyurmoch")
                .withShouldUseAlternateTargetLocation(true)
                .withIsNonRecoverable(true)
                .withAlternateDirectoryPaths(
                    Arrays
                        .asList(
                            new SqlDataDirectoryMapping()
                                .withMappingType(SqlDataDirectoryType.DATA)
                                .withSourceLogicalName("hcmavmqfo")
                                .withSourcePath("or")
                                .withTargetPath("gyyprotwy"),
                            new SqlDataDirectoryMapping()
                                .withMappingType(SqlDataDirectoryType.LOG)
                                .withSourceLogicalName("mbxhugcmjkav")
                                .withSourcePath("or")
                                .withTargetPath("ftpmdtzfjltfv"),
                            new SqlDataDirectoryMapping()
                                .withMappingType(SqlDataDirectoryType.DATA)
                                .withSourceLogicalName("jtotpvopvpbd")
                                .withSourcePath("qgqqihedsvqwthmk")
                                .withTargetPath("bcysih"),
                            new SqlDataDirectoryMapping()
                                .withMappingType(SqlDataDirectoryType.DATA)
                                .withSourceLogicalName("wdhohsdtmcdzsu")
                                .withSourcePath("ohdxbzlmcmu")
                                .withTargetPath("cvhd")));
        model = BinaryData.fromObject(model).toObject(AzureWorkloadSqlRestoreRequest.class);
        Assertions.assertEquals(RecoveryType.INVALID, model.recoveryType());
        Assertions.assertEquals("qqxeyskon", model.sourceResourceId());
        Assertions.assertEquals("nkfkbgbzb", model.propertyBag().get("wxeqocljmygvkzqk"));
        Assertions.assertEquals(OverwriteOptions.INVALID, model.targetInfo().overwriteOption());
        Assertions.assertEquals("odawopqhewjptmcg", model.targetInfo().containerId());
        Assertions.assertEquals("ostzelndlatu", model.targetInfo().databaseName());
        Assertions.assertEquals("zlbiojlvfhrbbpn", model.targetInfo().targetDirectoryForFileRestore());
        Assertions.assertEquals(RecoveryMode.FILE_RECOVERY, model.recoveryMode());
        Assertions.assertEquals("wwyyurmoch", model.targetVirtualMachineId());
        Assertions.assertEquals(true, model.shouldUseAlternateTargetLocation());
        Assertions.assertEquals(true, model.isNonRecoverable());
        Assertions.assertEquals(SqlDataDirectoryType.DATA, model.alternateDirectoryPaths().get(0).mappingType());
        Assertions.assertEquals("hcmavmqfo", model.alternateDirectoryPaths().get(0).sourceLogicalName());
        Assertions.assertEquals("or", model.alternateDirectoryPaths().get(0).sourcePath());
        Assertions.assertEquals("gyyprotwy", model.alternateDirectoryPaths().get(0).targetPath());
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
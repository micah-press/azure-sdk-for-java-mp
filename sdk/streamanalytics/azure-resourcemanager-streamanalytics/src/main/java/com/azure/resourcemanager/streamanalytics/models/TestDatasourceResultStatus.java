// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The status of the test input or output request.
 */
public final class TestDatasourceResultStatus extends ExpandableStringEnum<TestDatasourceResultStatus> {
    /**
     * Static value TestSucceeded for TestDatasourceResultStatus.
     */
    public static final TestDatasourceResultStatus TEST_SUCCEEDED = fromString("TestSucceeded");

    /**
     * Static value TestFailed for TestDatasourceResultStatus.
     */
    public static final TestDatasourceResultStatus TEST_FAILED = fromString("TestFailed");

    /**
     * Creates a new instance of TestDatasourceResultStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public TestDatasourceResultStatus() {
    }

    /**
     * Creates or finds a TestDatasourceResultStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding TestDatasourceResultStatus.
     */
    public static TestDatasourceResultStatus fromString(String name) {
        return fromString(name, TestDatasourceResultStatus.class);
    }

    /**
     * Gets known TestDatasourceResultStatus values.
     * 
     * @return known TestDatasourceResultStatus values.
     */
    public static Collection<TestDatasourceResultStatus> values() {
        return values(TestDatasourceResultStatus.class);
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Refund policy result property. */
@Fluent
public final class RefundPolicyResultProperty {
    /*
     * Pricing information containing the amount and the currency code
     */
    @JsonProperty(value = "consumedRefundsTotal")
    private Price consumedRefundsTotal;

    /*
     * Pricing information containing the amount and the currency code
     */
    @JsonProperty(value = "maxRefundLimit")
    private Price maxRefundLimit;

    /*
     * Refund Policy errors
     */
    @JsonProperty(value = "policyErrors")
    private List<RefundPolicyError> policyErrors;

    /** Creates an instance of RefundPolicyResultProperty class. */
    public RefundPolicyResultProperty() {
    }

    /**
     * Get the consumedRefundsTotal property: Pricing information containing the amount and the currency code.
     *
     * @return the consumedRefundsTotal value.
     */
    public Price consumedRefundsTotal() {
        return this.consumedRefundsTotal;
    }

    /**
     * Set the consumedRefundsTotal property: Pricing information containing the amount and the currency code.
     *
     * @param consumedRefundsTotal the consumedRefundsTotal value to set.
     * @return the RefundPolicyResultProperty object itself.
     */
    public RefundPolicyResultProperty withConsumedRefundsTotal(Price consumedRefundsTotal) {
        this.consumedRefundsTotal = consumedRefundsTotal;
        return this;
    }

    /**
     * Get the maxRefundLimit property: Pricing information containing the amount and the currency code.
     *
     * @return the maxRefundLimit value.
     */
    public Price maxRefundLimit() {
        return this.maxRefundLimit;
    }

    /**
     * Set the maxRefundLimit property: Pricing information containing the amount and the currency code.
     *
     * @param maxRefundLimit the maxRefundLimit value to set.
     * @return the RefundPolicyResultProperty object itself.
     */
    public RefundPolicyResultProperty withMaxRefundLimit(Price maxRefundLimit) {
        this.maxRefundLimit = maxRefundLimit;
        return this;
    }

    /**
     * Get the policyErrors property: Refund Policy errors.
     *
     * @return the policyErrors value.
     */
    public List<RefundPolicyError> policyErrors() {
        return this.policyErrors;
    }

    /**
     * Set the policyErrors property: Refund Policy errors.
     *
     * @param policyErrors the policyErrors value to set.
     * @return the RefundPolicyResultProperty object itself.
     */
    public RefundPolicyResultProperty withPolicyErrors(List<RefundPolicyError> policyErrors) {
        this.policyErrors = policyErrors;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (consumedRefundsTotal() != null) {
            consumedRefundsTotal().validate();
        }
        if (maxRefundLimit() != null) {
            maxRefundLimit().validate();
        }
        if (policyErrors() != null) {
            policyErrors().forEach(e -> e.validate());
        }
    }
}
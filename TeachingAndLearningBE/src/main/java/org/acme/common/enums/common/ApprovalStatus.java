/**
 * ApprovalStatus.java
 *
 * Feb 02, 2025
 *
 * Version: 1.0.1
 *
 * Copyright(c) T & L Agency Pvt Ltd. All Rights Reserved.
 * This software is the proprietary information of T & L Agency Pvt Ltd.
 */
package org.acme.common.enums.common;

/**
 * Enum representing the state of a created Instance in the system.
 * INITIAL - The created state
 * PENDING - After send to Approval
 * APPROVED - Got approves state
 * REJECTED - Rejected after apply for approval
 * 
 * @author Pasan
 */
public enum ApprovalStatus {
    INITIAL, PENDING, APPROVED, REJECTED;

    /**
     * This will convert the Approval state from String to enum
     * 
     * @param approvalState Approval State as a String
     * @return A {@link ApprovalStatus} corresponding to a String
     */
    public static ApprovalStatus fromString(String approvalState) {
        return switch (approvalState) {
            case "INITIAL" -> INITIAL;
            case "PENDING" -> PENDING;
            case "APPROVED" -> APPROVED;
            case "REJECTED" -> REJECTED;
            default -> null;
        };
    }

}

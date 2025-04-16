/**
 * TeacherSignupDetailsDTO.java
 *
 * Feb 02, 2025
 *
 * Version: 1.0.1
 *
 * Copyright(c) T & L Agency Pvt Ltd. All Rights Reserved.
 * This software is the proprietary information of T & L Agency Pvt Ltd.
 */
package org.acme.common.dto.teacher;

import org.acme.common.enums.common.ApprovalStatus;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 * DTO contains data related to Teacher creation
 * 
 * @author Pasan
 */
@Getter
@Setter
public class TeacherSignupDetailsDTO {
    private Long id;

    @NotNull(message = "The Teacher Name CAnnot be NUll !")
    private String name;

    @NotNull(message = "Age Cannot be Null !")
    private int age;

    @NotNull(message = "NIC Number cannot be Null !")
    private String nicNumber;

    @NotNull(message = "WhatsApp number cannot be NUll !")
    private String whatsappNumber;

    @NotNull(message = "Teacher type cannot be Null!")
    private String teachetType;

    @NotNull(message = "language Medium canot be Null!")
    private String languageMedium;

    @NotNull(message = "Education level cannot be Null!")
    private String eduLevel;

    private String alSubjectStream;
    private String physicalScienceSubjects;
    private String bioScienceSubjects;
    private String commerceSubjects;
    private String artSubjects;
    private String technologySubjects;
    private String olSubjects;
    private String password;
    private ApprovalStatus approvalStatus;

    // S3 key data for certificate upload
}

/**
 * TeacherSignUp.java
 *
 * Feb 02, 2025
 *
 * Version: 1.0.1
 *
 * Copyright(c) T & L Agency Pvt Ltd. All Rights Reserved.
 * This software is the proprietary information of T & L Agency Pvt Ltd.
 */
package org.acme.repository.entities.teacher;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * Entity representing the data related to a newly added Teacher for the system.
 * 
 * @author Pasan
 */
@Getter
@Setter
@Entity
@Table(name = "teacher_sign_up")
public class TeacherSignUp {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "nic_number")
    private String nicNumber;

    @Column(name = "whatsapp_number")
    private String whatsappNumber;

    @Column(name = "teacher_type")
    private String teachetType;

    @Column(name = "language_medium")
    private String languageMedium;

    @Column(name = "education_level")
    private String eduLevel;

    @Column(name = "al_subject_stream")
    private String alSubjectStream;

    @Column(name = "physical_science_subjects")
    private String physicalScienceSubjects;

    @Column(name = "bio_science_subjects")
    private String bioScienceSubjects;

    @Column(name = "commerce_subjects")
    private String commerceSubjects;

    @Column(name = "art_subjects")
    private String artSubjects;

    @Column(name = "technology_subjects")
    private String technologySubjects;

    @Column(name = "ol_subjects")
    private String olSubjects;

    // S3 key column
}

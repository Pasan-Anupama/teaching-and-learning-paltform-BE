package org.acme.repository.entities.student;

import java.math.BigInteger;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * Entity representing the data related to a newly added student for the system.
 * 
 * @author Pasan
 */
@Getter
@Setter
@Entity
@Table(name = "student_sign_up")
public class StudentSignUp {
    
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private BigInteger age;

    @Column(name = "email")
    private String email;

    @Column(name = "whatsapp_number")
    private String whatsappNumber;

    @Column(name = "language_medium")
    private String languageMedium;

    @Column(name = "education_level")
    private String educationLevel;

    @Column(name = "al_stream")
    private String alStream;

    @Column(name = "ol_first_category")
    private String olFirstCategory;

    @Column(name = "ol_second_category")
    private String olSecondCategory;

    @Column(name = "ol_third_category")
    private String olThirdCategory;

    //Add suitable column for S3 key for the uploaded documents
}

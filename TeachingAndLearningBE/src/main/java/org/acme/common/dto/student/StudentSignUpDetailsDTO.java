package org.acme.common.dto.student;

import java.math.BigInteger;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 * DTO contains data related to stuednt creation
 * 
 * @author Pasan
 */
@Getter
@Setter
public class StudentSignUpDetailsDTO {
    private Long id;

    @NotNull(message = "Student name cannot be Null!")
    private String name;

    @NotNull(message = "Age cannot be Null!")
    private BigInteger age;

    @NotNull(message = "Email canot be Null!")
    private String email;

    @NotNull(message = "WhatsApp number cannot be Null!")
    private String whatsappNumber;

    @NotNull(message = "Language medium cannot be Null!")
    private String languageMedium;

    @NotNull(message = "Education Level cannot be Null!")
    private String educationLevel;

    private String alStream;

    private String olFirstCategory;

    private String olSecondCategory;

    private String olThirdCategory;

    // Add suitable data for S3 key
}

/**
 * StudentService.java
 *
 * Jan 20, 2025
 *
 * Version: 1.0.1
 *
 * Copyright(c) T & L Agency Pvt Ltd. All Rights Reserved.
 * This software is the proprietary information of T & L Agency Pvt Ltd.
 */
package org.acme.commsndService.student;

import org.acme.common.dto.student.StudentSignUpDetailsDTO;
import org.acme.repository.entities.student.StudentSignUp;
import org.acme.repository.objToDTOTransformer.student.StudentSignUpObjDTOTransformer;
import org.acme.repository.repository.student.StudentRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

/**
 * The Service class to perform CRUD operations related to Student creation
 * 
 * @author Pasan
 */
@ApplicationScoped
public class StudentService {
    @Inject
    private StudentRepository studentRepository;

    /**
     * The Service to add newly created student to the database
     * 
     * @param studentSignUpDetailsDTO The DTO class which carries the details of the
     *                                student
     * @return a success message
     */
    @Transactional
    public String addStudent(StudentSignUpDetailsDTO studentSignUpDetailsDTO) {
        StudentSignUp studentDetails = StudentSignUpObjDTOTransformer.dtoToEntityTransform(studentSignUpDetailsDTO);

        studentRepository.persist(studentDetails);

        return "New Student added Successfully";
    }
}

/**
 * TeacherService.java
 *
 * Feb 02, 2025
 *
 * Version: 1.0.1
 *
 * Copyright(c) T & L Agency Pvt Ltd. All Rights Reserved.
 * This software is the proprietary information of T & L Agency Pvt Ltd.
 */
package org.acme.commsndService.teacher;

import org.acme.common.dto.teacher.TeacherSignupDetailsDTO;
import org.acme.repository.entities.teacher.TeacherSignUp;
import org.acme.repository.objToDTOTransformer.teacher.TeacherSignUpObjDTOTransformer;
import org.acme.repository.repository.teacher.TeacherRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

/**
 * The Service class to perform CRUD operations related to Teacher creation
 * 
 * @author Pasan
 */
@ApplicationScoped
public class TeacherService {
    @Inject
    private TeacherRepository teacherRepository;

    /**
     * The service to send newly created Teacher to the Approval process and write
     * thye script to the database
     * 
     * @param signupDetailsDTO The DTO which contains details related to newly
     *                         created Teacher
     * @return a success message
     */
    @Transactional
    public String addTeacher(TeacherSignupDetailsDTO signupDetailsDTO) {
        TeacherSignUp signUpDetails = TeacherSignUpObjDTOTransformer.dtoToEntityTransform(signupDetailsDTO);

        teacherRepository.persist(signUpDetails);

        return "Teacher Details send to Approval successfully";
    }

}

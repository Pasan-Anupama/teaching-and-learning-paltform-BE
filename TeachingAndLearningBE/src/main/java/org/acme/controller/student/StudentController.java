/**
 * StudentController.java
 *
 * Jan 20, 2025
 *
 * Version: 1.0.1
 *
 * Copyright(c) T & L Agency Pvt Ltd. All Rights Reserved.
 * This software is the proprietary information of T & L Agency Pvt Ltd.
 */
package org.acme.controller.student;

import org.acme.common.dto.student.StudentSignUpDetailsDTO;
import org.acme.commsndService.student.StudentService;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

/**
 * The APIs related tom Student Creation, Edit, Delete and Get
 * 
 * @author Pasan
 */
@Path("/student")
public class StudentController {
    @Inject
    private StudentService studentService;

    /**
     * The API to create a new student in th system
     * 
     * @param studentSignUpDetailsDTO The DTO which carries the details of a new
     *                                student
     * @return a success message
     */
    @POST
    @Path("/create")
    public String createStudent(StudentSignUpDetailsDTO studentSignUpDetailsDTO) {
        return studentService.addStudent(studentSignUpDetailsDTO);
    }
}

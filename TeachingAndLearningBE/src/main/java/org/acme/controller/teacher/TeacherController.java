/**
 * TeacherController.java
 *
 * Feb 02, 2025
 *
 * Version: 1.0.1
 *
 * Copyright(c) T & L Agency Pvt Ltd. All Rights Reserved.
 * This software is the proprietary information of T & L Agency Pvt Ltd.
 */
package org.acme.controller.teacher;

import org.acme.common.dto.teacher.TeacherSignupDetailsDTO;
import org.acme.commsndService.teacher.TeacherService;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

/**
 * The APIs related tom Teacher Creation, Edit, Delete and Get
 * 
 * @author Pasan
 */
@Path("/teacher")
public class TeacherController {
    @Inject
    private TeacherService teacherService;

    /**
     * The End poinyt to add new Teacher t the system
     * 
     * @param teacherSignupDetailsDTO The DTO which contains the data of a newly
     *                                created Teacher
     * @return a success message
     */
    @POST
    @Path("/create")
    public String createTeacher(TeacherSignupDetailsDTO teacherSignupDetailsDTO) {
        return teacherService.addTeacher(teacherSignupDetailsDTO);
    }
}

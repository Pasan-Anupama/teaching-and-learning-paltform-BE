package org.acme.controller.student;

import org.acme.common.dto.student.StudentSignUpDetailsDTO;
import org.acme.commsndService.student.StudentService;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/student")
public class StudentController {
    @Inject
    private StudentService studentService;

    @POST
    @Path("/create")
    public String createStudent(StudentSignUpDetailsDTO studentSignUpDetailsDTO){
        System.out.println("Controller access ok");
        return studentService.addStudent(studentSignUpDetailsDTO);
    }
}

package org.acme.commsndService.student;

import org.acme.common.dto.student.StudentSignUpDetailsDTO;
import org.acme.repository.entities.student.StudentSignUp;
import org.acme.repository.objToDTOTransformer.student.StudentSignUpObjDTOTransformer;
import org.acme.repository.repository.student.StudentRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class StudentService {
    @Inject
    private StudentRepository studentRepository;

    @Transactional
    public String addStudent(StudentSignUpDetailsDTO studentSignUpDetailsDTO){
        StudentSignUp studentDetails = StudentSignUpObjDTOTransformer.dtoToEntityTransform(studentSignUpDetailsDTO);

        studentRepository.persist(studentDetails);

        return "New Student added Successfully";
    }
}

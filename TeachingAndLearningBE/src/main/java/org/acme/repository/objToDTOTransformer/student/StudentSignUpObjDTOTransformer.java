package org.acme.repository.objToDTOTransformer.student;

import org.acme.common.dto.student.StudentSignUpDetailsDTO;
import org.acme.repository.entities.student.StudentSignUp;

/**
 * The transformer class use to transform data between StudentSignUp entity and
 * StudentSignUpDtailsDTO 
 * 
 * @author Pasan
 */
public class StudentSignUpObjDTOTransformer {
    
    /**
     * Converts a StudentSignUpDTO into StudentSignUp entity
     *  
     * @param signUpDetailsDTO The data transfer object containing student signUp details
     * @return StudentSignUp entity
     */
    public static StudentSignUp dtoToEntityTransform(StudentSignUpDetailsDTO signUpDetailsDTO) {
        StudentSignUp studentEntity = new StudentSignUp();

        studentEntity.setId(signUpDetailsDTO.getId());
        studentEntity.setName(signUpDetailsDTO.getName());
        studentEntity.setAge(signUpDetailsDTO.getAge());
        studentEntity.setEmail(signUpDetailsDTO.getEmail());
        studentEntity.setWhatsappNumber(signUpDetailsDTO.getWhatsappNumber());
        studentEntity.setLanguageMedium(signUpDetailsDTO.getLanguageMedium());
        studentEntity.setEducationLevel(signUpDetailsDTO.getEducationLevel());
        studentEntity.setAlStream(signUpDetailsDTO.getAlStream());
        studentEntity.setOlFirstCategory(signUpDetailsDTO.getOlFirstCategory());
        studentEntity.setOlSecondCategory(signUpDetailsDTO.getOlSecondCategory());
        studentEntity.setOlThirdCategory(signUpDetailsDTO.getOlThirdCategory());

        return studentEntity;
    }

    /**
     * Converts a StudentSignUp entity into a StudentDetailsDTO object
     * 
     * @param studentEntity The Entity class that neds to be convberted
     * @return an instance of StudentSignUpDetailsDTO
     */
    public static StudentSignUpDetailsDTO entityToDTOTransform(StudentSignUp studentEntity){
        StudentSignUpDetailsDTO studentSignUpDetailsDTO = new StudentSignUpDetailsDTO();

        studentSignUpDetailsDTO.setId(studentEntity.getId());
        studentSignUpDetailsDTO.setName(studentEntity.getName());
        studentSignUpDetailsDTO.setAge(studentEntity.getAge());
        studentSignUpDetailsDTO.setEmail(studentEntity.getEmail());
        studentSignUpDetailsDTO.setWhatsappNumber(studentEntity.getWhatsappNumber());
        studentSignUpDetailsDTO.setLanguageMedium(studentEntity.getLanguageMedium());
        studentSignUpDetailsDTO.setEducationLevel(studentEntity.getEducationLevel());
        studentSignUpDetailsDTO.setAlStream(studentEntity.getAlStream());
        studentSignUpDetailsDTO.setOlFirstCategory(studentEntity.getOlFirstCategory());
        studentSignUpDetailsDTO.setOlSecondCategory(studentEntity.getOlSecondCategory());
        studentSignUpDetailsDTO.setOlThirdCategory(studentEntity.getOlThirdCategory());

        return studentSignUpDetailsDTO ;
    }
}

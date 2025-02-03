/**
 * TeacherSignUpObjDTOTransformer.java
 *
 * Feb 02, 2025
 *
 * Version: 1.0.1
 *
 * Copyright(c) T & L Agency Pvt Ltd. All Rights Reserved.
 * This software is the proprietary information of T & L Agency Pvt Ltd.
 */
package org.acme.repository.objToDTOTransformer.teacher;

import org.acme.common.dto.teacher.TeacherSignupDetailsDTO;
import org.acme.repository.entities.teacher.TeacherSignUp;

/**
 * The transformer class use to transform data between TeacherSignUp entity and
 * TeacherSignUpDetailsDTO
 * 
 * @author Pasan
 */
public class TeacherSignUpObjDTOTransformer {

    /**
     * Converts TeacherSignUpDTO into TeacherSignUp entity
     * 
     * @param teacherSignupDetailsDTO The DTO class which contains the details of
     *                                the teacher to be added
     * @return TeacherSignUp entity
     */
    public static TeacherSignUp dtoToEntityTransform(TeacherSignupDetailsDTO teacherSignupDetailsDTO) {
        TeacherSignUp teacherSignUp = new TeacherSignUp();

        teacherSignUp.setId(teacherSignupDetailsDTO.getId());
        teacherSignUp.setName(teacherSignupDetailsDTO.getName());
        teacherSignUp.setAge(teacherSignupDetailsDTO.getAge());
        teacherSignUp.setNicNumber(teacherSignupDetailsDTO.getNicNumber());
        teacherSignUp.setWhatsappNumber(teacherSignupDetailsDTO.getWhatsappNumber());
        teacherSignUp.setTeachetType(teacherSignupDetailsDTO.getTeachetType());
        teacherSignUp.setLanguageMedium(teacherSignupDetailsDTO.getLanguageMedium());
        teacherSignUp.setEduLevel(teacherSignupDetailsDTO.getEduLevel());
        teacherSignUp.setAlSubjectStream(teacherSignupDetailsDTO.getAlSubjectStream());
        teacherSignUp.setPhysicalScienceSubjects(teacherSignupDetailsDTO.getPhysicalScienceSubjects());
        teacherSignUp.setBioScienceSubjects(teacherSignupDetailsDTO.getBioScienceSubjects());
        teacherSignUp.setCommerceSubjects(teacherSignupDetailsDTO.getCommerceSubjects());
        teacherSignUp.setArtSubjects(teacherSignupDetailsDTO.getArtSubjects());
        teacherSignUp.setTechnologySubjects(teacherSignupDetailsDTO.getTechnologySubjects());
        teacherSignUp.setOlSubjects(teacherSignupDetailsDTO.getOlSubjects());

        return teacherSignUp;
    }

    /**
     * Converts TeacherSignUp Entity into TeacherSignUpDTO
     * 
     * @param teacherSignUp the entity class that needed to be converted
     * @return an instance of TeacherSignupDetailsDTO
     */
    public static TeacherSignupDetailsDTO entityToDtoTransform(TeacherSignUp teacherSignUp) {
        TeacherSignupDetailsDTO teacherSignupDetailsDTO = new TeacherSignupDetailsDTO();

        teacherSignupDetailsDTO.setId(teacherSignUp.getId());
        teacherSignupDetailsDTO.setName(teacherSignUp.getName());
        teacherSignupDetailsDTO.setAge(teacherSignUp.getAge());
        teacherSignupDetailsDTO.setNicNumber(teacherSignUp.getNicNumber());
        teacherSignupDetailsDTO.setWhatsappNumber(teacherSignUp.getWhatsappNumber());
        teacherSignupDetailsDTO.setTeachetType(teacherSignUp.getTeachetType());
        teacherSignupDetailsDTO.setLanguageMedium(teacherSignUp.getLanguageMedium());
        teacherSignupDetailsDTO.setEduLevel(teacherSignUp.getEduLevel());
        teacherSignupDetailsDTO.setAlSubjectStream(teacherSignUp.getAlSubjectStream());
        teacherSignupDetailsDTO.setPhysicalScienceSubjects(teacherSignUp.getPhysicalScienceSubjects());
        teacherSignupDetailsDTO.setBioScienceSubjects(teacherSignUp.getBioScienceSubjects());
        teacherSignupDetailsDTO.setCommerceSubjects(teacherSignUp.getCommerceSubjects());
        teacherSignupDetailsDTO.setArtSubjects(teacherSignUp.getArtSubjects());
        teacherSignupDetailsDTO.setTechnologySubjects(teacherSignUp.getTechnologySubjects());
        teacherSignupDetailsDTO.setOlSubjects(teacherSignUp.getOlSubjects());

        return teacherSignupDetailsDTO;
    }

}

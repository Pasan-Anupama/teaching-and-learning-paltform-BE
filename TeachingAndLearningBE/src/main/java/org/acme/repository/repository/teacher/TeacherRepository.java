/**
 * TeacherRepository.java
 *
 * Feb 02, 2025
 *
 * Version: 1.0.1
 *
 * Copyright(c) T & L Agency Pvt Ltd. All Rights Reserved.
 * This software is the proprietary information of T & L Agency Pvt Ltd.
 */
package org.acme.repository.repository.teacher;

import org.acme.repository.entities.teacher.TeacherSignUp;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

/**
 * The Repository class for Teacher Sign Up
 * 
 * @author Pasan
 */
@ApplicationScoped
public class TeacherRepository implements PanacheRepository<TeacherSignUp> {

}

/**
 * StudentRepository.java
 *
 * Jan 20, 2025
 *
 * Version: 1.0.1
 *
 * Copyright(c) T & L Agency Pvt Ltd. All Rights Reserved.
 * This software is the proprietary information of T & L Agency Pvt Ltd.
 */
package org.acme.repository.repository.student;

import org.acme.repository.entities.student.StudentSignUp;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

/**
 * The Repository class for StudentsSignUp
 * 
 * @author Pasan
 */
@ApplicationScoped
public class StudentRepository implements PanacheRepository<StudentSignUp> {

}

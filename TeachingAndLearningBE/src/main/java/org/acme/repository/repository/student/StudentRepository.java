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

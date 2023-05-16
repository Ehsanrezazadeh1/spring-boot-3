package com.ehsan.cruddemo.DAO;

import com.ehsan.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentDAOImpl implements StudentDAO{

    //define field for entity manager

    private EntityManager entityManager;

    // inject entity manager using constructor injection

    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    //implement save method

    @Override
    @Transactional  //we want update
    public void save(Student thestudent) {
        entityManager.persist(thestudent);
    }
}


















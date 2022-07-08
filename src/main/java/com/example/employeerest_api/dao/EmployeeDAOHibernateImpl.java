package com.example.employeerest_api.dao;

import com.example.employeerest_api.entity.Employee;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.query.Query ;

import javax.persistence.EntityManager;
import java.util.List;


@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

    // create the injection
    private EntityManager entityManager ;

    @Autowired
    public EmployeeDAOHibernateImpl(EntityManager theEntityManager){
        entityManager = theEntityManager ;
    }

    // create the methode
    @Override
    @Transactional
    public List<Employee> findAll(){
        // get the session
        Session currentSession = entityManager.unwrap(Session.class) ;
        // create the query
        Query<Employee> theQuery =
                currentSession.createQuery("from Employee ", Employee.class);
        // execute the query
        return theQuery.getResultList();
    }
}
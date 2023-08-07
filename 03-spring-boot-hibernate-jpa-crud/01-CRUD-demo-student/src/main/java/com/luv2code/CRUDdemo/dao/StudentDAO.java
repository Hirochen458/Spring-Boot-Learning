package com.luv2code.CRUDdemo.dao;

import com.luv2code.CRUDdemo.entity.Student;

public interface StudentDAO {

    void save(Student theStudent);
    Student findByID(Integer id);
}

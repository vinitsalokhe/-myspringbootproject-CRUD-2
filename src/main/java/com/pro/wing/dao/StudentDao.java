package com.pro.wing.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pro.wing.entity.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer>{

}

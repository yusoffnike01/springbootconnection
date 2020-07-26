package com.demo.dao;

import com.demo.model.student;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<student, Integer>{

}

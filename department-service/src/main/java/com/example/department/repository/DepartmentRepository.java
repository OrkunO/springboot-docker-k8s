package com.example.department.repository;

import com.example.department.entity.Department;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends MongoRepository<Department, String> {

    Department findByDepartmentId(Long departmentId);
}

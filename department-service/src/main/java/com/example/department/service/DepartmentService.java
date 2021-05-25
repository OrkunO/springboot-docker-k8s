package com.example.department.service;

import com.example.department.entity.Department;
import com.example.department.repository.DepartmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("DepartmentService saveDepartment: " + department);
        return departmentRepository.save(department);
    }

    public Department findByDepartmentId(Long departmentId) {
        log.info("DepartmentService findByDepartmentId: " + departmentId);
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
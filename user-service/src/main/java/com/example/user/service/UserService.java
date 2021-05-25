package com.example.user.service;

import com.example.user.VO.Department;
import com.example.user.entity.User;
import com.example.user.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        log.info("UserService saveUser: " + user);

        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/1", Department.class);
        user.setDepartment(department);
        log.info("UserService saveUser department: " + department);
        
        return userRepository.save(user);
    }

    public User findByUserId(Long userId)
    {
        log.info("UserService findByUserId: " + userId);
        return userRepository.findByUserId(userId);
    }

}

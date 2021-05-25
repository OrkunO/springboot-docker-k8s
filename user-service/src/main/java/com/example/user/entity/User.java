package com.example.user.entity;

import com.example.user.VO.Department;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    
    @Id
    private String _id;

    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private Department department;

    @Override
    public String toString()
    {
        return "User: _id = " + _id + "\r\n"
            + "userId = " + userId  + "\r\n"
            + "firstName = " + firstName  + "\r\n"
            + "lastName = " + lastName  + "\r\n"
            + "email = " + email  + "\r\n"
            + "department = " + department;
    }
}

package com.example.department.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "department")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    @Id
    private String _id;
    private Long departmentId;
    private String departmentName;
    private String departmentAddress;
    
    @Override
    public String toString()
    {
        return "Department: _id = " + _id + "\r\n"
            + "departmentId = " + departmentId  + "\r\n"
            + "departmentName = " + departmentName  + "\r\n"
            + "departmentAddress = " + departmentAddress;
    }

}
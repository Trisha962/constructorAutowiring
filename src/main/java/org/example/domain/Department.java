package org.example.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Department {
    private String deptName;
    private String location;

    public Department(){}

    public Department(String deptName, String location) {
        this.deptName = deptName;
        this.location = location;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptName='" + deptName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
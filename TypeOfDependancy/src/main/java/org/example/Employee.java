package org.example;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
    private String empName;
    private int empID;
    private List<Integer> projectCode;
    private Set<String> profileName;
    private Map<String,String> project;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public List<Integer> getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(List<Integer> projectCode) {
        this.projectCode = projectCode;
    }

    public Set<String> getProfileName() {
        return profileName;
    }

    public void setProfileName(Set<String> profileName) {
        this.profileName = profileName;
    }

    public Map<String, String> getProject() {
        return project;
    }

    public void setProject(Map<String, String> project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empID=" + empID +
                ", projectCode=" + projectCode +
                ", profileName=" + profileName +
                ", project=" + project +
                '}';
    }
}

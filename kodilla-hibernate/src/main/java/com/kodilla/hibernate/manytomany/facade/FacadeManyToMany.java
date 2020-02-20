package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FacadeManyToMany {
    @Autowired
    CompanyDao company;
    @Autowired
    EmployeeDao employee;

//    List<Company> companies = new ArrayList<>();
//    List<Employee> employees = new ArrayList<>();

    public List<Company> searchCompanyByName(String companyName) {
        boolean wasError = false;
        try {
            company.findByAnyNumberOfSigns(companyName);
        } finally {
            if (wasError) {
                System.out.println("Error occurred! Operation aborted!");
            }
        }
        return company.findByAnyNumberOfSigns(companyName);
    }

    public List<Employee> searchEmployeeByName(String employeeName) {
        boolean wasError = false;
        try {
            employee.findByAnyNumberOfSigns(employeeName);
        } finally {
            if (wasError) {
                System.out.println("Error occurred! Operation aborted!");
            }
        }
        return employee.findByAnyNumberOfSigns(employeeName);
    }
}

package com.kodilla.hibernate.manytomany.dao;


import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    private CompanyDao companyDao;

    @Test
    public void testSaveManyToMany() {
        //Given
        Employee johnsmith = new Employee("John", "Smith");
        Employee lindaclarkson = new Employee("Linda", "Clarkson");
        Employee stephaniekovalsky = new Employee("Stephanie", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnsmith);
        dataMaesters.getEmployees().add(lindaclarkson);
        dataMaesters.getEmployees().add(stephaniekovalsky);
        greyMatter.getEmployees().add(johnsmith);
        greyMatter.getEmployees().add(stephaniekovalsky);

        johnsmith.getCompanies().add(softwareMachine);
        johnsmith.getCompanies().add(greyMatter);
        lindaclarkson.getCompanies().add(dataMaesters);
        stephaniekovalsky.getCompanies().add(dataMaesters);
        stephaniekovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }
}
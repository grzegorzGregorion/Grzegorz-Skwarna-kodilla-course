package com.kodilla.hibernate.manytomany.dao.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.facade.FacadeManyToMany;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoFacadeTestSuite {
    @Autowired
    private FacadeManyToMany facadeManyToMany;
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testManyToManyNamedQueries() {
        //Given
        Employee johnsmith = new Employee("John", "Smith");
        Employee lindaclarkson = new Employee("Linda", "Clarkson");
        Employee stephaniekovalsky = new Employee("Stephanie", "Kovalsky");
        Employee jamessmith = new Employee("James", "Smith");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Masters");
        Company greyMatter = new Company("Grey Matter");
        Company dataDigging = new Company("Data Digging");
        Company data = new Company("Data");

        //Software Machine
        softwareMachine.getEmployees().add(johnsmith);
        //Data Masters
        dataMaesters.getEmployees().add(lindaclarkson);
        dataMaesters.getEmployees().add(stephaniekovalsky);
        //Grey Matter
        greyMatter.getEmployees().add(johnsmith);
        greyMatter.getEmployees().add(stephaniekovalsky);
        //Data Digging
        dataDigging.getEmployees().add(johnsmith);
        dataDigging.getEmployees().add(lindaclarkson);
        dataDigging.getEmployees().add(stephaniekovalsky);
        dataDigging.getEmployees().add(jamessmith);

        johnsmith.getCompanies().add(softwareMachine);
        johnsmith.getCompanies().add(greyMatter);
        lindaclarkson.getCompanies().add(dataMaesters);
        stephaniekovalsky.getCompanies().add(dataMaesters);
        stephaniekovalsky.getCompanies().add(greyMatter);
        johnsmith.getCompanies().add(dataDigging);
        lindaclarkson.getCompanies().add(dataDigging);
        stephaniekovalsky.getCompanies().add(dataDigging);
        jamessmith.getCompanies().add(dataDigging);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();
        companyDao.save(data);
        int dataId = data.getId();

        employeeDao.save(johnsmith);
        int johnsmithId = johnsmith.getId();
        employeeDao.save(lindaclarkson);
        int lindaclarksonId = lindaclarkson.getId();
        employeeDao.save(stephaniekovalsky);
        int stephaniekovalskyId = stephaniekovalsky.getId();
        employeeDao.save(jamessmith);
        int jamessmithId = jamessmith.getId();

        List<Employee> findEmployeeByAnyNumberOfSigns1 = facadeManyToMany.searchEmployeeByName("%Smi%");
        List<Employee> findEmployeeByAnyNumberOfSigns2 = facadeManyToMany.searchEmployeeByName("%Cl%");
        List<Company> findCompanyByAnyNumberOfSigns1 = facadeManyToMany.searchCompanyByName("%te%");
        List<Company> findCompanyByAnyNumberOfSigns2 = facadeManyToMany.searchCompanyByName("%igging%");

        //Then
        Assert.assertEquals(2, findEmployeeByAnyNumberOfSigns1.size());
        Assert.assertEquals(1, findEmployeeByAnyNumberOfSigns2.size());
        Assert.assertEquals(2, findCompanyByAnyNumberOfSigns1.size());
        Assert.assertEquals(1, findCompanyByAnyNumberOfSigns2.size());

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
            companyDao.deleteById(dataId);
            companyDao.deleteById(dataId);
            employeeDao.deleteById(johnsmithId);
            employeeDao.deleteById(lindaclarksonId);
            employeeDao.deleteById(stephaniekovalskyId);
            employeeDao.deleteById(jamessmithId);
        } catch (Exception e) {
            //do nothing
        }
    }
}

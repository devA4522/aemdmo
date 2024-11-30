package com.adobe.aem.guides.demo.core.services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@Component(service = EmployeeDetails.class,immediate =true,enabled =true)
@Designate(ocd=EmployeeConfiguration.class)
public class EmployeeDetails {
    private static final Logger LOG = LoggerFactory.getLogger(EmployeeDetails.class);


    private String empId;

    private String empName;

    private String empSalary;

    private String restApi;
    @Activate
    public void activate(EmployeeConfiguration employeeConfiguration) {

        
        LOG.info("EmployeeDetails activate()");

        updateEmpDetails(employeeConfiguration);
    }

    @Deactivate
    public void deactivate(EmployeeConfiguration employeeConfiguration) {
        LOG.info("EmployeeDetails deactivate()");

        updateEmpDetails(employeeConfiguration);
    }

    @Modified
    public void modify(EmployeeConfiguration employeeConfiguration) {
        LOG.info("EmployeeDetails modify()");

        updateEmpDetails(employeeConfiguration);
    }
    public void updateEmpDetails(EmployeeConfiguration employeeConfiguration)
    {
        this.empId=employeeConfiguration.empId();

        this.empName=employeeConfiguration.empName();

        this.empSalary=employeeConfiguration.empSalary();

        this.restApi=employeeConfiguration.restApi();

        LOG.info("empId{},empName{}, empSalary{},restApi{}" , empId,empName, empSalary,restApi);
    }


}

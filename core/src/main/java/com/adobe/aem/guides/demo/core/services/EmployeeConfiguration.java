package com.adobe.aem.guides.demo.core.services;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
@ObjectClassDefinition(name ="EmployeeConfiguration",description="about EmployeeConfiguration")

public @interface EmployeeConfiguration {
    @AttributeDefinition(name="empId",
    description ="about empId",
    defaultValue= "pls Enter Emp Id",
    type=AttributeType.STRING
    )
    public String empId();

    @AttributeDefinition(name="empName",
    description ="about empName",
    defaultValue= "pls Enter Emp Name",
    type=AttributeType.STRING
    )
    public String empName();

    @AttributeDefinition(name="empSalary",
    description ="about empSalary",
    defaultValue= "pls Enter Emp Salary",
    type=AttributeType.STRING
    )
    public String empSalary();

    @AttributeDefinition(name="restApi",
    description ="about restApi",
    defaultValue= "pls Enter restApi",
    type=AttributeType.STRING
    )
    public String restApi();




}

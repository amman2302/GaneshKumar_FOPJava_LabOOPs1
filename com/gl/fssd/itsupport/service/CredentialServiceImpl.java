package com.gl.fssd.itsupport.service;

import com.gl.fssd.itsupport.model.Employee;
import com.gl.fssd.itsupport.util.StringUtil;

public class CredentialServiceImpl implements CredentialService {
    private String domain;

    public CredentialServiceImpl(String domain) {
        super();
        this.domain = domain;
    }
    
    public Employee generateEmailAddress(Employee employeeObj){
        String strEmailId = StringUtil.getEmailID(employeeObj.getFirstName(), employeeObj.getastName(), employeeObj.getDepartment().getDepartmentName(), domain);
        employeeObj.setEmailAddress(strEmailId);
        return employeeObj;

    }
    public Employee generatePassword(Employee employeeObj){
        String strCredentials =  StringUtil.getRandomPassword();
        employeeObj.setCredential(strCredentials);
        return employeeObj;
    }
}//End of NewHireService
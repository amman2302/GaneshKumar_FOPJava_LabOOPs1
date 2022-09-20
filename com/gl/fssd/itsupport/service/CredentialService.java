package com.gl.fssd.itsupport.service;

import com.gl.fssd.itsupport.model.Employee;

public interface CredentialService {
    public Employee generateEmailAddress(Employee employeeObj);
    public Employee generatePassword(Employee employeeObj);
}//End of NewHireService

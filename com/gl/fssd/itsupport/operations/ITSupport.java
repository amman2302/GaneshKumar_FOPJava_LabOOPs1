package com.gl.fssd.itsupport.operations;

import java.util.*;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

import com.gl.fssd.itsupport.model.Employee;
import com.gl.fssd.itsupport.model.DepartmentFactory;
import com.gl.fssd.itsupport.model.Department;
import com.gl.fssd.itsupport.service.*;

class ITSupport{
    static List<Employee> employeeList = new ArrayList<>();
    CredentialService service = new CredentialServiceImpl("smgrlab.com");

    public static void main(String[] args)
    {
        ITSupport itSupportObj = new ITSupport();
        boolean bOpsStatus = itSupportObj.doNewHireOps();
        if(bOpsStatus)
        {
            System.out.println(" \n \n ITSupport : New hire ops done successfully \n \n ");
            itSupportObj.showCredentials();
        }
        else    
            System.out.println("\n \n ITSupport : New hire ops failed.\n \n ");  

    }//End of main method.
    private void showCredentials()
    {
        Iterator<Employee> iterator = employeeList.iterator();  
        while (iterator.hasNext())  
        {  
            Employee objEmployee  = iterator.next();  
            System.out.println("--------------------------------------------------------------------");
            System.out.println("\n Dear "+ objEmployee.getFirstName()+ ", \n Your generated credentials are as follows   ");
            System.out.println("\n Email   --> "+objEmployee.getEmailAddress());
            System.out.println("\n Password--> "+objEmployee.getCredential());
            
        } 
    }
    private boolean doNewHireOps()
    {
        List<Employee> oEmployeeList = getEmployeeList();
        Iterator<Employee> objEmployeeIterator = oEmployeeList.iterator();  
        while (objEmployeeIterator.hasNext())  
        {  
            Employee objEmployee  = objEmployeeIterator.next();  
            service.generateEmailAddress(objEmployee);
            service.generatePassword(objEmployee);
            employeeList.add(objEmployee);
        } 
        return true;
    }//End of doNewHireOps();

    private List<Employee> getEmployeeList()
    {
        List<Employee> employeeList = new ArrayList<>();
        final String[] depts= {"Technical", "Admin", "HR", "Legal"};
        int number_of_employee,iCnt=0;
        boolean isOperationComplete = false;
        Scanner input = new Scanner(System.in);
        System.out.println("\n\nEnter the number of new employees to be onboarded\n\n ");
        number_of_employee = input.nextInt();
        while(number_of_employee>0 && !isOperationComplete && iCnt <number_of_employee)
        {               
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Enter First Name -->");
		    String fname = input.next();
		    System.out.println("Enter Last Name -->");
		    String lname = input.next();
		    System.out.println("Please Enter the Department from following -->");
		    for(int j=1; j<=depts.length; j++ ) 
			    System.out.println(j+". "+depts[j-1]);
            String  strDeptName=input.next();  
            DepartmentFactory deptFactory = new DepartmentFactory();
            Department oDepartment = deptFactory.getDepartment(strDeptName);
            Employee e = new Employee(fname,lname,oDepartment);
            employeeList.add(e);
            iCnt++;  
        }//End of while loop
        input.close();
        return employeeList;
    }//End of getEmployeeList()
}//End of Main class

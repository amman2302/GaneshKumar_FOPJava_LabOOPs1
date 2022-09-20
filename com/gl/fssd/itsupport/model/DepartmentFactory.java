package com.gl.fssd.itsupport.model;
public class DepartmentFactory {
	
    //use getShape method to get object of type shape 
    public Department getDepartment(String departmentName){
       if(departmentName == null){
          return null;
       }		
       if(departmentName.equalsIgnoreCase("Technical")){
          return new Technical();
          
       } else if(departmentName.equalsIgnoreCase("Admin")){
          return new Admin();
          
       } else if(departmentName.equalsIgnoreCase("Legal")){
          return new Legal();
      
        } else if(departmentName.equalsIgnoreCase("HR")){
        return new HR();
     }
       return null;
    }
 }//End of DepartmentFactory
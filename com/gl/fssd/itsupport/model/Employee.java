package com.gl.fssd.itsupport.model;

public class Employee{
    private String strFirstName;
    private String strLastName;
    private String strEmailAddress;
    private Department oDepartment;
    private String strCredentials;
    /**
     * @param strFirstName
     * @param strLastName
     * @param oDepartment
     * @return
     */
    public Employee(String strFirstName, String strLastName, Department oDepartment)
    {
        this.strFirstName = strFirstName;
        this.strLastName  = strLastName;
        this.oDepartment  = oDepartment;
    }//End of constructor.
    public String getFirstName()
    {
        return strFirstName;
    }//End of public String getFirstName()
    public void setFirstName(String strFirstName)
    {
        this.strFirstName = strFirstName;
    }//End of public void setFirstName()

    public String getastName()
    {
        return strLastName;
    }//End of public String getastName()
    public void setLastName(String strLastName)
    {
        this.strLastName = strLastName;
    }//End of public void setLastName()

    public String getEmailAddress()
    {
        return strEmailAddress;
    }//End of public String getEmailAddress()
    public void setEmailAddress(String strEmailAddress)
    {
        this.strEmailAddress = strEmailAddress;
    }//End of public void setEmailAddress()

    public Department getDepartment()
    {
        return oDepartment;
    }//End of public String getDepartment()
    public void setDepartment(Department oDepartment)
    {
        this.oDepartment = oDepartment;
    }//End of public void setDepartment()

    public String getCredential()
    {
        return strCredentials;
    }//End of public String getCredential()
    public void setCredential(String strCredentials)
    {
        this.strCredentials = strCredentials;
    }//End of public void setFirstName()

}//End of Employee
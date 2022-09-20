package com.gl.fssd.itsupport.util;

import java.util.Random;

public final class StringUtil {

    public final static String getRandomPassword(){
        Random r= new Random();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<8; i++)
        {
        int n=r.nextInt(127-32)+32;
        sb.append((char)n);
        }	
        return sb.toString();
    }//End of getRandomPassword
    public final static String getEmailID(String fname,String lname,String dept, String domain){
        return fname+lname+"@"+dept+"."+domain;
    }//End of getEmailID
    
}//End of final class StringUtil

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmanagementsystem;

/**
 *
 * @author madhu
 */
public class Individual extends CustomerVo{
    
    private int SSN;
    
    Individual(int CId,String Fname,String Lname,String CAdd,String Phno,String Email,int SSN){
        
        super(CId,Fname,Lname,CAdd,Phno,Email);
        this.SSN = SSN;
    }

    @Override
    public String toString() {
        return CId+";"+Fname+";"+Lname+";"+CAdd+";"+Phno+";"+Email+";"+ SSN ;
    }

    
    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }
    
    
    
}

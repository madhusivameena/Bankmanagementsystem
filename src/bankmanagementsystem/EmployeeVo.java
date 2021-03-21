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
public class EmployeeVo {
    
    
    public int Eid;
    public String Fname;
    public String Lname;
    public String Etype;
    public String Email;
    public String Phno;
    
    EmployeeVo(){
        
    }

   
    EmployeeVo(int Eid,String Fname,String Lname,String Etype,String Email,String Phno ){
        
        this.Eid = Eid;
        this.Fname =Fname;
        this.Lname =Lname;
        this.Etype =Etype;
        this.Email = Email;
        this.Phno = Phno;
    }
    
    @Override
    public String toString() {
        return  Eid + ";"  + Fname + ";"  + Lname + ";"  + Etype + ";" + Email + ";" + Phno ;
    }
    
    
     
    
    

    public int getEid() {
        return Eid;
    }

    public void setEid(int Eid) {
        this.Eid = Eid;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public String getEtype() {
        return Etype;
    }

    public void setEtype(String Etype) {
        this.Etype = Etype;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhno() {
        return Phno;
    }

    public void setPhno(String Phno) {
        this.Phno = Phno;
    }

    String nextToken() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
   
}

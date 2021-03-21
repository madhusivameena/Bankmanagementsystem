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
public class CustomerVo {
    
    public int CId;
    public String Fname;
    public String Lname;
    public String CAdd;
    public String Phno;
    public String Email;
    
    
    CustomerVo(){
        
    }

   CustomerVo(int CId,String Fname,String Lname,String CAdd,String Phno,String Email){
       
       this.CId = CId;
       this.Fname = Fname;
       this.Lname = Lname;
       this.CAdd = CAdd;
       this.Phno = Phno;
       this.Email = Email;
   }

    @Override
    public String toString() {
        return  CId + ";" + Fname + ";"  + Lname + ";"  + CAdd + ";" + Phno + ";"  + Email ;
    }
    
    

    public int getCId() {
        return CId;
    }

    public void setCId(int CId) {
        this.CId = CId;
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

    public String getCAdd() {
        return CAdd;
    }

    public void setCAdd(String CAdd) {
        this.CAdd = CAdd;
    }

    public String getPhno() {
        return Phno;
    }

    public void setPhno(String Phno) {
        this.Phno = Phno;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    void writeToFile(CustomerVo customer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void writeFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}

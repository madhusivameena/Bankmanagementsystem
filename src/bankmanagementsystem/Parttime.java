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
public class Parttime extends EmployeeVo {
    
    private float HrPay;
    
Parttime(int Eid,String Fname,String Lname,String Etype,String Email,String Phno,float HrPay ){
    
    super( Eid, Fname,Lname, Etype,Email,Phno);
    this.HrPay = HrPay;
    
     
}    

    @Override
    public String toString() {
        return Eid+ ";"+Fname+";"+Lname+";"+Etype+";"+Email+";"+Phno+";"+  HrPay ;
    }
    
    public float getHrPay() {
        return HrPay;
    }

    public void setHrPay(float HrPay) {
        this.HrPay = HrPay;
    }
    
   
    
    
}

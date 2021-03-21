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
public class Fulltime extends EmployeeVo{
    
    private float MonthlyPay;
    
    Fulltime(int Eid,String Fname,String Lname,String Etype,String Email,String Phno,float MonthlyPay){
        
        super( Eid, Fname,Lname, Etype,Email,Phno);
        this.MonthlyPay = MonthlyPay;
        
        
    }

    @Override
    public String toString() {
        return  Eid+ ";"+Fname+";"+Lname+";"+Etype+";"+Email+";"+Phno+";"+ MonthlyPay;
    }
    
    

    public float getMonthlyPay() {
        return MonthlyPay;
    }

    public void setMonthlyPay(float MonthlyPay) {
        this.MonthlyPay = MonthlyPay;
    }
    
    
}

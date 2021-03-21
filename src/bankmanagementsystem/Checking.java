/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmanagementsystem;

import java.util.Date;

/**
 *
 * @author madhu
 */
public class Checking extends AccountVo{
    
    public int CAccno;
    public float Amount;
    public Date Opendate;
   
    Checking(int AccNo,String AccType,String OpenDate,float Balance,int CAccno,float Amount,Date Opendate,int Cid){
        
        super(AccNo,AccType,OpenDate,Balance,Cid);
        this.CAccno = CAccno;
        this.Amount = Amount;
        this.Opendate = Opendate;
         
    }

    @Override
    public String toString() {
        return AccNo+";"+AccType+";"+OpenDate+";"+Balance+";"+ CAccno + ";"  + Amount + ";" + Opendate+";"+Cid;
    }
    
    
            public int getCAccno() {
        return CAccno;
    }

    public void setCAccno(int CAccno) {
        this.CAccno = CAccno;
    }

    public float getAmount() {
        return Amount;
    }

    public void setAmount(float Amount) {
        this.Amount = Amount;
    }

    public Date getOpendate() {
        return Opendate;
    }

    public void setOpendate(Date Opendate) {
        this.Opendate = Opendate;
    }
    
    
    
    
    
}

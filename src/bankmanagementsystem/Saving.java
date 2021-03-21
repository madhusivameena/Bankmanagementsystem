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
public class Saving extends AccountVo{
    
    public int SAccno;
    public float Amount;
    public float Interest;
    public Date Opendate;
    public int Cid;
    Saving(int AccNo,String AccType,String OpenDate,float Balance,int SAccno,float Amount,float Interest,Date Opendate, int Cid){
        
       super(AccNo,AccType,OpenDate,Balance,Cid); 
        this.SAccno = SAccno;
        this.Amount = Amount;
        this.Interest = Interest;
        this.Opendate = Opendate;
    }

    @Override
    public String toString() {
        return AccNo+";"+AccType+";"+OpenDate+";"+ Balance+";"+ SAccno + ";" + Amount + ";" + Interest + ";" + Opendate+";"+Cid ;
    }

    
    public int getSAccno() {
        return SAccno;
    }

    public void setSAccno(int SAccno) {
        this.SAccno = SAccno;
    }

    public float getAmount() {
        return Amount;
    }

    public void setAmount(float Amount) {
        this.Amount = Amount;
    }

    public float getInterest() {
        return Interest;
    }

    public void setInterest(float Interest) {
        this.Interest = Interest;
    }

    public Date getOpendate() {
        return Opendate;
    }

    public void setOpendate(Date Opendate) {
        this.Opendate = Opendate;
    }
    
    
    
}

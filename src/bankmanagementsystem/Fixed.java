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
public class Fixed extends AccountVo{
    
    public int FAccno;
    public float Amount;
    public float Interest;
    public Date Opendate;
   
    
 Fixed(int AccNo,String AccType,String OpenDate,float Balance,int FAccno,float Amount,float Interest,Date Opendate,int Cid){
     
     super(AccNo,AccType,OpenDate,Balance,Cid);
     this.FAccno = FAccno;
     this.Amount = Amount;
     this.Interest = Interest;
     this.Opendate = Opendate;
     this.Cid = Cid;
 }  

    @Override
    public String toString() {
        return AccNo + ";"  + AccType + ";"  + OpenDate + ";"  + Balance +";"+ FAccno + ";" + Amount + ";" + Interest + ";" + Opendate+";"+Cid ;
    }
 
        
    public int getFAccno() {
        return FAccno;
    }

    public void setFAccno(int FAccno) {
        this.FAccno = FAccno;
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

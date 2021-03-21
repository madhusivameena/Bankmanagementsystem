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
public class AccountVo {
    
    public int AccNo;
    public String AccType;
    public String OpenDate;
    public float Balance;
    public int Cid;
    
    AccountVo(int AccNo,String AccType,String OpenDate,float Balance,int Cid){
        
        this.AccNo = AccNo;
        this.AccType = AccType;
        this.OpenDate = OpenDate;
        
        this.Balance =  Balance;
        this.Cid  = Cid;

        
    }

    @Override
    public String toString() {
        return  AccNo + ";"  + AccType + ";"  + OpenDate + ";"  + Balance +";"+Cid;
    }
    
    AccountVo(){
        
    }
    

    public int getAccNo() {
        return AccNo;
    }

    public void setAccNo(int AccNo) {
        this.AccNo = AccNo;
    }

    public String getAccType() {
        return AccType;
    }

    public void setAccType(String AccType) {
        this.AccType = AccType;
    }

    public String getOpenDate() {
        return OpenDate;
    }

    public void setOpenDate(String OpenDate) {
        this.OpenDate = OpenDate;
    }

  

    public float getBalance() {
        return Balance;
    }

    public void setBalance(float Balance) {
        this.Balance = Balance;
    }
    
    
    public int getCid() {
        return Cid;
    }

    public void setCid(int Cid) {
        this.Cid = Cid;
    }
    
    
}

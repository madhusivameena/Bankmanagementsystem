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
public class BankVo {
       public  String  Bname;
      public int Bcode;
      public String Badd;
      public String Email;
      public String Phno;
      
      BankVo(){
    
}

    @Override
    public String toString() {
        return   Bname +";" +Bcode + ";"+ Badd + ";"+  Email + ";"+ Phno  ;
    }
      
      BankVo(String Bname,int Bcode,String Badd,String Email,String Phno){
          this.Bname = Bname;
          this.Bcode = Bcode;
          this.Badd = Badd;
          this.Email = Email;
          this.Phno = Phno;
          
      }

    public int getBcode() {
        return Bcode;
    }

    public void setBcode(int Bcode) {
        this.Bcode = Bcode;
    }

    public String getBadd() {
        return Badd;
    }

    public void setBadd(String Badd) {
        this.Badd = Badd;
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
    
   

    public String getBname() {
        return Bname;
    }

    public void setBname(String Bname) {
        this.Bname = Bname;
    }

    void writeFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void readFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    BankVo readBankFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
      
    
}

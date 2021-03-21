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
public class Business extends CustomerVo{
    
    private String Bname;
    private int Taxid;
  
 Business(int CId ,String  Fname,String Lname,String CAdd,String Phno,String Email,String Bname,int Taxid){
     
     super(CId,Fname,Lname,CAdd,Phno,Email);
     this.Bname = Bname;
     this.Taxid = Taxid;
    
   
     
    }
   
    

   
}

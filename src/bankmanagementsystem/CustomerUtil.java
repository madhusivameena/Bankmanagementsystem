/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmanagementsystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author madhu
 */
public class CustomerUtil {
    
    
      public  ArrayList<CustomerVo> CustomerVoList = new ArrayList<>();

   
    
    public void writeFile(){
        
        try{ 
           
        FileWriter fw = new FileWriter("c:\\data\\customer.txt",false);
        BufferedWriter bw = new BufferedWriter(fw);
        CustomerVo c1 = new CustomerVo(601, "Aurora","Randy","Naperville","630-900-1234","aurora@abc.in");
        CustomerVo c2 = new CustomerVo(602, "Noble","Don","Aurora","630-900-1888","noble@abc.in");
        CustomerVo c3 = new CustomerVo(603, "Rosy","Reena","Lisle","630-900-8834","rosy@yahoo.in");
        CustomerVo c4 = new CustomerVo(604, "Meena","Rani","Naperville","630-930-1934","meena@yahoo.com");
        CustomerVo c5 = new CustomerVo(605, "Sandy","Smith","Westmont","634-790-1234","sandy@gmail.com");
       
         Scanner c6 = new Scanner(System.in);
                  System.out.println("Enter customer Id");
                  int CId1 = c6.nextInt();
                   System.out.println("Enter customer Fname");
                  String Fname = c6.nextLine();
                   System.out.println("Enter customer Lname");
                  String Lname =c6.nextLine();
                   System.out.println("Enter customer Address");
                  String CAdd = c6.nextLine();
                   System.out.println("Enter customer Phno");
                  String Phno = c6.nextLine();
                   System.out.println("Enter customer Email");
                  String Email= c6.nextLine();
        
        bw.write(c1.toString());
        bw.newLine();
        bw.write(c2.toString());
        bw.newLine();
        bw.write(c3.toString());
        bw.newLine();
        bw.write(c4.toString());
        bw.newLine();
        bw.write(c5.toString());
        bw.newLine();
        bw.close();
        fw.close();
        
       }catch (Exception e) { 
           
       }            
    }
    
    
      public void updateFile(int newCId){
        
       try {
           FileReader fr = new  FileReader("c:\\data\\customer.txt");
           BufferedReader br = new BufferedReader(fr);
           FileWriter fw = new FileWriter("c:\\data\\customer1.txt",false);
           BufferedWriter bw = new BufferedWriter(fw);
           String line;
           
           CustomerVo c1;
           
           while ((line = br.readLine()) !=null){
               StringTokenizer st = new StringTokenizer(line, ";");
               if(st.hasMoreTokens()){
                   int CId = Integer.parseInt(st.nextToken());
                   String Fname = st.nextToken();
                   String Lname = st.nextToken();
                   String CAdd = st.nextToken();
                   String Phno = st.nextToken();
                   String Email = st.nextToken();
                   
                   c1 = new CustomerVo( CId, Fname, Lname, CAdd, Phno, Email );
                   if(CId == newCId)
                   {
                       System.out.println("Customer ID : "+newCId+" exists");
                       System.out.println("Old customer Details : "+c1+" replaced with above");
                   }
                   else
                   {
                       bw.write(c1.toString());
                       bw.newLine();
                    }
                   }
           }
           br.close();
           fr.close();
           bw.close();
           fw.close();
           File oldfile = new File("c:\\data\\customer1.txt");
           File newfile = new File("c:\\data\\customer.txt");
           newfile.delete();
           oldfile.renameTo(newfile);
       } catch(Exception e){
           
       }
        
       }
            
    public void readFile(){
        
       try {
           FileReader fr = new  FileReader("c:\\data\\customer.txt");
           BufferedReader br = new BufferedReader(fr);
           String line;
           
           CustomerVo c1;
           
           while ((line = br.readLine()) !=null){
               System.out.println(line);
               StringTokenizer st = new StringTokenizer(line, ";");
               if(st.hasMoreTokens()){
                   
                   int CId = Integer.parseInt(st.nextToken());
                   String Fname = st.nextToken();
                   String Lname = st.nextToken();
                   String CAdd = st.nextToken();
                   String Phno = st.nextToken();
                   String Email = st.nextToken();
                   c1 = new CustomerVo(CId,Fname,Lname,CAdd,Phno,Email);
                   CustomerVoList.add(c1);
               }
               
           }
           System.out.println(CustomerVoList);
           br.close();
           fr.close();
       } catch(Exception e){
           
       }
        
    }
    
     public CustomerVo findCustomerById(int CId){
        for (CustomerVo customer: CustomerVoList){
            if (customer.getCId() == CId){
                return customer;
    
            }
        }
        return null;
     } 
}

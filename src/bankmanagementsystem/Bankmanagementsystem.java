/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmanagementsystem;

import static bankmanagementsystem.Bank.bankSubMenu;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author madhu
 */
public class Bankmanagementsystem {
    private static Object bw;
 public  ArrayList<CustomerVo> CustomerVoList = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
      
       

   
          

      
       
       int choice = 0;
        
        do{
            
        menu();
        choice = choiceselection(choice);
        }while(choice <10);
        
    } 
       static void menu(){
            
        
        System.out.println("===================================");
        System.out.println("      *** ABC BANK ***      ");
        System.out.println("===================================");
        System.out.println("1.Add/Update Bank");
        System.out.println("2.Add/Update Employee");
        System.out.println("3.Add/Update Customer");
        System.out.println("4.Add/Update Account");
        System.out.println("5.Show Employees");
        System.out.println("6.Show Customers");
        System.out.println("7.Show Accounts");
        System.out.println("8.Search Customer by ID");
        System.out.println("9.Search Employee by ID");
        System.out.println("10.Exit");
        System.out.println("====================================");
        System.out.println("Enter Your Choice  : ");
        System.out.println("====================================");
        
    }
        
        
        static int choiceselection(int choice) throws IOException{
        
       Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        
        switch(choice){
            
            
            case 1: System.out.println("1.ADD/UPDATE BANK");
              
                
                try{
                   
                    Bank fileutil = new Bank();
                     fileutil.readFile();
                //    fileutil.writeFile();
                  
                  Scanner b2 = new Scanner(System.in);
                  System.out.println("Enter Bcode");
                  int Bcode = b2.nextInt(); 
                  b2.nextLine();
                   System.out.println("Enter Bank Name");
                  String Bname = b2.nextLine();
                   System.out.println("EnterBank Address");
                  String Badd =b2.nextLine();
                   System.out.println("Enter Bank Email");
                  String Email = b2.nextLine();
                   System.out.println("Enter Bank Phno");
                  String Phno = b2.nextLine();
                  fileutil.updateFile(Bcode);
                               
                FileWriter fw = new FileWriter("c:\\data\\bank.txt",true);
                BufferedWriter bw = new BufferedWriter(fw);
    
                BankVo bank= new  BankVo( Bname, Bcode, Badd, Email, Phno);
                bw.write(bank.toString());
                bw.newLine();
                 bw.close();
                 fw.close();
                 System.out.println("Entered Bank details recorded");  
                   }catch(Exception e){
                   
                    System.out.println("Sorry Something Wrong");
                }
                    
                
            break;
            case 2: System.out.println("2.ADD/UPDATE EMPLOYEE");
                
                 try{
                  EmployeeUtil fileutil = new EmployeeUtil();
                  fileutil.readFile();
                  Scanner e6 = new Scanner(System.in);
                  System.out.println("Enter Employee Id");
                  int Eid = e6.nextInt(); 
                  e6.nextLine();
                   System.out.println("Enter Employee Fname");
                  String Fname = e6.nextLine();
                   System.out.println("Enter Employee Lname");
                  String Lname =e6.nextLine();
                   System.out.println("Enter Employee Type");
                  String Etype = e6.nextLine();
                   System.out.println("Enter customer Email");
                  String Email= e6.nextLine();
                  System.out.println("Enter customer Phno");
                  String Phno = e6.nextLine();
                  fileutil.updateFile(Eid);
                  FileWriter fw = new FileWriter("c:\\data\\employee.txt",true);
                  BufferedWriter bw = new BufferedWriter(fw);
                  EmployeeVo employee= new EmployeeVo(Eid,Fname, Lname, Etype, Email, Phno );
                  bw.write(employee.toString());
                  bw.newLine();
                  bw.close();
                  fw.close();
               System.out.println("Entered Employee details successfully"); 
              
              
         } catch(Exception e){
             
              System.out.println("Sorry Something Wrong");
         }  
            
            
            break;
            case 3: System.out.println("3.ADD/UPDATE CUSTOMER");
             try{
            
                  CustomerUtil fileutil = new CustomerUtil();
                  fileutil.readFile();
                  Scanner c6 = new Scanner(System.in);
                  System.out.println("Enter customer Id");
                  int CId = c6.nextInt(); 
                  c6.nextLine();
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
                  fileutil.updateFile(CId);
                 FileWriter fw = new FileWriter("c:\\data\\customer.txt",true);
                  BufferedWriter bw = new BufferedWriter(fw);  
                 CustomerVo customer= new CustomerVo(CId,Fname,Lname,CAdd,Phno,Email);
                bw.write(customer.toString());
                bw.newLine();
                 bw.close();
                 fw.close();
       
              
               //  System.out.println(CustomerVoList);
         } catch(Exception e){
             
              System.out.println("Sorry Something Wrong");
         }  
            
            
             
            
            break;
            
            case 4: System.out.println("4.ADD/UPDATE ACCOUNT");
             try{
            
                  AccountUtil fileutil = new AccountUtil();
                  fileutil.readFile();
                  Scanner a6 = new Scanner(System.in);
                  System.out.println("Enter Account Number");
                  int AccNo = a6.nextInt(); 
                  a6.nextLine();
                   System.out.println("Enter Account Type");
                  String AccType = a6.nextLine();
                   System.out.println("Enter OpenDate");
                  String OpenDate =a6.nextLine();
                   System.out.println("Enter Balance");
                  float Balance= a6.nextFloat();
                  a6.nextLine();
                   System.out.println("Enter customerId");
                 int Cid  = a6.nextInt();
                 a6.nextLine();
                  fileutil.updateFile(AccNo);
                  FileWriter fw = new FileWriter("c:\\data\\account.txt",true);
                  BufferedWriter bw = new BufferedWriter(fw);
                  AccountVo account= new AccountVo( AccNo, AccType, OpenDate, Balance,Cid);
                  bw.write(account.toString());
                   bw.newLine();
                   bw.close();
                   fw.close();
             }catch(Exception e){
                 
                  System.out.println("Sorry Something Wrong");
                 
             }
            
            
            break;
            case 5: System.out.println("5.EMPLOYEE LIST");
                  try{
                    EmployeeUtil fileutil = new EmployeeUtil();
                    fileutil.readFile();
                  //  fileutil.writeFile();
                   
                    
                   }catch(Exception e){
                    
                    System.out.println("Sorry Something Wrong");
                }
            
            
            
            break;
            case 6: System.out.println("6.CUSTOMER LIST");
            
                 
                try{
                    CustomerUtil fileutil = new CustomerUtil();
                     fileutil.readFile();
                 //  fileutil.writeFile();
                   }catch(Exception e){
                    
                    System.out.println("Sorry Something Wrong");
                }
            
            
            break;
            case 7: System.out.println("7.CUSTOMER ACCOUNT DETAILS");
            
                 try{
                    AccountUtil fileutil = new AccountUtil();
                     fileutil.readFile();
                   // fileutil.writeFile();
                   }catch(Exception e){
                    
                    System.out.println("Sorry Something Wrong");
                }
            
            break;
            case 8: System.out.println("8.ENTER CUSTOMER ID");
                   
                try{
                    CustomerUtil fileutil = new CustomerUtil();
                    fileutil.readFile();
                    AccountUtil fileutil2 = new AccountUtil();
                    fileutil2.readFile();
                  // fileutil.writeFile();
                    Scanner c = new Scanner(System.in);
                    System.out.println("Enter customer Id");
                    int CId = c.nextInt();
                    c.nextLine();
                    System.out.println(fileutil.findCustomerById(CId));
                    fileutil2.findAccountByCust(CId); 
                   }catch(Exception e){
                    
                    System.out.println("Sorry Something Wrong");
                }
            
                  
            break;
            case 9: System.out.println("9.ENTER EMPLOYEE ID");
            
            try{
                    EmployeeUtil fileutil = new EmployeeUtil();
                   // fileutil.writeFile();
                    fileutil.readFile();
                    Scanner e = new Scanner(System.in);
                    System.out.println("Enter Employee Id");
                    int Eid = e.nextInt();
                    e.nextLine();
                    System.out.println(fileutil.findEmployeeById(Eid));
                    
                   }catch(Exception e){
                    
                    System.out.println("Sorry Something Wrong");
                }
            
            break;
            case 10:System.out.println("10.****Thank For Using Our Services.Good Day****");
            
            break; 
        }
       return choice ;
        
        }
}
    

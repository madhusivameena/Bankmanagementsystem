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
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author madhu
 */
public class Bank {

    static void writeToFile(BankVo bank) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static int Bcode() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static BankVo readBankFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
     public  ArrayList<BankVo> BankVoList = new ArrayList<>();

   
    
    public void writeFile(){
        
        try{ 
           
        FileWriter fw = new FileWriter("c:\\data\\bank.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        BankVo b1 = new BankVo("ABC BANK",111, "Aurora","aurora@abc.com","630-900-1234");//ctrl+space to get tosting
        
        
        bw.write(b1.toString());
        bw.newLine();
        bw.newLine();
        bw.close();
        fw.close();
        
       }catch (Exception e) { 
           
       }            
    }
    
    
            
    public void readFile(){
        
       try {
           FileReader fr = new  FileReader("c:\\data\\bank.txt");
           BufferedReader br = new BufferedReader(fr);
           String line;
           
           BankVo b1;
           
           while ((line = br.readLine()) !=null){
               System.out.println(line);
               StringTokenizer st = new StringTokenizer(line, ";");
               if(st.hasMoreTokens()){
                   String Bname = st.nextToken();
                   int Bcode = Integer.parseInt(st.nextToken());
                   String Badd = st.nextToken();
                   String Email = st.nextToken();
                   String Phno = st.nextToken();
                   b1 = new BankVo(Bname,Bcode,Badd,Email,Phno);
                   BankVoList.add(b1);
               }
               
           }
           System.out.println(BankVoList);
           br.close();
           fr.close();
       } catch(Exception e){
           
       }
        
    }
    
     public BankVo findBankById(int Bcode){
        for (BankVo bank: BankVoList){
            if (bank.getBcode() == Bcode){
                return bank;
    
            }
        }
        return null;
    }
     
     
     
     
       public void updateFile(int newBCode){
        
       try {
           FileReader fr = new  FileReader("c:\\data\\bank.txt");
           BufferedReader br = new BufferedReader(fr);
           FileWriter fw = new FileWriter("c:\\data\\bank1.txt",false);
           BufferedWriter bw = new BufferedWriter(fw);
           String line;
           
           BankVo b1;
           
           while ((line = br.readLine()) !=null){
               StringTokenizer st = new StringTokenizer(line, ";");
               if(st.hasMoreTokens()){
                   String Bname = st.nextToken();
                   int Bcode = Integer.parseInt(st.nextToken());
                   String Badd = st.nextToken();
                   String Email = st.nextToken();
                   String Phno = st.nextToken();
                   b1 = new BankVo(Bname,Bcode,Badd,Email,Phno);
                   if(Bcode == newBCode)
                   {
                       System.out.println("Bank Code : "+newBCode+" exists");
                       System.out.println("Old Bank Details : "+b1+" replaced with above");
                   }
                   else
                   {
                       bw.write(b1.toString());
                       bw.newLine();
                    }
                   }
           }
           br.close();
           fr.close();
           bw.close();
           fw.close();
           File oldfile = new File("c:\\data\\bank1.txt");
           File newfile = new File("c:\\data\\bank.txt");
           newfile.delete();
           oldfile.renameTo(newfile);
       } catch(Exception e){
           
       }
        
       }
 public static void bankSubMenu() {
     
        BankVo bank = Bank.readBankFile();
            String  Bname;
            int Bcode;
            String Badd;
            String Email;
            String Phno;
       
        Scanner i = new Scanner(System.in);
        if(bank != null) {
            System.out.println("Update Bank:");
            System.out.println("Bank Name /"+bank.getBname()+":");
            
            Bname = i.nextLine();
            if(Bname != null && Bname.length() > 0) {
                bank.setBname(Bname);
            }
 
            System.out.println("Bank Code/"+bank.getBcode()+":");
            
              Bcode = i.nextInt();
            if(Bcode != 0 && Bcode() > 0 ) {
                bank.setBcode(Bcode);
            }
            System.out.println("Bank Address/"+bank.getBadd()+":");
            
           Badd = i.nextLine();
            if(Badd != null && Badd.length() > 0) {
                bank.setBadd(Badd);
            }
            System.out.println("Bank Email/"+bank.getEmail()+":");

            Email = i.nextLine();
            if(Email != null && Email.length() > 0) {
                bank.setEmail(Email);
                        
            }

            
            System.out.println("Bank Phone #/"+bank.getPhno()+":");

            Phno = i.nextLine();
            if(Phno != null && Phno.length() > 0) {
                bank.setPhno(Phno);
            }

            Bank.writeToFile(bank);
            System.out.println("Bank updated");
        } else {
            System.out.println("Add New Bank:");
            System.out.println("Enter Bank Name:");
            
            Bname = i.nextLine();
        
            System.out.println("Enter Bank Code:");
            Bcode = i.nextInt();

            System.out.println("Enter Bank Address:");
            Badd = i.nextLine();

            System.out.println("Enter Email:");
            Email = i.nextLine();
 
            System.out.println("Enter Phone Number:");
          Phno = i.nextLine();

            BankVo bankV = new BankVo(Bname, Bcode, Badd, Email, Phno);
            
            Bank.writeToFile(bankV);
            
            System.out.println("Bank created");
        }
        
        
        
        
        
    }
   
    }

   
    


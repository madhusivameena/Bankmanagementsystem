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
import java.util.StringTokenizer;

/**
 *
 * @author madhu
 */
public class AccountUtil {
    
        
     public  ArrayList<AccountVo> AccountVoList = new ArrayList<>();

   
    
    public void writeFile(){
        
        try{ 
           
            try (FileWriter fw = new FileWriter("c:\\data\\account.txt"); 
                BufferedWriter bw = new BufferedWriter(fw)) {
                AccountVo a1 = new AccountVo(101,"Checking","09-21-2018",9000,601);//ctrl+space to get tosting
                AccountVo a2 = new AccountVo(102,"Checking","01-26-2019",20000,602);
                AccountVo a3 = new AccountVo(103,"Saving","09-21-2018",9000,603);//ctrl+space to get tosting
                AccountVo a4 = new AccountVo(104,"Saving","09-21-2017",10000,601);//ctrl+space to get tosting
                AccountVo a5 = new AccountVo(105,"Fixed","08-21-2018",9500,603);//ctrl+space to get tosting

                
                bw.write(a1.toString());
                bw.newLine();
                bw.write(a2.toString());
                bw.newLine();
                bw.write(a3.toString());
                bw.newLine();
                bw.write(a4.toString());
                bw.newLine();
                bw.write(a5.toString());
                bw.newLine();
                bw.close();
                fw.close();
            }
        
       }catch (Exception e) { 
           
       }            
    }
    
      public void updateFile(int newAccNo){
        
       try {
           FileReader fr = new  FileReader("c:\\data\\account.txt");
           BufferedReader br = new BufferedReader(fr);
           FileWriter fw = new FileWriter("c:\\data\\account1.txt",false);
           BufferedWriter bw = new BufferedWriter(fw);
           String line;
           
           AccountVo a1;
           
           while ((line = br.readLine()) !=null){
               StringTokenizer st = new StringTokenizer(line, ";");
               if(st.hasMoreTokens()){
                   int AccNo = Integer.parseInt(st.nextToken());
                   String AccType = st.nextToken();
                   String OpenDate = st.nextToken();
                   Float Balance = Float.parseFloat(st.nextToken());
                   int Cid = Integer.parseInt(st.nextToken());
                   
                   a1 = new AccountVo( AccNo, AccType, OpenDate,Balance, Cid);
                   if(AccNo == newAccNo)
                   {
                       System.out.println("Customer ID : "+newAccNo+" exists");
                       System.out.println("Old customer Details : "+a1+" replaced with above");
                   }
                   else
                   {
                       bw.write(a1.toString());
                       bw.newLine();
                    }
                   }
           }
           br.close();
           fr.close();
           bw.close();
           fw.close();
           File oldfile = new File("c:\\data\\account1.txt");
           File newfile = new File("c:\\data\\account.txt");
           newfile.delete();
           oldfile.renameTo(newfile);
       } catch(Exception e){
           
       }
        
       }
    
            
    public void readFile(){
        
       try {
           try (FileReader fr = new  FileReader("c:\\data\\account.txt"); 
               BufferedReader br = new BufferedReader(fr)) {
               String line;
               
               AccountVo a1;
               
               while ((line = br.readLine()) !=null){
                   System.out.println(line);
                   StringTokenizer st = new StringTokenizer(line, ";");
                   if(st.hasMoreTokens()){
                       
                       int AccNo = Integer.parseInt(st.nextToken());
                       String AccType = st.nextToken();
                       String OpenDate = st.nextToken();
                       float Balance = Float.parseFloat(st.nextToken());
                       int Cid = Integer.parseInt(st.nextToken()) ;
                       
                       a1 = new AccountVo(AccNo,AccType,OpenDate,Balance,Cid);
                       AccountVoList.add(a1);
                   }
                   
               }
               System.out.println(AccountVoList); 
              br.close();
              fr.close();
           }
       } catch(Exception e){
           
       }
        
    }
     
     public AccountVo findAccountById(int AccNo ){
         
         for (AccountVo account: AccountVoList){
            if (account.getAccNo() == AccNo){
                return account;
    
            }
        }
        return null;
     }

     public AccountVo findAccountByCust(int CId ){
         
         for (AccountVo account: AccountVoList){
            if (account.getCid() == CId){
                System.out.println("Accounts"+account);
    
            }
        }
        return null;
     }
     
     
}
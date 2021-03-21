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
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author madhu
 */
public class EmployeeUtil {
    
     
     public  ArrayList<EmployeeVo> EmployeeVoList = new ArrayList<>();

   
    
    public void writeFile(){
        
        try{ 
           
            try (FileWriter fw = new FileWriter("c:\\data\\employee.txt"); 
                BufferedWriter bw = new BufferedWriter(fw)) {
                EmployeeVo e1 = new EmployeeVo(800,"Sai","Kiran","FullTime","sai@yahoo.com","630-899-7890");//ctrl+space to get tosting
                EmployeeVo e2 = new EmployeeVo(801,"john","kelly","PartTime","john@gmail.com","331-456-6789");
                EmployeeVo e3 = new EmployeeVo(803,"Tracy","puple","PartTime","tracy@yahoo.com","630-345-4576");
                
                bw.write(e1.toString());
                bw.newLine();
                bw.write(e2.toString());
                bw.newLine();
                bw.write(e3.toString());
                bw.newLine();
                bw.close();
                fw.close();
            }
        
       }catch (Exception e) { 
           
       }            
    }
    
    public void writeEmploeeFile(EmployeeVo e){
        
        try{ 
           
            try (FileWriter fw = new FileWriter("c:\\data\\employee.txt"); 
                BufferedWriter bw = new BufferedWriter(fw)) {
                bw.write(e.toString());
                bw.newLine();
                bw.close();
                fw.close();
            }
        
       }catch (Exception e1) { 
           
       }            
    }
    
      public void updateFile(int newEid){
        
       try {
           FileReader fr = new  FileReader("c:\\data\\employee.txt");
           BufferedReader br = new BufferedReader(fr);
           FileWriter fw = new FileWriter("c:\\data\\employee1.txt",false);
           BufferedWriter bw = new BufferedWriter(fw);
           String line;
           
           EmployeeVo b1;
           
           while ((line = br.readLine()) !=null){
               StringTokenizer st = new StringTokenizer(line, ";");
               if(st.hasMoreTokens()){
                   int Eid = Integer.parseInt(st.nextToken());
                   String Fname = st.nextToken();
                   String Lname = st.nextToken();
                   String Etype = st.nextToken();
                   String Email = st.nextToken();
                   String Phno = st.nextToken();
                   b1 = new EmployeeVo(Eid,Fname, Lname, Etype, Email, Phno );
                   if(Eid == newEid)
                   {
                       System.out.println("Empl ID : "+newEid+" exists");
                       System.out.println("Old Empl Details : "+b1+" replaced with above");
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
           File oldfile = new File("c:\\data\\employee1.txt");
           File newfile = new File("c:\\data\\employee.txt");
           newfile.delete();
           oldfile.renameTo(newfile);
       } catch(Exception e){
           
       }
        
       }
        
    public void readFile(){
        
       try {
           try (FileReader fr = new  FileReader("c:\\data\\employee.txt"); 
               BufferedReader br = new BufferedReader(fr)) {
               String line;
               
               EmployeeVo e1;
               
               while ((line = br.readLine()) !=null){
                   System.out.println(line);
                   StringTokenizer st = new StringTokenizer(line, ";");
                   if(st.hasMoreTokens()){
                       
                       int Eid = Integer.parseInt(st.nextToken());
                       String FName = st.nextToken();
                       String LName = st.nextToken();
                       String Etype = st.nextToken();
                       String Email = st.nextToken();
                       String Phno = st.nextToken();
                       
                       e1 = new EmployeeVo(Eid,FName,LName,Etype,Email,Phno);
                       EmployeeVoList.add(e1);
                   }
                   
               }
               System.out.println(EmployeeVoList); 
              br.close();
              fr.close();
           }
       } catch(Exception e){
           
       }
        
    }
     
     public EmployeeVo findEmployeeById(int Eid ){
         
         for (EmployeeVo employee: EmployeeVoList){
            if (employee.getEid() == Eid){
                return employee;
    
            }
        }
        return null;
     }

}

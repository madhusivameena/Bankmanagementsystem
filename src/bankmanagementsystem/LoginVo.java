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
public class LoginVo {
   
    
    String password;
    String Username;
   
    
    LoginVo(String username,String password){
        
        this.Username = username;
        this.password = password;
        
    }

    LoginVo() {
       
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        this.Username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}

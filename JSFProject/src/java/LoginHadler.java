
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author renm
 */
@ManagedBean
@SessionScoped
public class LoginHadler {
    private String username;
    private String password;
    private String outputMessage;

    public String getOutputMessage() {
        return outputMessage;
    }

    public void setOutputMessage(String outputMessage) {
        this.outputMessage = outputMessage;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String login() {
        if(username.equals("renju") && password.equals("root")) {
            outputMessage="Valid User";
        } else if(username.equals("") && !(password.equals(""))) {
            outputMessage="Username is empty";
        }  else if(!(username.equals("")) && password.equals("")) {
            outputMessage="Password is empty";
        } else if (username.equals("") && password.equals("")) {
            outputMessage="Username and Password empty, Invalid user";
        } else {
            outputMessage="Invalid User";
        }
        return outputMessage;
    }
}

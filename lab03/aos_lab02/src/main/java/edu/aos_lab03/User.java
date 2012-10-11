/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.aos_lab03;

/**
 *
 * @author tomy
 */
import java.util.Arrays;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "aos-user")
public class User {

    private String nickname;
    private String password;
    //for incomming info
    private String[] emails;

    public User() {
    }

    public User(String nickname, String password) {
        this.nickname = nickname;
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getEmails() {
        return emails;
    }

    public void setEmails(String[] emails) {
        this.emails = emails;
    }

    @Override
    public String toString() {
        return "||  NICK: " + nickname + "\t"
                + "PASS: " + password + "\t"
                + "EMAILS: " + Arrays.toString(emails)
                + "  ||";

    }
}
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
    private int goals;

    public User() {
    }

    public User(String nickname, String password) {
        this.nickname = nickname;
        this.password = password;
    }

    public User(String nickname, int goals) {
        this.nickname = nickname;
        this.goals = goals;
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

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    @Override
    public String toString() {
        return "User{" + "nickname=" + nickname + ", password=" + password + ", emails=" + Arrays.toString(emails) + ", goals=" + goals + '}';
    }
    
}
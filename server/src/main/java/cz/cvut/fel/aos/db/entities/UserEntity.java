package cz.cvut.fel.aos.db.entities;

import java.util.Collection;
import java.util.LinkedList;

/**
 * Class that simulates DB entity.
 */
public class UserEntity {
    
    private static long maxId = 0;
    
    private long id;
    private String nick;
    private String pass;
    private Collection<String> emails = new LinkedList<String>();

    public UserEntity(String nick, String pass) {
        this.id     = ++maxId;
        this.nick   = nick;
        this.pass   = pass;
    }

    public long getId() {
        return id;
    }

    public String getNick() {
        return nick;
    }

    public String getPass() {
        return pass;
    }

    public Collection<String> getEmails() {
        return emails;
    }
    
    public void addEmail(String email){
        this.emails.add(email);
    }
    
    public void changePassword(String pass){
        this.pass = pass;
    }
    public void changeUserNick(String nick){
        this.nick = nick;
    }
    
    public boolean deleteEmail(String email){
        return emails.remove(email);
    }

    @Override
    public String toString() {
        return "UserEntity{" + "id=" + id + ", nick=" + nick + ", pass=" + pass + ", emails=" + emails + '}';
    }
}

package cz.cvut.fel.aos.resources.mapping;

import cz.cvut.fel.aos.db.entities.UserEntity;
import java.util.LinkedList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//DB -> XML(JSON) adapter
@XmlRootElement(name="aos-user")
public class MappingUser {
    
    private String nickname;
    private String password;
    //not required
    private List<String> emails;
    private int goals;
    
    public MappingUser(){}
    
    //maps db entity to the class that is annotated by JAXB and can be transformed to JSON
    public MappingUser(UserEntity userEntity){
        if(userEntity != null){
            this.nickname = userEntity.getNick();
            this.password = userEntity.getPass();
            this.emails   = new LinkedList<String>(userEntity.getEmails());
            this.goals = userEntity.getGoals();
        }
    }

    @XmlElement(required=true)
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
    
    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
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
        return "MappingUser{" + "nickname=" + nickname + ", password=" + password + ", emails=" + emails + ", goals=" + goals + '}';
    }
}

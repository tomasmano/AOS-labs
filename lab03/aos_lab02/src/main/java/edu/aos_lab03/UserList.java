/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.aos_lab03;

import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tomy
 */
@XmlRootElement(name = "mappingUsers")
public class UserList {

    private Collection<User> users;

    @XmlElement(name = "aos-user")
    public Collection<User> getUsers() {
        return users;
    }

    public void setUsers(Collection<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserList{" + "users=" + users + '}';
    }
}

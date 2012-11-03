package cz.cvut.fel.agents.aos.mashup.beans;

import java.util.Collection;
import java.util.LinkedList;
import javax.faces.bean.ManagedBean;
import edu.aos_lab03.Class3Client;
import edu.aos_lab03.User;
import edu.tomy.bestgoalscorers.BestGoalScorersProvider;
import generatedcode.client.TTopGoalScorer;
import generatedcode.client.TTopSelectedGoalScorer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@ManagedBean(name = "usersBean")
public class UsersManagedBean {

    private Collection<MashupUser> users;
    private String username;
    private int goals;
    private final Class3Client class3Client;
    private final BestGoalScorersProvider bestGoalScorersProvider;

    public UsersManagedBean() {
        bestGoalScorersProvider = new BestGoalScorersProvider();
        class3Client = new Class3Client();
    }

    ///////////////////////////////////////////////
    //Backup getters/setters for the managed bean.
    public Collection<MashupUser> getUsers() {
        if (users == null) {
            this.users = new LinkedList<MashupUser>();
            users.add(new MashupUser("Fake Adahot", 10));
            users.add(new MashupUser("Pepe Guardiola", 1));
            syncWithWebservicesAndSort();
        }
        syncWithWebservicesAndSort();
        return users;
    }

    private void syncWithWebservicesAndSort() {
        synchWithAOSRestUsersServer();
        syncWithFootballPoolWebService();
        List<MashupUser> sorted = new ArrayList<MashupUser>(users);
        Collections.sort(sorted);
        users = sorted;
    }

    /**
     * Sync with localhost:8081/aos-rest-users-server/rest/users/
     */
    private void synchWithAOSRestUsersServer() {
        Collection<User> collection = class3Client.getAllUsers().getUsers();
        for (User user : collection) {
            MashupUser checked = new MashupUser(user);
            if (!users.contains(checked)) {
                users.add(new MashupUser(user));
            }
        }
    }

    /**
     * Sync with http://footballpool.dataaccess.eu/data/info.wso
     */
    private void syncWithFootballPoolWebService() {
        List<TTopGoalScorer> goalScorers = bestGoalScorersProvider.getBestGoalScorers(4);
        for (TTopGoalScorer tTopGoalScorer : goalScorers) {
            MashupUser checked = new MashupUser(tTopGoalScorer);
            if (!users.contains(checked)) {
                users.add(new MashupUser(tTopGoalScorer));
            }
        }
    }

    public void setUsers(Collection<MashupUser> users) {
        this.users = users;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }
    ///////////////////////////////////////////////////

    /**
     * Action method called by action button.
     */
    public void add() {
        User user = new User(username, goals);
        class3Client.addUser(user);
//        users.add(new MashupUser(user));
    }
}

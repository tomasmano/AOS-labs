package cz.cvut.fel.agents.aos.mashup.beans;

import edu.aos_lab03.User;
import generatedcode.client.TTopGoalScorer;

public class MashupUser implements Comparable<MashupUser> {

    private String name;
    private int goals;

    public MashupUser() {
    }

    public MashupUser(String name, int goals) {
        this.name = name;
        this.goals = goals;
    }

    public MashupUser(User user) {
        this.name = user.getNickname();
        this.goals = user.getGoals();
    }

    public MashupUser(TTopGoalScorer scorer) {
        this.name = scorer.getSName();
        this.goals = scorer.getIGoals();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    @Override
    public int compareTo(MashupUser o2) {
        int o1Goals = this.getGoals();
        int o2Goals = o2.getGoals();
        if (o1Goals > o2Goals) {
            return -1;
        }
        if (o1Goals < o2Goals) {
            return 1;
        }
        return 0;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 29 * hash + this.goals;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MashupUser other = (MashupUser) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MashupUser{" + "name=" + name + ", goals=" + goals + '}';
    }
    
}

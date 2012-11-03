package cz.cvut.fel.agents.aos.mashup.beans;

import java.util.Comparator;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
public class ScorersComparator implements Comparator<MashupUser> {

    @Override
    public int compare(MashupUser o1, MashupUser o2) {
        int o1Goals = o1.getGoals();
        int o2Goals = o2.getGoals();
        if (o1Goals > o2Goals) {
            return 1;
        }
        if (o1Goals < o2Goals) {
            return -1;
        }
        return 0;
    }
}

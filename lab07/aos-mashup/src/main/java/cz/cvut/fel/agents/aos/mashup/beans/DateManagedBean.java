package cz.cvut.fel.agents.aos.mashup.beans;

import javax.faces.bean.ManagedBean;
import edu.tomy.cvicenie02b.Class2Client;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
@ManagedBean(name = "dateManagedBean")
public class DateManagedBean {

    Class2Client class2Client;

    public DateManagedBean() {
        class2Client = new Class2Client();
    }
    
    public String provideDate(){
        String date = "";
        return class2Client.date().toString();
    }
}

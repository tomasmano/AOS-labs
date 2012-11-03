package cz.cvut.fel.agents.aos.mashup.beans;

import java.util.List;
import javax.faces.bean.ManagedBean;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Tweet;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
@ManagedBean(name = "randomCallingBean")
public class RandomRESTCallingManagedBean {

    private final Twitter twitter;
    
    public RandomRESTCallingManagedBean() {
        twitter = new TwitterFactory().getInstance();
    }

    public String getTweets() {
        String resultString = "";
        try {
            Query query = new Query("icecream");
            QueryResult result;
            result = twitter.search(query);
            List<Tweet> tweets = result.getTweets();
            for (Tweet tweet : tweets) {
                resultString=resultString+"@" + tweet.getFromUser() + " - " + tweet.getText();
            }
        } catch (TwitterException te) {
            te.printStackTrace();
            resultString = "Failed to search tweets: " + te.getMessage();
        }
        return resultString;
    }
}

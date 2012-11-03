package edu.tomy.bestgoalscorers;

import generatedcode.client.Info;
import generatedcode.client.InfoSoapType;
import generatedcode.client.TTopGoalScorer;
import generatedcode.client.TTopSelectedGoalScorer;
import java.net.URL;
import java.util.List;
import javax.xml.namespace.QName;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
public class BestGoalScorersProvider {

    private static final QName SERVICE_NAME = new QName("http://footballpool.dataaccess.eu", "Info");
    private final InfoSoapType port;

    public BestGoalScorersProvider() {
        URL wsdlURL = Info.WSDL_LOCATION;
        Info ss = new Info(wsdlURL, SERVICE_NAME);
        port = ss.getInfoSoap();
    }

    public List<TTopGoalScorer> getBestGoalScorers(int topN) {
        System.out.println("Invoking topGoalScorers...");
        int _topGoalScorers_iTopN = topN;
        generatedcode.client.ArrayOftTopGoalScorer _topGoalScorers__return = port.topGoalScorers(_topGoalScorers_iTopN);
        System.out.println("topGoalScorers.result=" + _topGoalScorers__return);
        return _topGoalScorers__return.getTTopGoalScorer();
    }

//    public static void main(String[] args) {
//        BestGoalScorersProvider provider = new BestGoalScorersProvider();
//        List<TTopGoalScorer> goalScorers = provider.getBestGoalScorers(5);
//        provider.getBestGoalScorers(6);
//        System.out.println(goalScorers);
//    }
}

package cz.cvut.aos.interfaceserver.webservice;

import cz.cvut.aos.interfaceserver.model.AirTicketCopy;
import cz.cvut.aos.interfaceserver.model.Flight;
import cz.cvut.aos.interfaceserver.model.Payment;
import cz.cvut.aos.interfaceserver.service.PaymentService;
import cz.cvut.aos.interfaceserver.service.exception.FlightCapacityExceededException;
import cz.cvut.aos.interfaceserver.service.exception.UnknownAccountException;
import java.util.Date;
import java.util.List;
import javax.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
@Service("interfaceWebServiceBean")
@WebService(endpointInterface = "cz.cvut.aos.interfaceserver.webservice.InterfaceWebService")
public class InterfaceWebServiceImpl implements InterfacetWebService {

    @Override
    public List<Flight> findFlight(String source, String target, Date flightTime) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public AirTicketCopy bookFlight(Long code) throws UnknownAccountException, FlightCapacityExceededException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
package cz.cvut.aos.paymentserver.webservice;

import cz.cvut.aos.paymentserver.model.AirTicket;
import cz.cvut.aos.paymentserver.model.Flight;
import cz.cvut.aos.paymentserver.service.PaymentService;
import java.util.Date;
import java.util.List;
import javax.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
@Service
@WebService(endpointInterface = "cz.cvut.aos.paymentserver.webservice.PaymentWebService")
public class PaymentServiceImpl implements PaymentWebService {

    @Autowired
    PaymentService bookingService;

    @Override
    public List<Flight> findFlight(String source, String target) {
        return bookingService.findFlight(source, target);
    }

    @Override
    public List<Flight> findFlightWithTime(String source, String target, Date flightTime) {
        return bookingService.findFlightWithTime(source, target, flightTime);
    }

    @Override
    public AirTicket bookFlight(Long code) {
        return bookingService.bookFlight(code);
    }

    @Override
    public int getFlightCapacity(Long code) {
        return bookingService.getFlightCapacity(code);
    }
}

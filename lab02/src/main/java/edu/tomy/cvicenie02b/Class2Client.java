/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.tomy.cvicenie02b;

/**
 *
 * @author manotoma
 */
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import javax.ws.rs.core.MediaType;

public class Class2Client {

    private Client client;
    private final static String url = "http://support.felk.cvut.cz/aos-wsf/services/rest/simple/";

    public Class2Client() {
        client = Client.create();
    }

    public String toUpperCase(String text) {
        WebResource resource = client.resource(url).path("upper-case");

        String response = resource
                //type of response
                .accept(MediaType.TEXT_PLAIN_TYPE)
                //type of request
                .type(MediaType.TEXT_PLAIN_TYPE)
                //method
                .post(String.class, text);

        return response;
    }

    public ClassToServiceSumAndProduct sumAndProduct(int[] nums) {

        WebResource resource = client.resource(url).path("sum-and-product");
        
        SumAndProductServiceRequest req = new SumAndProductServiceRequest(nums);

        ClassToServiceSumAndProduct response = resource
                .accept(MediaType.APPLICATION_XML_TYPE)
                .type(MediaType.APPLICATION_XML_TYPE)
                .post(ClassToServiceSumAndProduct.class, req);

        return response;
    }

    public Class2ServiceDate date() {
        WebResource resource = client.resource(url).path("date");

        Class2ServiceDate date = resource
                //type of response
                .accept(MediaType.APPLICATION_XML_TYPE)
                //method GET
                //response is unmarshalled from MediaTye (XML) to specified class
                //by JAXB provider (class must contain @XMLRootElement annotation)
                //fields are binded to same named XML elements (if not specified
                //differently)
                .get(Class2ServiceDate.class);

        return date;
    }

    ///TEST
    public static void main(String[] args) {
        Class2Client client = new Class2Client();

//        String upperCasedText = client.toUpperCase("aosandsoap");
//        System.out.println(upperCasedText);
//
//        Class2ServiceDate date = client.date();
//        System.out.println(date);
        ClassToServiceSumAndProduct response = client.sumAndProduct(new int[]{2,3});
        System.out.println(response);
    }
}

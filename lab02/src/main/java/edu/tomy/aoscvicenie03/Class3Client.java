/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.tomy.aoscvicenie03;

/**
 *
 * @author tomy
 */
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import javax.ws.rs.core.MediaType;

public class Class3Client {

    private Client client;
//    private final static String url = "http://localhost:8080/server/rest/users";
    private final static String url = "http://localhost:8080/aos-rest-users-server/rest/users";

    public Class3Client() {
        ClientConfig clientConfig = new DefaultClientConfig();
        //for automatic (un)marshaling to JSON
        clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
        client = Client.create(clientConfig);
    }

    /**
     * Adds a new user and return true, if added.
     *
     * @param user User details to be added.
     * @return true if user added, false if the username exists.
     */
    public boolean addUser(User user) {
        WebResource resource = client.resource(url).path("/");

        String response = resource //type of response
                .accept(MediaType.TEXT_PLAIN_TYPE) //type of request
                .type(MediaType.APPLICATION_JSON_TYPE) //method
                .post(String.class, user);

        return Boolean.valueOf(response);
    }

    /**
     * Returns user details by username.
     *
     * @param nickname Username of the user.
     * @return User details.
     */
    public User getUser(String nickname) {
        WebResource resource = client.resource(url).path(nickname);

        User response = resource.accept(MediaType.APPLICATION_JSON_TYPE).type(MediaType.TEXT_PLAIN_TYPE).get(User.class);

        return response;
    }

    ///TEST
    public static void main(String[] args) {
        Class3Client client = new Class3Client();

        User newUser = new User("adahot", "pass1");
        boolean added = client.addUser(newUser);
        System.out.println("User " + newUser + " has been " + (added ? "" : "already ") + "added!");

        String nickname = "adahot";
        User gotUser = client.getUser(nickname);
        System.out.println("User details for nickname: " + nickname + " -> " + gotUser);
    }
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.aos_lab03;

/**
 *
 * @author tomy
 */
import com.sun.jersey.api.client.AsyncWebResource;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import javax.ws.rs.core.MediaType;

public class Class3Client {

    private Client client;
    private final static String url = "http://localhost:8081/aos-rest-users-server/rest/users";

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
    
    public String updateUser(String nickname, User user){
        WebResource resource = client.resource(url).path(nickname);
        User update = new User();
        update.setGoals(user.getGoals());
        String response = resource.accept(MediaType.TEXT_PLAIN_TYPE).type(MediaType.APPLICATION_JSON_TYPE).put(String.class, update);
        return response;
    }

    public String updateUserPassword(String nickname, String password) {
        WebResource resource = client.resource(url).path(nickname);

        User u = new User();
        u.setPassword(password);
        String response = resource.accept(MediaType.TEXT_PLAIN_TYPE).type(MediaType.APPLICATION_JSON_TYPE).put(String.class, u);

        return response;
    }

    public UserList getAllUsers() {
        WebResource resource = client.resource(url).path("/");
        UserList response = resource.accept(MediaType.APPLICATION_XML_TYPE).get(UserList.class);
//        String response = resource.accept(MediaType.APPLICATION_JSON_TYPE).get(String.class);
        return response;
    }

    public String removeUserWithGivenNick(String nick) {
        WebResource resource = client.resource(url).path(nick);
        String response = resource.accept(MediaType.TEXT_PLAIN_TYPE).type(MediaType.TEXT_PLAIN).delete(String.class);
        return response;
    }

    public String addEmailAddressToUserByNick(String nick, String email) {
        WebResource resource = client.resource(url).path(nick).path("emails");
        User u = new User();
        u.setEmails(new String[]{email});
        String response = resource.accept(MediaType.TEXT_PLAIN_TYPE).type(MediaType.APPLICATION_JSON_TYPE).post(String.class, u);
        return response;
    }

    public String removeEmailAddressToUserByNick(String nick, String email) {
        WebResource resource = client.resource(url).path(nick).path("emails");
        User u = new User();
        u.setEmails(new String[]{email});
        String response = resource.header("X-HTTP-Method-Override", "DELETE").accept(MediaType.TEXT_PLAIN_TYPE).type(MediaType.APPLICATION_JSON_TYPE).post(String.class, u);
//        AsyncWebResource awr = client.asyncResource(url).path(nick).path("emails");
//        awr.accept(MediaType.TEXT_PLAIN_TYPE).type(MediaType.APPLICATION_JSON_TYPE).delete(String.class, u);
        return response;
    }

    ///TEST
    public static void main(String[] args) {
        Class3Client client = new Class3Client();

        // test: POST / vytvoří nového uživatele na základě POST dat 
        System.out.println("test: POST / vytvoří nového uživatele na základě POST dat ");
        User newUser = new User("miso", "pass1");
        boolean added = client.addUser(newUser);
        System.out.println("User " + newUser + " has been " + (added ? "" : "already ") + "added!");
        System.out.println("");

        // test: GET /{username} vylistuje všechny informace o uživateli ve formátu JSON 
        System.out.println("test: GET /{username} vylistuje všechny informace o uživateli ve formátu JSON ");
        String nickname = "miso";
        User gotUser = client.getUser(nickname);
        System.out.println("User details for nickname: " + nickname + " -> " + gotUser);
        System.out.println("");

        // test: PUT /{username} aktualizuje uživatelské informace (jméno a heslo) 
        System.out.println("test: PUT /{username} aktualizuje uživatelské informace (jméno a heslo) ");
        String newPassword = "superTajne";
        String response = client.updateUserPassword(nickname, newPassword);
        System.out.println("Updating user password '" + newUser.getPassword() + "' with '" + newPassword + "', result : " + response);
        System.out.println("User details for nickname: " + nickname + " -> " + client.getUser(nickname));
        System.out.println("");

        // test: GET / vylistuje všechny uživatele
        System.out.println("test: GET / vylistuje všechny uživatele");
        System.out.println("Listing all users:");
        System.out.println(client.getAllUsers());
        System.out.println("");

        // test: DELETE /{username} odstraní uživatele podle username
        System.out.println("test: DELETE /{username} odstraní uživatele podle username");
        System.out.println("Removing user with nick " + nickname);
        System.out.println("Result of operation: " + client.removeUserWithGivenNick(nickname));
        System.out.println("Listing all users after removing user with nickname '" + nickname + "': ");
        System.out.println(client.getAllUsers());
        System.out.println("");

        // test: POST /{username}/emails/ přidá uživateli e-mailovou adresu 
        System.out.println("test: POST /{username}/emails/ přidá uživateli e-mailovou adresu ");
        client.addUser(newUser);
        String newEmailAddress = "tomy@tomy.com";
        System.out.println("Adding new address '".concat(newEmailAddress).concat("' to user with nickname: ").concat(nickname));
        client.addEmailAddressToUserByNick(nickname, newEmailAddress);
        System.out.println("Listing all users after updating email addresses for user with nickname '" + nickname + "': ");
        System.out.println(client.getAllUsers());
        System.out.println("");

        // test: DELETE /{username}/emails/ smaže adresu 
        // posledny test je zakomentovany a nie je funkcny pretoze som narazil na vynimku typu 'java.net.ProtocolException: HTTP method DELETE doesn't support output'
        // riesenia ktore su popisane na http://jersey.576304.n2.nabble.com/Error-HTTP-method-DELETE-doesn-t-support-output-td4513829.html mi taktiez nepomohli uvedenu vynimku prekonat
        System.out.println("test: DELETE /{username}/emails/ smaže adresu");
        System.out.println("Deleting address '"+newEmailAddress+"' for user with nick: "+nickname);
        client.removeEmailAddressToUserByNick(nickname, newEmailAddress);
        System.out.println("Listing all users after deleting email address for user with nickname '" + nickname + "': ");
        System.out.println(client.getAllUsers());
        System.out.println("");
        
    }
}
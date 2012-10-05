package cz.cvut.fel.aos.resources;

import cz.cvut.fel.aos.db.AOSMemoryDB;
import cz.cvut.fel.aos.db.entities.UserEntity;
import cz.cvut.fel.aos.resources.mapping.MappingUser;
import java.util.Collection;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/users/")
public class UsersResource {

    // GET /{username} vylistuje všechny informace o uživateli ve formátu JSON 
    @GET
    @Path("/{nickname}/")
    @Produces(MediaType.APPLICATION_JSON)
    public MappingUser getUser(@PathParam("nickname") String nickname) {
        UserEntity userEntity = AOSMemoryDB.getUserByNick(nickname);
        return new MappingUser(userEntity);
    }

    // POST / vytvoří nového uživatele na základě POST dat 
    @POST
    @Path("/")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String add(MappingUser newUser) {
        UserEntity userEntity = new UserEntity(newUser.getNickname(), newUser.getPassword());
        boolean ret = AOSMemoryDB.addUser(userEntity);

        //sends the return value (primitive type) as plain text over network
        return String.valueOf(ret);
    }

    // PUT /{username} aktualizuje uživatelské informace (jméno a heslo) 
    @PUT
    @Path("/{nickname}/")
    @Consumes(MediaType.APPLICATION_JSON)
    public String updateUserData(@PathParam("nickname") String nickname, MappingUser user) {
        UserEntity userEntity = AOSMemoryDB.getUserByNick(nickname);
        if (userEntity == null) {
            return "Cannot find user with nick " + nickname;
        }
        String newPassword = user.getPassword();
        userEntity.changePassword(newPassword);
        return "Your password was updated succesfully";
    }

    // GET / vylistuje všechny uživatele 
    @GET
    @Path("/")
    public Collection<MappingUser> listUsers() {
        return AOSMemoryDB.getAllUserInMapping();
    }
    
    @GET
    @Path("/{nickname}/emails")
    @Consumes(MediaType.TEXT_PLAIN)
    public String listEmailAddressByUser(@PathParam("nickname") String nickname) {
        String emails = nickname+ "'s emails: ";
        UserEntity user = AOSMemoryDB.getUserByNick(nickname);
        if (user==null) {
            return "Cannot find user with nick " + nickname;
        }
        Collection<String> list = user.getEmails();
        System.out.println(">>>>>>>list "+list);
        for (String string : list) {
            emails.concat(string);
        }
        System.out.println(">>>>> "+user);
        return list.toString();
    }

    // DELETE /{username} odstraní uživatele podle username 
    @DELETE
    @Path("/{nickname}/")
    public String deleteUserByNickname(@PathParam("nickname") String nickname) {
        boolean result = AOSMemoryDB.deleteUserByNick(nickname);
        return result ? "Operation finished succesfully." : "Cannot find user with nick " + nickname;
    }

    // POST /{username}/emails/ přidá uživateli e-mailovou adresu 
    @POST
    @Path("/{nickname}/emails/")
    @Consumes(MediaType.APPLICATION_JSON)
    public String addEmailAddresForUser(@PathParam("nickname") String nickname, MappingUser user) {
        UserEntity userEntity = AOSMemoryDB.getUserByNick(nickname);
        if (userEntity == null) {
            return "Cannot find user with nick " + nickname;
        }
        List<String> addressList = user.getEmails();
        for (String address : addressList) {
            AOSMemoryDB.addEmailForNick(nickname, address);
        }
        return "Operation finished succesfully.";
    }
    
    // DELETE /{username}/emails/ smaže adresu 
    @DELETE
    @Path("/{nickname}/emails/")
    @Consumes(MediaType.APPLICATION_JSON)
    public String removeEmailAddresForUser(@PathParam("nickname") String nickname, MappingUser user) {
        UserEntity userEntity = AOSMemoryDB.getUserByNick(nickname);
        if (userEntity == null) {
            return "Cannot find user with nick " + nickname;
        }
        Collection<String> userEmails = userEntity.getEmails();
        List<String> addressList = user.getEmails();
        boolean result = userEmails.removeAll(addressList);
        return result ? "Operation 'removeEmailAddresForUser' finished succesfully." : "Cannot find given email address.";
    }
}

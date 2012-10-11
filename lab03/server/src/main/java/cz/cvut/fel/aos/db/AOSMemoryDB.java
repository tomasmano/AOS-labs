package cz.cvut.fel.aos.db;

import cz.cvut.fel.aos.db.entities.UserEntity;
import cz.cvut.fel.aos.resources.mapping.MappingUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Class that simulates in-memory database.
 */
public class AOSMemoryDB {

    private static Map<String, UserEntity> usersByNickName = new HashMap<String, UserEntity>();
    static {
        usersByNickName.put("tomy", new UserEntity("tomy", "bomba"));
    }

    public static boolean addUser(UserEntity user) {
        String nick = user.getNick();
        if (usersByNickName.containsKey(nick)) {
            return false;
        }
        usersByNickName.put(nick, user);
        return true;
    }

    public static boolean checkIfUserExistsByNick(String nick) {
        return usersByNickName.containsKey(nick);
    }

    /**
     * @returns false if user was not found
     */
    public static boolean addEmailForNick(String nick, String email) {
        boolean found = usersByNickName.containsKey(nick);
        if (!found) {
            return false;
        }
        UserEntity edited = AOSMemoryDB.getUserByNick(nick);
        edited.addEmail(email);
        System.out.println(edited);
        return true;
    }

    public static UserEntity getUserByNick(String nick) {
        return usersByNickName.get(nick);
    }

    public static Collection<UserEntity> getAllUsers() {
        return usersByNickName.values();
    }

    public static Collection<MappingUser> getAllUserInMapping() {
        Collection<UserEntity> users = usersByNickName.values();
        Collection<MappingUser> mappedUsers = new ArrayList<MappingUser>();
        for (UserEntity userEntity : users) {
            mappedUsers.add(new MappingUser(userEntity));
        }
        assert mappedUsers != null;
        return mappedUsers;
    }

    /**
     * @returns false if user was not found
     */
    public static boolean deleteUserByNick(String nick) {
        int before = usersByNickName.size();
        if (!usersByNickName.containsKey(nick)) {
            return false;
        }
        usersByNickName.remove(nick);
        int after = usersByNickName.size();
        assert after < before;
        return true;
    }

    public static boolean deleteEmailByNick(String nick, String email) {
        UserEntity edited = AOSMemoryDB.getUserByNick(nick);
        return edited.deleteEmail(email);
    }

    /**
     * @returns false if user was not found
     */
    public static boolean editNickAndPasswordforUserNick(String oldNick, String newNick, String password) {
        boolean found = usersByNickName.containsKey(oldNick);
        if (!found) {
            return false;
        }
        UserEntity edited = AOSMemoryDB.getUserByNick(oldNick);
        edited.changeUserNick(newNick);
        edited.changePassword(password);
        return true;
    }
}

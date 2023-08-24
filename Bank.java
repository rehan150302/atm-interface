import java.util.*;

public class Bank {

    private ArrayList<User> users;
    private User currentUser;

    public Bank() {
        this.users = new ArrayList<>();
        this.currentUser = null;
        // add some initial test users
        users.add(new User("1503", "1111", "Rehan", "Khan", 1000.0));
        users.add(new User("1603", "2222", "Ankit", "Raj", 500.0));
        users.add(new User("1703", "3333", "Saquib", "Rahman", 1000.0));
        users.add(new User("1803", "4444", "Saumya", "Sinha", 500.0));
    }

    public boolean authenticateUser(String userID, String userPIN) {
        for (User user : users) {
            if (user.getUserID().equals(userID) && user.authenticate(userPIN)) {
                currentUser = user;
                return true;
            }
        }
        return false;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public User getUserByID(String userID) {
        for (User user : users) {
            if (user.getUserID().equals(userID)) {
                return user;
            }
        }
        return null;
    }
}

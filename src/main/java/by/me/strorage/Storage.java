package by.me.strorage;

import by.me.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Storage {

    private List<User> userList = new ArrayList<>();

    public void addUser(User user) {
        userList.add(user);
    }

    //Check on exist(for registration)
    public boolean checkOnExist(User currentUser) {
        if (!userList.isEmpty()) {
            for (User user : userList) {
                if (currentUser.getLogin().equals(user.getLogin())) {
                    return true;
                }
            }
        }
        return false;
    }

    //check for authorization
    public boolean checkUser(String login, String password) {
        if (!userList.isEmpty()) {
            for (User user : userList) {
                if (user.getLogin().equals(login) && user.getPassword().equals(password))
                    return true;
            }
        }
        return false;
    }

}

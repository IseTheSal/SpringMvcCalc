package by.me.strorage;

import by.me.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Storage {


    private ArrayList<User> userList;

    public void addUser(User user) {
        userList.add(user);
    }

    public boolean checkOnExist(User currentUser) {
        for (User user : userList) {
            if (currentUser.getLogin().equals(user.getLogin())) {
                return true;
            }
        }
        return false;
    }

    public boolean checkUser(User currentUser) {
        for (User user : userList) {
            if (currentUser.getLogin().equals(user.getLogin()) && currentUser.getPassword().equals(user.getPassword())) {
                {
                    addUser(currentUser);
                    return true;
                }
            }
        }
        return false;
    }
}

package Homework1.onlineStore.storage;

import Homework1.onlineStore.Model.User;
import Homework1.onlineStore.Model.enums.UserType;
import Homework1.onlineStore.util.StorageSerializeUtil;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class UserStorage implements Serializable {

    private Map<String, User> users = new HashMap<>();


    public void add(User user) {
        users.put(user.getEmail(), user);
        StorageSerializeUtil.serializeUserStorage(this);
    }

    public void print() {
        ;
        for (User user : users.values()) {
            System.out.println(user);

        }
    }


    public User getByEmail(String email) {
        for (Map.Entry<String, User> entry : users.entrySet()) {
            if (entry.getKey().equals(email)) {
            }
            return entry.getValue();

        }

        return null;
    }

    public void printByType(UserType userType) {
        for (User user : users.values()) {
            if (user.getUserType() == userType) {
                System.out.println(user);
            }
        }
    }
}

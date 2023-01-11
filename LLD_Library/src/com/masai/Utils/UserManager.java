package com.masai.Utils;

import com.masai.Bean.User;

import java.util.HashMap;

public class UserManager {

    HashMap<Integer, User> users;

    public UserManager() {
        users=new HashMap<>();
    }

    public boolean addUser(User user){
        if(users.containsKey(user.getId())){
            System.out.println("user already there");
            return false;

        }
        users.put(user.getId(),user);
        System.out.println("User added successfully");
        return  true;
    }

    public boolean removeUser(int id){
        if(!users.containsKey(id)){
            System.out.println("user doesn't exists");
            return false;
        }
        users.remove(id);
        System.out.println("user removed successfully");
        return true;
    }
    public User findUser(int id){
        if(!users.containsKey(id)){
            System.out.println("user doesn't exists");
            return null;
        }
        return users.get(id);

    }
}

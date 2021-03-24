package by.it_academy.jd2.web.servlets.ChatHomework.core.storage;


import by.it_academy.jd2.web.servlets.ChatHomework.core.view.User;

import java.util.HashSet;
import java.util.Set;

public class AllUsers {
    private static Set<User> AllUsers;

    private AllUsers() {
    }
    public static Set<User> getAllUsers(){
        if(AllUsers==null){
            AllUsers= new HashSet<>();
        }return AllUsers;
    }
}

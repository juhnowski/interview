package com.juhnowski.q9;

import java.util.HashMap;

public class Auth {
    HashMap<String, String> map = new HashMap<>();

    public void add(String login, String password){
        map.put(login, password);
    }

    public boolean auth(String login, String password){
        return map.get(login).equals(password);
    }
}

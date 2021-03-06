package com.chenjiawen.Model;

import org.springframework.stereotype.Component;

@Component
public class HostHolder {
    private static ThreadLocal<User> userThreadLocal=new ThreadLocal<>();//单例模式
    private User user;

    private HostHolder(){}
    public User getUser() {
        return userThreadLocal.get();
    }

    public void setUser(User user) {
        userThreadLocal.set(user);
    }
    public void clearUser(){
        userThreadLocal.remove();
    }
}

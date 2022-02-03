package com.usuarios.services;

import com.usuarios.domain.User;

import java.util.List;

public interface UserServices {

    public List<User> getUser();
    public User getUserByid(User user);
    public void save(User user);
    public void dalete(User user);
}

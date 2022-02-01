package com.usuarios.services;

import com.usuarios.dao.DaoUsers;
import com.usuarios.domain.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServicesImp implements UserServices {

    @Autowired
    private DaoUsers daoUsers;

    @Override
    public List<User> geyUser() {
        return (List<User>) daoUsers.findAll();
    }

    @Override
    public User getUserByid(User user) {
        return daoUsers.findById(user.getId()).orElse(null);
    }

    @Override
    public void save(User user) {
        daoUsers.save(user);
    }

    @Override
    public void dalete(User user) {
        daoUsers.delete(user);
    }
}

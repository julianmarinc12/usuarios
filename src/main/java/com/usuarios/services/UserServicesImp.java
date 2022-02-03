package com.usuarios.services;

import com.usuarios.dao.DaoUsers;
import com.usuarios.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServicesImp implements UserServices {

    @Autowired
    private DaoUsers daoUsers;

    @Override
    @Transactional(readOnly = true)
    public List<User> getUser() {
        return (List<User>) daoUsers.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public User getUserByid(User user) {
        return daoUsers.findById(user.getId()).orElse(null);
    }

    @Override
    @Transactional
    public void save(User user) {
        daoUsers.save(user);
    }

    @Override
    @Transactional
    public void dalete(User user) {
        daoUsers.delete(user);
    }
}

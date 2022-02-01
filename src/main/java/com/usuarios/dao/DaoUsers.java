package com.usuarios.dao;

import com.usuarios.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface DaoUsers extends CrudRepository<User,Integer> {
}

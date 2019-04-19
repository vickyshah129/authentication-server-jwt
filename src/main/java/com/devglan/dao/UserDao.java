package com.devglan.dao;

import com.devglan.model.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<Users, Long> {
    Users findByUsername(String username);
}

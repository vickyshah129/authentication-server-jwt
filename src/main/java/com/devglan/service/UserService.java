package com.devglan.service;

import com.devglan.model.Users;

import java.util.List;

public interface UserService {

    Users save(Users user);
    List<Users> findAll();
    void delete(long id);
}

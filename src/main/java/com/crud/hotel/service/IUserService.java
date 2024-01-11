package com.crud.hotel.service;

import java.util.List;

import com.crud.hotel.model.User;

/**
 * @author Simpson Alfred
 */

public interface IUserService {
    User registerUser(User user);
    List<User> getUsers();
    void deleteUser(String email);
    User getUser(String email);
}

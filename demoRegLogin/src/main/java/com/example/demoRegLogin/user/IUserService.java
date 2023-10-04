package com.example.demoRegLogin.user;

import java.util.List;

public interface IUserService {

    public Integer saveUser(User user);

    List< User > getAllUsers();
    void saveUsers(User user);
    User getUserById(long id);
    void deleteUserById(long id);
}
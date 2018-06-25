package com.demo.service;
import com.demo.entity.User;
import java.util.List;
import java.util.Map;

public interface UserService {
    public User getUserById(int userId);

    boolean addUser(User record);

}
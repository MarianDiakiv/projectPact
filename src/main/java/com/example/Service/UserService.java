package com.example.Service;

import com.example.entity.UserEntity;

import java.util.List;

public interface UserService {
    UserEntity register(UserEntity user);
    List<UserEntity> getAll();
    UserEntity findByID(Long id);
    UserEntity findDyUserName(String name);
    void delete(Long id);

}

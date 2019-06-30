package com.example.ServiceImpl;

import com.example.Service.UserService;
import com.example.entity.UserEntity;
import com.example.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    //private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
        //this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserEntity register(UserEntity user) {
        //user.setPass(passwordEncoder.encode(user.getPass()));
        System.out.println("register  " + user.getLogin());
        return userRepository.save(user);
    }

    @Override
    public List<UserEntity> getAll() {
        List<UserEntity> users = userRepository.findAll();
        System.out.println( " count User"+ users.size());
        return  users;
    }

    @Override
    public UserEntity findByID(Long id) {
       return userRepository.getOne(id);
    }

    @Override
    public UserEntity findDyUserName(String name) {
        return userRepository.findByEmail(name);
    }

    @Override
    public void delete(Long id) {
    userRepository.deleteById(id);
        System.out.println("Deleted");
    }
}

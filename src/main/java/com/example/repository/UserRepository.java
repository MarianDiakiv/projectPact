package com.example.repository;

import com.example.entity.UserEntity;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    @Query("SELECT U FROM UserEntity  U WHERE U.email =:name")
    UserEntity findByEmail(@Param("name") String email);

}

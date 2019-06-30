package com.example.repository;

import com.example.entity.Cabinet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CabinetRepository extends JpaRepository<Cabinet, Long> {
    @Query("select c from Cabinet c where c.corps.id = :id")
    List<Cabinet> getAllCabinetByCourps(@Param("id") Long id);
}

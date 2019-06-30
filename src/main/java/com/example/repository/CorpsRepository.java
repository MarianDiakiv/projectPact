package com.example.repository;

import com.example.entity.Corps;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorpsRepository extends JpaRepository<Corps, Long> {

}

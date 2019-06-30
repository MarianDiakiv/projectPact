package com.example.Service;

import com.example.entity.Corps;

import java.util.List;

public interface CorpsService {
    List<Corps> getAllCorps();
    void save(Corps corps);
    Corps finById(Long id);

}

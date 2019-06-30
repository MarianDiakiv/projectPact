package com.example.repository;

import com.example.entity.Furniture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FurnityreRepository extends JpaRepository<Furniture,Long> {
    @Query("select f from Furniture  f where f.cabinetFurniture.id = :id")
    List<Furniture> findAllByCabinetID(@Param("id") Long id);
    @Query("select f from Furniture  f where f.storageFurniture.id = :id")
    List<Furniture> findAllByIdStorage(@Param("id")Long id);
}

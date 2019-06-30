package com.example.repository;

import com.example.entity.Furniture;
import com.example.entity.OtherDevice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OtherDeviceRepository extends JpaRepository<OtherDevice, Long> {
    @Query("select o  from OtherDevice  o where o.storageOther.id =:id")
    List<OtherDevice> findAllByStorageID(@Param("id") Long id);


}

package com.example.repository;

import com.example.entity.Cabinet;
import com.example.entity.ElectronicDevice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ElectronicDeviceRepository extends JpaRepository<ElectronicDevice ,Long> {
    @Query("select e from ElectronicDevice e where e.cabinetElectronic.id = :cabinetid")
    List<ElectronicDevice> getAllByIDCabinets(@Param("cabinetid") Long id);

    @Query("select e from ElectronicDevice e where e.storageElectronic.id = :storId")
    List<ElectronicDevice> getAllByIDStorage(@Param("storId") Long id);
}

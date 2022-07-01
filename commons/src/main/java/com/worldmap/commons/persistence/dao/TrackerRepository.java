package com.worldmap.commons.persistence.dao;

import com.worldmap.commons.persistence.entity.Tracker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrackerRepository extends JpaRepository<Tracker,Long> {

    public Tracker findBySerialNo(String serialNo);
}

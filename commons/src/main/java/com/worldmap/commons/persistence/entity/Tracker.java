package com.worldmap.commons.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tracker")
public class Tracker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="serial_no", unique = true)
    private String serialNo;

    @Column(name="name")
    private String name;

    @Column(name="type")
    private String type;
}

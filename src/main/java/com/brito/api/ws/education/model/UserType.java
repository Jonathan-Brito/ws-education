package com.brito.api.ws.education.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "user_type")
public class UserType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_type_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;
}

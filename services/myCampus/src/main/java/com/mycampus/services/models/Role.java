package com.mycampus.services.models;

import javax.persistence.*;

/**
 * Created by vijay on 04-04-2020.
 */
@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private AppRoles name;

    public Role() {
    }

    public Role(AppRoles name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AppRoles getName() {
        return name;
    }

    public void setName(AppRoles name) {
        this.name = name;
    }

}

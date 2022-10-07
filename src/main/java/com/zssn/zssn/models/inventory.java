package com.zssn.zssn.models;

import javax.persistence.*;

@Entity
public class inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;

    @Column
    private long survivorId;

    public long getSurvivorId() {
        return survivorId;
    }

    public void setSurvivorId(long survivorId) {
        this.survivorId = survivorId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.zssn.zssn.models;

import javax.persistence.*;

@Entity
public class Survivor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;
    @Column
    private int age;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getLocactionX() {
        return locactionX;
    }

    public void setLocactionX(double locactionX) {
        this.locactionX = locactionX;
    }

    public double getLocactionY() {
        return locactionY;
    }

    public void setLocactionY(double locactionY) {
        this.locactionY = locactionY;
    }

    public boolean isInfected() {
        return infected;
    }

    public void setInfected(boolean infected) {
        this.infected = infected;
    }

    @Column
    private String gender;
    @Column
    private double locactionX;
    @Column
    private double locactionY;
    @Column
    private boolean infected;

}

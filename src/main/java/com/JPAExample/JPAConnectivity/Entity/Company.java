package com.JPAExample.JPAConnectivity.Entity;

import org.hibernate.annotations.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;
    int stipend;
    boolean wfh;
    int duration;
    String profile;

    public Company() {
    }

    public Company(int id, String name, int stipend, boolean wfh, int duration, String profile) {
        this.id = id;
        this.name = name;
        this.stipend = stipend;
        this.wfh = wfh;
        this.duration = duration;
        this.profile = profile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStipend() {
        return stipend;
    }

    public void setStipend(int stipend) {
        this.stipend = stipend;
    }

    public boolean isWfh() {
        return wfh;
    }

    public void setWfh(boolean wfh) {
        this.wfh = wfh;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
}




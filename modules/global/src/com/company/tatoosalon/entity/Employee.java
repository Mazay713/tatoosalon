package com.company.tatoosalon.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import com.haulmont.cuba.core.entity.StandardEntity;
import org.checkerframework.checker.units.qual.C;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

@Table(name = "TATOOSALON_EMPLOYEE")
@Entity(name = "tatoosalon_Employee")
@NamePattern("%s|lastName,experience, passport,firstName,middleName,phone")
public class Employee extends BaseIntegerIdEntity implements HasUuid {
    private static final long serialVersionUID = -1984713828591331032L;
    @Column(name = "UUID")
    private UUID uuid;
    @Column(name = "FIRSTNAME")
    private String firstName;
    @Column(name = "LASTNAME")
    private String lastName;
    @Column(name = "MIDDLENAME")
    private String middleName;
    @Column(name= "PHONE")
    private String phone;
    @Column(name = "EXPERIENCE")
    private String experience;
    @Column(name = "PASSPORT")
    private String passport;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
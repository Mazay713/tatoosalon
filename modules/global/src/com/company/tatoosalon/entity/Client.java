package com.company.tatoosalon.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

@Table(name = "TATOOSALON_CLIENT")
@Entity(name = "tatoosalon_Client")
@NamePattern("%s|email,card,firstName,lastName,middleName,phone")
public class Client extends BaseIntegerIdEntity implements HasUuid {
    private static final long serialVersionUID = -3530827760096236424L;
    @Column(name = "UUID")
    private UUID uuid;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "CARD")
    private Boolean card;
    @Column(name = "FIRSTNAME")
    private String firstName;
    @Column(name = "LASTNAME")
    private String lastName;
    @Column(name = "MIDDLENAME")
    private String middleName;
    @Column(name = "PHONE")
    private String phone;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getCard() {
        return card;
    }

    public void setCard(Boolean card) {
        this.card = card;
    }

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

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
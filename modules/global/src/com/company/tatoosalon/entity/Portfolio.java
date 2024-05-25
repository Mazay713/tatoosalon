package com.company.tatoosalon.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.UUID;

@Table(name = "TATOOSALON_PORTFOLIO")
@Entity(name = "tatoosalon_Portfolio")
@NamePattern("%s|name, description, employee_id")
public class Portfolio extends BaseIntegerIdEntity implements HasUuid {
    private static final long serialVersionUID = -4105067914803616652L;
    @Column(name = "UUID")
    private UUID uuid;
    @Column(name = "NAME")
    private String name;
    @Column(name = "DESCRIPTION")
    private String description;
    @ManyToOne
    @JoinColumn(name = "EMPLOYEE_ID")
    private Employee employee_id;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Employee getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Employee employee_id) {
        this.employee_id = employee_id;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
package com.company.tatoosalon.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

@Table(name = "TATOOSALON_SERVICE_CATEGORY")
@Entity(name = "tatoosalon_Service_Category")
@NamePattern("%s|name")
public class Service_Category extends BaseIntegerIdEntity implements HasUuid {
    private static final long serialVersionUID = 2974504504864505017L;
    @Column(name = "UUID")
    private UUID uuid;
    @Column(name = "NAME")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
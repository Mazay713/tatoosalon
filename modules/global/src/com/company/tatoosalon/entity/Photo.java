package com.company.tatoosalon.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.entity.HasUuid;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.sound.sampled.Port;
import java.io.File;
import java.util.UUID;

@Table(name = "TATOOSALON_PHOTO")
@Entity(name = "tatoosalon_Photo")
@NamePattern("%s|name, portfolio_id")
public class Photo extends BaseIntegerIdEntity implements HasUuid {
    private static final long serialVersionUID = -6983866787099706589L;
    @Column(name = "UUID")
    private UUID uuid;

    @ManyToOne
    @JoinColumn(name = "NAME")
    private FileDescriptor name;

    @ManyToOne
    @JoinColumn(name = "PORTFOLIO_ID")
    private Portfolio portfolio_id;

    public FileDescriptor getName() {
        return name;
    }

    public void setName(FileDescriptor name) {
        this.name = name;
    }

    public Portfolio getPortfolio_id() {
        return portfolio_id;
    }

    public void setPortfolio_id(Portfolio portfolio_id) {
        this.portfolio_id = portfolio_id;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
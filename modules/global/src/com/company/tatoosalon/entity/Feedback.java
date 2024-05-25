package com.company.tatoosalon.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.UUID;

@Table(name = "TATOOSALON_FEEDBACK")
@Entity(name = "tatoosalon_Feedback")
@NamePattern("%s|estimation, registration_id")
public class Feedback extends BaseIntegerIdEntity implements HasUuid {
    private static final long serialVersionUID = 6501005468258625463L;
    @Column(name = "UUID")
    private UUID uuid;
    @Column(name = "ESTIMATION")
    private Integer estimation;
    @ManyToOne
    @JoinColumn(name = "REGISTRATION_ID")
    private Registration registration_id;
    @Column(name = "CONTENT")
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        content = content;
    }

    public Integer getEstimation() {
        return estimation;
    }

    public void setEstimation(Integer estimation) {
        this.estimation = estimation;
    }

    public Registration getRegistration_id() {
        return registration_id;
    }

    public void setRegistration_id(Registration registration_id) {
        this.registration_id = registration_id;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
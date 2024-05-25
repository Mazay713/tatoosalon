package com.company.tatoosalon.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.UUID;

@Table(name = "TATOOSALON_REGISTRATION_SERVICE")
@Entity(name = "tatoosalon_Registration_Service")
@NamePattern("%s|registration_id, service_id")
public class Registration_Service extends BaseIntegerIdEntity implements HasUuid {
    private static final long serialVersionUID = -7736691439135516691L;
    @Column(name = "UUID")
    private UUID uuid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "REGISTRATION_ID")
    private Registration registration_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SERVICE_ID")
    private Service service_id;

    public Registration getRegistration_id() {
        return registration_id;
    }

    public void setRegistration_id(Registration registration_id) {
        this.registration_id = registration_id;
    }

    public Service getService_id() {
        return service_id;
    }

    public void setService_id(Service service_id) {
        this.service_id = service_id;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
package com.company.tatoosalon.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import com.haulmont.cuba.core.entity.StandardEntity;
import org.eclipse.persistence.jpa.jpql.parser.DateTime;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Table(name = "TATOOSALON_REGISTRATION")
@Entity(name = "tatoosalon_Registration")
@NamePattern("%s|date, registrationServices, client_id")
public class Registration extends BaseIntegerIdEntity implements HasUuid {
    private static final long serialVersionUID = 6764148776454779757L;
    @Column(name = "UUID")
    private UUID uuid;

    @Column(name = "DATE")
    private Date  date;

    public List<Registration_Service> getRegistrationServices() {
        return registrationServices;
    }

    public void setRegistrationServices(List<Registration_Service> registrationServices) {
        this.registrationServices = registrationServices;
    }

    @Composition
    @OneToMany(mappedBy = "registration_id")
    protected List<Registration_Service> registrationServices;

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID")
    private Client client_id;


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Client getClient_id() {
        return client_id;
    }

    public void setClient_id(Client client_id) {
        this.client_id = client_id;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
package com.company.tatoosalon.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Table(name = "TATOOSALON_SERVICE")
@Entity(name = "tatoosalon_Service")
@NamePattern("%s|price, description, name, serviceCategory_id, employee_id, registrationServices")
public class Service extends BaseIntegerIdEntity implements HasUuid {
    private static final long serialVersionUID = -7243135893540285210L;
    @Column(name = "UUID")
    private UUID uuid;

    @Column(name = "PRICE")
    private Integer price;
    @Column(name = "DESCRPTION")
    private String description;
    @Column(name = "NAME")
    private String name;
    @ManyToOne
    @JoinColumn(name = "SERVICE_CATEGORY_ID")
    private Service_Category serviceCategory_id;

    @ManyToOne
    @JoinColumn(name = "EMPLOYEE_ID")
    private Employee employee_id;
    @Composition
    @OneToMany(mappedBy = "service_id")
    protected List<Registration_Service> registrationServices;

    public List<Registration_Service> getRegistrationServices() {
        return registrationServices;
    }

    public void setRegistrationServices(List<Registration_Service> registrationServices) {
        this.registrationServices = registrationServices;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Service_Category getServiceCategory_id() {
        return serviceCategory_id;
    }

    public void setServiceCategory_id(Service_Category serviceCategory_id) {
        this.serviceCategory_id = serviceCategory_id;
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
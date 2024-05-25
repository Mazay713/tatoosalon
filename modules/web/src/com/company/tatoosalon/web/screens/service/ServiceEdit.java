package com.company.tatoosalon.web.screens.service;

import com.haulmont.cuba.gui.screen.*;
import com.company.tatoosalon.entity.Service;

@UiController("tatoosalon_Service.edit")
@UiDescriptor("service-edit.xml")
@EditedEntityContainer("serviceDc")
@LoadDataBeforeShow
public class ServiceEdit extends StandardEditor<Service> {
}
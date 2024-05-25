package com.company.tatoosalon.web.screens.registration_service;

import com.haulmont.cuba.gui.screen.*;
import com.company.tatoosalon.entity.Registration_Service;

@UiController("tatoosalon_Registration_Service.edit")
@UiDescriptor("registration_service-edit.xml")
@EditedEntityContainer("registration_ServiceDc")
@LoadDataBeforeShow
public class Registration_ServiceEdit extends StandardEditor<Registration_Service> {
}
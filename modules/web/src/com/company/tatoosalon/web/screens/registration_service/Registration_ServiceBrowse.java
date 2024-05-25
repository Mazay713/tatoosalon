package com.company.tatoosalon.web.screens.registration_service;

import com.haulmont.cuba.gui.screen.*;
import com.company.tatoosalon.entity.Registration_Service;

@UiController("tatoosalon_Registration_Service.browse")
@UiDescriptor("registration_service-browse.xml")
@LookupComponent("registration_ServicesTable")
@LoadDataBeforeShow
public class Registration_ServiceBrowse extends StandardLookup<Registration_Service> {
}
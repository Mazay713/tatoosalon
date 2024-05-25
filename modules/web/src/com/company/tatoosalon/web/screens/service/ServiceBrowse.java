package com.company.tatoosalon.web.screens.service;

import com.haulmont.cuba.gui.screen.*;
import com.company.tatoosalon.entity.Service;

@UiController("tatoosalon_Service.browse")
@UiDescriptor("service-browse.xml")
@LookupComponent("servicesTable")
@LoadDataBeforeShow
public class ServiceBrowse extends StandardLookup<Service> {
}
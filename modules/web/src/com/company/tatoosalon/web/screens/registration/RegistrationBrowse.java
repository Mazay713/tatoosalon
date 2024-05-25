package com.company.tatoosalon.web.screens.registration;

import com.haulmont.cuba.gui.screen.*;
import com.company.tatoosalon.entity.Registration;

@UiController("tatoosalon_Registration.browse")
@UiDescriptor("registration-browse.xml")
@LookupComponent("registrationsTable")
@LoadDataBeforeShow
public class RegistrationBrowse extends StandardLookup<Registration> {
}
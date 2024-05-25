package com.company.tatoosalon.web.screens.registration;

import com.haulmont.cuba.gui.screen.*;
import com.company.tatoosalon.entity.Registration;

@UiController("tatoosalon_Registration.edit")
@UiDescriptor("registration-edit.xml")
@EditedEntityContainer("registrationDc")
@LoadDataBeforeShow
public class RegistrationEdit extends StandardEditor<Registration> {
}
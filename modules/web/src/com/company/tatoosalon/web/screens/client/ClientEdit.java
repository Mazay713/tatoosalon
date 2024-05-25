package com.company.tatoosalon.web.screens.client;

import com.haulmont.cuba.gui.screen.*;
import com.company.tatoosalon.entity.Client;

@UiController("tatoosalon_Client.edit")
@UiDescriptor("client-edit.xml")
@EditedEntityContainer("clientDc")
@LoadDataBeforeShow
public class ClientEdit extends StandardEditor<Client> {
}
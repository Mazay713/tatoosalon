package com.company.tatoosalon.web.screens.client;

import com.haulmont.cuba.gui.screen.*;
import com.company.tatoosalon.entity.Client;

@UiController("tatoosalon_Client.browse")
@UiDescriptor("client-browse.xml")
@LookupComponent("clientsTable")
@LoadDataBeforeShow
public class ClientBrowse extends StandardLookup<Client> {
}
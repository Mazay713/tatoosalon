package com.company.tatoosalon.web.screens.service_category;

import com.haulmont.cuba.gui.screen.*;
import com.company.tatoosalon.entity.Service_Category;

@UiController("tatoosalon_Service_Category.edit")
@UiDescriptor("service_category-edit.xml")
@EditedEntityContainer("service_CategoryDc")
@LoadDataBeforeShow
public class Service_CategoryEdit extends StandardEditor<Service_Category> {
}
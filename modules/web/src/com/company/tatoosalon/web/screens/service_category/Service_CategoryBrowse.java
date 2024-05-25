package com.company.tatoosalon.web.screens.service_category;

import com.haulmont.cuba.gui.screen.*;
import com.company.tatoosalon.entity.Service_Category;

@UiController("tatoosalon_Service_Category.browse")
@UiDescriptor("service_category-browse.xml")
@LookupComponent("service_CategoriesTable")
@LoadDataBeforeShow
public class Service_CategoryBrowse extends StandardLookup<Service_Category> {
}
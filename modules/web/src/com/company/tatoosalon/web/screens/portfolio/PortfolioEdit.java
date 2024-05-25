package com.company.tatoosalon.web.screens.portfolio;

import com.haulmont.cuba.gui.screen.*;
import com.company.tatoosalon.entity.Portfolio;

@UiController("tatoosalon_Portfolio.edit")
@UiDescriptor("portfolio-edit.xml")
@EditedEntityContainer("portfolioDc")
@LoadDataBeforeShow
public class PortfolioEdit extends StandardEditor<Portfolio> {
}
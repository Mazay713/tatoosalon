package com.company.tatoosalon.web.screens.portfolio;

import com.haulmont.cuba.gui.screen.*;
import com.company.tatoosalon.entity.Portfolio;

@UiController("tatoosalon_Portfolio.browse")
@UiDescriptor("portfolio-browse.xml")
@LookupComponent("portfoliosTable")
@LoadDataBeforeShow
public class PortfolioBrowse extends StandardLookup<Portfolio> {
}
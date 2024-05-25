package com.company.tatoosalon.web.screens.employee;

import com.haulmont.cuba.gui.screen.*;
import com.company.tatoosalon.entity.Employee;

@UiController("tatoosalon_Employee.browse")
@UiDescriptor("employee-browse.xml")
@LookupComponent("employeesTable")
@LoadDataBeforeShow
public class EmployeeBrowse extends StandardLookup<Employee> {
}
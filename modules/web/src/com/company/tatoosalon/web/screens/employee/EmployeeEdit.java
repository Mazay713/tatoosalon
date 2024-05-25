package com.company.tatoosalon.web.screens.employee;

import com.haulmont.cuba.gui.screen.*;
import com.company.tatoosalon.entity.Employee;

@UiController("tatoosalon_Employee.edit")
@UiDescriptor("employee-edit.xml")
@EditedEntityContainer("employeeDc")
@LoadDataBeforeShow
public class EmployeeEdit extends StandardEditor<Employee> {
}
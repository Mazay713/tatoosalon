package com.company.tatoosalon.web.screens.feedback;

import com.haulmont.cuba.gui.screen.*;
import com.company.tatoosalon.entity.Feedback;

@UiController("tatoosalon_Feedback.edit")
@UiDescriptor("feedback-edit.xml")
@EditedEntityContainer("feedbackDc")
@LoadDataBeforeShow
public class FeedbackEdit extends StandardEditor<Feedback> {
}
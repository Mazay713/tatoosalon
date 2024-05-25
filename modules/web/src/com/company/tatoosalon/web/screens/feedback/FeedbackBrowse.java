package com.company.tatoosalon.web.screens.feedback;

import com.haulmont.cuba.gui.screen.*;
import com.company.tatoosalon.entity.Feedback;

@UiController("tatoosalon_Feedback.browse")
@UiDescriptor("feedback-browse.xml")
@LookupComponent("feedbacksTable")
@LoadDataBeforeShow
public class FeedbackBrowse extends StandardLookup<Feedback> {
}
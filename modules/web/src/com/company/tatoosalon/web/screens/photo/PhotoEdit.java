package com.company.tatoosalon.web.screens.photo;

import com.haulmont.cuba.gui.screen.*;
import com.company.tatoosalon.entity.Photo;

@UiController("tatoosalon_Photo.edit")
@UiDescriptor("photo-edit.xml")
@EditedEntityContainer("photoDc")
@LoadDataBeforeShow
public class PhotoEdit extends StandardEditor<Photo> {
}
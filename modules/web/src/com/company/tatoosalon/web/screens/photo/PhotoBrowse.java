package com.company.tatoosalon.web.screens.photo;

import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.gui.UiComponents;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.export.FileDataProvider;
import com.haulmont.cuba.gui.screen.*;
import com.company.tatoosalon.entity.Photo;
import com.haulmont.cuba.gui.screen.LookupComponent;
import com.haulmont.cuba.gui.xml.layout.ComponentsFactory;
import com.haulmont.cuba.web.gui.components.presentations.actions.AbstractEditPresentationAction;

import javax.inject.Inject;
import java.util.Map;

@UiController("tatoosalon_Photo.browse")
@UiDescriptor("photo-browse.xml")
@LookupComponent("photosTable")
@LoadDataBeforeShow
public class PhotoBrowse extends StandardLookup<Photo> {
    @Inject
    protected UiComponents uiComponents;
    @Inject
    private ComponentsFactory componentsFactory;

    @Inject
    private GroupTable<Photo> photosTable;

    @Subscribe
    public void onInit(InitEvent event) {
        photosTable.addGeneratedColumn("image", this::renderAvatarImageComponent);
    }
    private Component renderAvatarImageComponent(Photo photo){
        FileDescriptor imageFile = photo.getName();
        if (imageFile == null){
            return null;
        }
        Image image = smallAvatarImage();
        image.setSource(FileDescriptorResource.class)
                .setFileDescriptor(imageFile);

        return image;
    }

    private Image smallAvatarImage() {
        Image image = uiComponents.create(Image.class);
        image.setScaleMode(Image.ScaleMode.CONTAIN);
        image.setHeight("250");
        image.setWidth("250");
        image.setStyleName("avatar-icon-small");
        return image;
    }
    }

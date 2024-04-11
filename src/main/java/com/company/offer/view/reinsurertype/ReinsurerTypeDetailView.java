package com.company.offer.view.reinsurertype;

import com.company.offer.entity.ReinsurerType;

import com.company.offer.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "reinsurerTypes/:id", layout = MainView.class)
@ViewController("ReinsurerType.detail")
@ViewDescriptor("reinsurer-type-detail-view.xml")
@EditedEntityContainer("reinsurerTypeDc")
public class ReinsurerTypeDetailView extends StandardDetailView<ReinsurerType> {
}
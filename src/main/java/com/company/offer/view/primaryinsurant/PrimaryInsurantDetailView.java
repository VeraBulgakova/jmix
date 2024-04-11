package com.company.offer.view.primaryinsurant;

import com.company.offer.entity.PrimaryInsurant;

import com.company.offer.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "primaryInsurants/:id", layout = MainView.class)
@ViewController("PrimaryInsurant.detail")
@ViewDescriptor("primary-insurant-detail-view.xml")
@EditedEntityContainer("primaryInsurantDc")
public class PrimaryInsurantDetailView extends StandardDetailView<PrimaryInsurant> {
}
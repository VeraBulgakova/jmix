package com.company.offer.view.insurant;

import com.company.offer.entity.Insurant;

import com.company.offer.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "insurants/:id", layout = MainView.class)
@ViewController("Insurant.detail")
@ViewDescriptor("insurant-detail-view.xml")
@EditedEntityContainer("insurantDc")
public class InsurantDetailView extends StandardDetailView<Insurant> {
}
package com.company.offer.view.insurant;

import com.company.offer.entity.Insurant;

import com.company.offer.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "insurants", layout = MainView.class)
@ViewController("Insurant.list")
@ViewDescriptor("insurant-list-view.xml")
@LookupComponent("insurantsDataGrid")
@DialogMode(width = "64em")
public class InsurantListView extends StandardListView<Insurant> {
}
package com.company.offer.view.primaryinsurant;

import com.company.offer.entity.PrimaryInsurant;

import com.company.offer.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "primaryInsurants", layout = MainView.class)
@ViewController("PrimaryInsurant.list")
@ViewDescriptor("primary-insurant-list-view.xml")
@LookupComponent("primaryInsurantsDataGrid")
@DialogMode(width = "64em")
public class PrimaryInsurantListView extends StandardListView<PrimaryInsurant> {
}
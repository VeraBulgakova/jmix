package com.company.offer.view.reinsurer;

import com.company.offer.entity.Reinsurer;

import com.company.offer.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "reinsurers", layout = MainView.class)
@ViewController("Reinsurer.list")
@ViewDescriptor("reinsurer-list-view.xml")
@LookupComponent("reinsurersDataGrid")
@DialogMode(width = "64em")
public class ReinsurerListView extends StandardListView<Reinsurer> {
}
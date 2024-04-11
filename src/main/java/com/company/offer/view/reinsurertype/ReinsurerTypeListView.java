package com.company.offer.view.reinsurertype;

import com.company.offer.entity.ReinsurerType;

import com.company.offer.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "reinsurerTypes", layout = MainView.class)
@ViewController("ReinsurerType.list")
@ViewDescriptor("reinsurer-type-list-view.xml")
@LookupComponent("reinsurerTypesDataGrid")
@DialogMode(width = "64em")
public class ReinsurerTypeListView extends StandardListView<ReinsurerType> {
}
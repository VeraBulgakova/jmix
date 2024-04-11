package com.company.offer.view.poolofreinsurers;

import com.company.offer.entity.PoolOfReinsurers;

import com.company.offer.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "poolOfReinsurerses", layout = MainView.class)
@ViewController("PoolOfReinsurers.list")
@ViewDescriptor("pool-of-reinsurers-list-view.xml")
@LookupComponent("poolOfReinsurersesDataGrid")
@DialogMode(width = "64em")
public class PoolOfReinsurersListView extends StandardListView<PoolOfReinsurers> {
}
package com.company.offer.view.poolofreinsurers;

import com.company.offer.entity.PoolOfReinsurers;

import com.company.offer.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "poolOfReinsurerses/:id", layout = MainView.class)
@ViewController("PoolOfReinsurers.detail")
@ViewDescriptor("pool-of-reinsurers-detail-view.xml")
@EditedEntityContainer("poolOfReinsurersDc")
public class PoolOfReinsurersDetailView extends StandardDetailView<PoolOfReinsurers> {
}
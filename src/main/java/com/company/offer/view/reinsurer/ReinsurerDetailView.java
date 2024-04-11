package com.company.offer.view.reinsurer;

import com.company.offer.entity.Reinsurer;

import com.company.offer.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "reinsurers/:id", layout = MainView.class)
@ViewController("Reinsurer.detail")
@ViewDescriptor("reinsurer-detail-view.xml")
@EditedEntityContainer("reinsurerDc")
public class ReinsurerDetailView extends StandardDetailView<Reinsurer> {
}
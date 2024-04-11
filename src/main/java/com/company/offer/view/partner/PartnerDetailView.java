package com.company.offer.view.partner;

import com.company.offer.entity.Partner;

import com.company.offer.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "partners/:id", layout = MainView.class)
@ViewController("Partner.detail")
@ViewDescriptor("partner-detail-view.xml")
@EditedEntityContainer("partnerDc")
public class PartnerDetailView extends StandardDetailView<Partner> {
}
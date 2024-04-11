package com.company.offer.view.offer;

import com.company.offer.entity.Offer;

import com.company.offer.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "offers", layout = MainView.class)
@ViewController("Offer.list")
@ViewDescriptor("offer-list-view.xml")
@LookupComponent("offersDataGrid")
@DialogMode(width = "64em")
public class OfferListView extends StandardListView<Offer> {
}
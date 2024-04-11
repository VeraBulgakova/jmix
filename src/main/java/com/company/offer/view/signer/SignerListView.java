package com.company.offer.view.signer;

import com.company.offer.entity.Signer;

import com.company.offer.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "signers", layout = MainView.class)
@ViewController("Signer.list")
@ViewDescriptor("signer-list-view.xml")
@LookupComponent("signersDataGrid")
@DialogMode(width = "64em")
public class SignerListView extends StandardListView<Signer> {
}
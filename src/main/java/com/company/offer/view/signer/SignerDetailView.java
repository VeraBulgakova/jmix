package com.company.offer.view.signer;

import com.company.offer.entity.Signer;

import com.company.offer.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "signers/:id", layout = MainView.class)
@ViewController("Signer.detail")
@ViewDescriptor("signer-detail-view.xml")
@EditedEntityContainer("signerDc")
public class SignerDetailView extends StandardDetailView<Signer> {
}
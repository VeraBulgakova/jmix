package com.company.offer.view.contractsubtype;

import com.company.offer.entity.ContractSubtype;

import com.company.offer.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "contractSubtypes/:id", layout = MainView.class)
@ViewController("ContractSubtype.detail")
@ViewDescriptor("contract-subtype-detail-view.xml")
@EditedEntityContainer("contractSubtypeDc")
public class ContractSubtypeDetailView extends StandardDetailView<ContractSubtype> {
}
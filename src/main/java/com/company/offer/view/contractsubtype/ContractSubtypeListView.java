package com.company.offer.view.contractsubtype;

import com.company.offer.entity.ContractSubtype;

import com.company.offer.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "contractSubtypes", layout = MainView.class)
@ViewController("ContractSubtype.list")
@ViewDescriptor("contract-subtype-list-view.xml")
@LookupComponent("contractSubtypesDataGrid")
@DialogMode(width = "64em")
public class ContractSubtypeListView extends StandardListView<ContractSubtype> {
}
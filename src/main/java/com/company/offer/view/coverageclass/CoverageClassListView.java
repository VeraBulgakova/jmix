package com.company.offer.view.coverageclass;

import com.company.offer.entity.CoverageClass;

import com.company.offer.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "coverageClasses", layout = MainView.class)
@ViewController("CoverageClass.list")
@ViewDescriptor("coverage-class-list-view.xml")
@LookupComponent("coverageClassesDataGrid")
@DialogMode(width = "64em")
public class CoverageClassListView extends StandardListView<CoverageClass> {
}
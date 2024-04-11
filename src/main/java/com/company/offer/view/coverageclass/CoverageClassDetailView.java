package com.company.offer.view.coverageclass;

import com.company.offer.entity.CoverageClass;

import com.company.offer.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "coverageClasses/:id", layout = MainView.class)
@ViewController("CoverageClass.detail")
@ViewDescriptor("coverage-class-detail-view.xml")
@EditedEntityContainer("coverageClassDc")
public class CoverageClassDetailView extends StandardDetailView<CoverageClass> {
}
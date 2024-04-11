package com.company.offer.view.offer;

import com.company.offer.entity.Offer;
import com.company.offer.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.datepicker.TypedDatePicker;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.view.*;

import java.math.BigInteger;
import java.time.LocalDate;

@Route(value = "offers/:id", layout = MainView.class)
@ViewController("Offer.detail")
@ViewDescriptor("offer-detail-view.xml")
@EditedEntityContainer("offerDc")
public class OfferDetailView extends StandardDetailView<Offer> {

    @ViewComponent
    private TypedDatePicker<LocalDate> startDateInsuranceField;

    @ViewComponent
    private TypedDatePicker<LocalDate> endDateInsuranceField;
    @ViewComponent
    private TypedTextField<BigInteger> periodInsuranceField;

//    @Subscribe("endDateInsuranceField")
//    public void onEndDateInsuranceFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<TypedDatePicker<LocalDate>, LocalDate> event) {
//        if (event.getValue() != null && startDateInsuranceField.getValue() != null) {
//            periodInsuranceField.setValue(String.valueOf(endDateInsuranceField.getValue().toEpochDay() - startDateInsuranceField.getValue().toEpochDay()));
//        }
//    }
//
//    @Subscribe("startDateInsuranceField")
//    public void onStartDateInsuranceFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<TypedDatePicker<LocalDate>, LocalDate> event) {
//        if (event.getValue() != null && endDateInsuranceField.getValue() != null) {
//            periodInsuranceField.setValue(String.valueOf(endDateInsuranceField.getValue().toEpochDay() - startDateInsuranceField.getValue().toEpochDay()));
//        }
//    }


}
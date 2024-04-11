package com.company.offer.entity;

import io.jmix.core.metamodel.datatype.EnumClass;
import org.springframework.lang.Nullable;


public enum SigningForm implements EnumClass<String> {

    ;

    private final String id;

    SigningForm(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static SigningForm fromId(String id) {
        for (SigningForm at : SigningForm.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}
package com.company.offer.entity;

import io.jmix.core.metamodel.datatype.EnumClass;
import org.springframework.lang.Nullable;


public enum PartnerType implements EnumClass<String> {

    BROKER("A"),
    INSURANCE_CO("B");

    private final String id;

    PartnerType(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static PartnerType fromId(String id) {
        for (PartnerType at : PartnerType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}
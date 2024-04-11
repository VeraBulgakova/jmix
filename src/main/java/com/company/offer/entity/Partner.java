package com.company.offer.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "PARTNER")
@Entity
public class Partner {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "PARTNER_NAME")
    private String partnerName;

    @Column(name = "PARTNER_INN")
    private String partnerINN;

    @Column(name = "PARTNER_OGRN")
    private String partnerOGRN;

    @Composition
    @OneToMany(mappedBy = "partner")
    private List<Offer> offer;

    public List<Offer> getOffer() {
        return offer;
    }

    public void setOffer(List<Offer> offer) {
        this.offer = offer;
    }

    public String getPartnerOGRN() {
        return partnerOGRN;
    }

    public void setPartnerOGRN(String partnerOGRN) {
        this.partnerOGRN = partnerOGRN;
    }

    public String getPartnerINN() {
        return partnerINN;
    }

    public void setPartnerINN(String partnerINN) {
        this.partnerINN = partnerINN;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
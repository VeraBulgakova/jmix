package com.company.offer.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "REINSURER")
@Entity
public class Reinsurer {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "PARTNER_NAME")
    private String partnerName;
    @JoinTable(name = "OFFER_REINSURER_LINK",
            joinColumns = @JoinColumn(name = "REINSURER_ID"),
            inverseJoinColumns = @JoinColumn(name = "OFFER_ID"))
    @ManyToMany
    private List<Offer> offers;

    public List<Offer> getOffers() {
        return offers;
    }

    public void setOffers(List<Offer> offers) {
        this.offers = offers;
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
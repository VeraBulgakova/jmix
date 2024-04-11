package com.company.offer.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "SIGNER", indexes = {
        @Index(name = "IDX_SIGNER_OFFER", columnList = "")
})
@Entity
public class Signer {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "FULLNAME")
    private String fullname;

    @OneToMany(mappedBy = "nameOfSignerFromPartner")
    private List<Offer> offer;

    public void setOffer(List<Offer> offer) {
        this.offer = offer;
    }

    public List<Offer> getOffer() {
        return offer;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
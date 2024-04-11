package com.company.offer.entity;

import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "OFFER", indexes = {
        @Index(name = "IDX_OFFER_PARTNER", columnList = "PARTNER_ID"),
        @Index(name = "IDX_OFFER_INSURANT", columnList = "INSURANT_ID"),
        @Index(name = "IDX_OFFER_NAME_OF_SIGNER_FROM_PARTNER", columnList = "NAME_OF_SIGNER_FROM_PARTNER_ID"),
        @Index(name = "IDX_OFFER_", columnList = ""),
        @Index(name = "IDX_OFFER_REINSURER_TYPE", columnList = "REINSURER_TYPE_ID"),
        @Index(name = "IDX_OFFER_POOL_OF_REINSURERS", columnList = "POOL_OF_REINSURERS_ID"),
        @Index(name = "IDX_OFFER_PRIMARY_INSURANT", columnList = "")
})
@Entity
public class Offer {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "NUMBER_CONTRACT")
    private String numberContract;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "PARTNER_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Partner partner;

    @JoinColumn(name = "INSURANT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Insurant insurant;

    @Column(name = "CONTRACT_FORM")
    private String contractForm;

    @Column(name = "MISS_DUPLICATE_MESSAGE_FOR_NUMBER_CONTRACT")
    private Boolean missDuplicateMessageForNumberContract;

    @NotNull
    @Column(name = "CONTRACT_TYPE", nullable = false)
    private String contractType;

    @Column(name = "OPTIONAL_ATTRIBUTE")
    private Boolean optionalAttribute;

    @Column(name = "GENERAL_CONTRACT_WITH_DECLARATIONS")
    private Boolean generalContractWithDeclarations;

    @Column(name = "ACCOUNT_BY_REINSURERS")
    private Boolean accountByReinsurers;

    @JoinColumn(name = "CONTRACT_SUBTYPE_ID", nullable = false)
    @NotNull
    @ManyToOne(optional = false)
    private ContractSubtype contractSubtype;

    @JoinColumn(name = "COVERAGE_CLASS_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private CoverageClass coverageClass;

    @NotNull
    @Column(name = "OBLIG_CESSION", nullable = false)
    private Boolean obligCession = false;

    @NotNull
    @Column(name = "OBLIG_CESSION_PRECENT", nullable = false)
    private Boolean obligCessionPrecent = false;

    @NotNull
    @Column(name = "IS_LIST_OF_REINSURERS", nullable = false)
    private Boolean isListOfReinsurers = false;

    @JoinTable(name = "OFFER_REINSURER_LINK",
            joinColumns = @JoinColumn(name = "OFFER_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "REINSURER_ID", referencedColumnName = "ID"))
    @ManyToMany
    private List<Reinsurer> reinsurer;

    @JoinColumn(name = "REINSURER_TYPE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private ReinsurerType reinsurerType;

    @JoinColumn(name = "POOL_OF_REINSURERS_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private PoolOfReinsurers poolOfReinsurers;

    @NotNull
    @Column(name = "BORDEURO_CALCULATIONS", nullable = false)
    private Boolean bordeuroCalculations = false;

    @NotNull
    @Column(name = "SHARE_", nullable = false)
    private Integer share;

    @Column(name = "RETROCESSION")
    private Boolean retrocession;

    @Column(name = "START_DATE_INSURANCE", nullable = false)
    private @NotNull LocalDate startDateInsurance;

    @NotNull
    @Column(name = "END_DATE_INSURANCE", nullable = false)
    private LocalDate endDateInsurance;

    @Column(name = "PERIOD_INSURANCE", precision = 19)
    private BigInteger periodInsurance;

    @NotNull
    @Column(name = "START_DATE_REINSURANCE", nullable = false)
    private LocalDate startDateReinsurance;

    @NotNull
    @Column(name = "END_DATE_REINSURANCE", nullable = false)
    private LocalDate endDateReinsurance;

    @Column(name = "PERIOD_REINSURANCE", precision = 19)
    private BigInteger periodReinsurance;

    @NotNull
    @Column(name = "EMAIL_CONTACT", nullable = false)
    private String emailContact;

    @Column(name = "EMAIL_REINSURER")
    private String emailReinsurer;

    @Column(name = "SIGNING_FORM")
    private String signingForm;

    @JoinColumn(name = "NAME_OF_SIGNER_FROM_PARTNER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Signer nameOfSignerFromPartner;

    @JoinColumn(name = "PRIMARY_INSURANT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private PrimaryInsurant primaryInsurant;

    public PrimaryInsurant getPrimaryInsurant() {
        return primaryInsurant;
    }

    public void setPrimaryInsurant(PrimaryInsurant primaryInsurant) {
        this.primaryInsurant = primaryInsurant;
    }

    public PoolOfReinsurers getPoolOfReinsurers() {
        return poolOfReinsurers;
    }

    public void setPoolOfReinsurers(PoolOfReinsurers poolOfReinsurers) {
        this.poolOfReinsurers = poolOfReinsurers;
    }

    public ReinsurerType getReinsurerType() {
        return reinsurerType;
    }

    public void setReinsurerType(ReinsurerType reinsurerType) {
        this.reinsurerType = reinsurerType;
    }

    public void setCoverageClass(CoverageClass coverageClass) {
        this.coverageClass = coverageClass;
    }

    public CoverageClass getCoverageClass() {
        return coverageClass;
    }

    public void setContractSubtype(ContractSubtype contractSubtype) {
        this.contractSubtype = contractSubtype;
    }

    public ContractSubtype getContractSubtype() {
        return contractSubtype;
    }

    public void setReinsurer(List<Reinsurer> reinsurer) {
        this.reinsurer = reinsurer;
    }

    public List<Reinsurer> getReinsurer() {
        return reinsurer;
    }

    public void setEndDateReinsurance(LocalDate endDateReinsurance) {
        this.endDateReinsurance = endDateReinsurance;
    }

    public LocalDate getEndDateReinsurance() {
        return endDateReinsurance;
    }

    public void setStartDateReinsurance(LocalDate startDateReinsurance) {
        this.startDateReinsurance = startDateReinsurance;
    }

    public LocalDate getStartDateReinsurance() {
        return startDateReinsurance;
    }

    public void setEndDateInsurance(LocalDate endDateInsurance) {
        this.endDateInsurance = endDateInsurance;
    }

    public LocalDate getEndDateInsurance() {
        return endDateInsurance;
    }

    public SigningForm getSigningForm() {
        return signingForm == null ? null : SigningForm.fromId(signingForm);
    }

    public void setSigningForm(SigningForm signingForm) {
        this.signingForm = signingForm == null ? null : signingForm.getId();
    }

    public Signer getNameOfSignerFromPartner() {
        return nameOfSignerFromPartner;
    }

    public void setNameOfSignerFromPartner(Signer nameOfSignerFromPartner) {
        this.nameOfSignerFromPartner = nameOfSignerFromPartner;
    }

    public String getEmailReinsurer() {
        return emailReinsurer;
    }

    public void setEmailReinsurer(String emailReinsurer) {
        this.emailReinsurer = emailReinsurer;
    }

    public String getEmailContact() {
        return emailContact;
    }

    public void setEmailContact(String emailContact) {
        this.emailContact = emailContact;
    }

    public BigInteger getPeriodReinsurance() {
        return periodReinsurance;
    }

    public BigInteger getPeriodInsurance() {
        return periodInsurance;
    }

    public @NotNull LocalDate getStartDateInsurance() {
        return startDateInsurance;
    }

    public void setStartDateInsurance(@NotNull LocalDate startDateInsurance) {
        this.startDateInsurance = startDateInsurance;
    }

    public Boolean getRetrocession() {
        return retrocession;
    }

    public void setRetrocession(Boolean retrocession) {
        this.retrocession = retrocession;
    }

    public Integer getShare() {
        return share;
    }

    public void setShare(Integer share) {
        this.share = share;
    }

    public Boolean getBordeuroCalculations() {
        return bordeuroCalculations;
    }

    public void setBordeuroCalculations(Boolean bordeuroCalculations) {
        this.bordeuroCalculations = bordeuroCalculations;
    }

    public Boolean getIsListOfReinsurers() {
        return isListOfReinsurers;
    }

    public void setIsListOfReinsurers(Boolean isListOfReinsurers) {
        this.isListOfReinsurers = isListOfReinsurers;
    }

    public Boolean getObligCessionPrecent() {
        return obligCessionPrecent;
    }

    public void setObligCessionPrecent(Boolean obligCessionPrecent) {
        this.obligCessionPrecent = obligCessionPrecent;
    }

    public Boolean getObligCession() {
        return obligCession;
    }

    public void setObligCession(Boolean obligCession) {
        this.obligCession = obligCession;
    }

    public Boolean getAccountByReinsurers() {
        return accountByReinsurers;
    }

    public void setAccountByReinsurers(Boolean accountByReinsurers) {
        this.accountByReinsurers = accountByReinsurers;
    }

    public Boolean getGeneralContractWithDeclarations() {
        return generalContractWithDeclarations;
    }

    public void setGeneralContractWithDeclarations(Boolean generalContractWithDeclarations) {
        this.generalContractWithDeclarations = generalContractWithDeclarations;
    }

    public Boolean getOptionalAttribute() {
        return optionalAttribute;
    }

    public void setOptionalAttribute(Boolean optionalAttribute) {
        this.optionalAttribute = optionalAttribute;
    }

    public ContractType getContractType() {
        return contractType == null ? null : ContractType.fromId(contractType);
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType == null ? null : contractType.getId();
    }

    public Boolean getMissDuplicateMessageForNumberContract() {
        return missDuplicateMessageForNumberContract;
    }

    public void setMissDuplicateMessageForNumberContract(Boolean missDuplicateMessageForNumberContract) {
        this.missDuplicateMessageForNumberContract = missDuplicateMessageForNumberContract;
    }

    public String getContractForm() {
        return contractForm;
    }

    public Insurant getInsurant() {
        return insurant;
    }

    public Partner getPartner() {
        return partner;
    }

    public void setPartner(Partner partner) {
        this.partner = partner;
    }

    public String getNumberContract() {
        return numberContract;
    }

    public void setNumberContract(String numberContract) {
        this.numberContract = numberContract;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
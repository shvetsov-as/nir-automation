package com.niimto.automation.entity.publicationplan.publicaton;

import com.niimto.automation.entity.classifier.document.DocStatus;
import com.niimto.automation.entity.publicationplan.plan.PublicationPlan;
import com.sun.istack.NotNull;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "publications")
public class Publication {

    @Id
    @Column(name = "publication_id", nullable = false)
    @NotNull
    private UUID publicationsId;

    @Column(name = "publication_status", nullable = false)
    @NotNull
    @Enumerated(EnumType.STRING)
    private DocStatus docStatus;

    @Column(name = "publication_name", nullable = false)
    @NotNull
    private String name;

    @Column(name = "publication_about")
    private String about;

    @Column(name = "publication_lead")
    private String lead;

    @Column(name = "publication_participant")
    private String participant;

    @Column(name = "publication_date_to", nullable = false)
    @Temporal(TemporalType.DATE)
    @NotNull
    private Date dateTo;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "publication_plans_publication_plan_id", referencedColumnName = "publication_plan_id")
    private PublicationPlan publicationPlan;

    public Publication() {
    }

    public UUID getPublicationsId() {
        return publicationsId;
    }

    public void setPublicationsId(UUID publicationsId) {
        this.publicationsId = publicationsId;
    }

    public DocStatus getDocStatus() {
        return docStatus;
    }

    public void setDocStatus(DocStatus docStatus) {
        this.docStatus = docStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getLead() {
        return lead;
    }

    public void setLead(String lead) {
        this.lead = lead;
    }

    public String getParticipant() {
        return participant;
    }

    public void setParticipant(String participant) {
        this.participant = participant;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public PublicationPlan getPublicationPlan() {
        return publicationPlan;
    }

    public void setPublicationPlan(PublicationPlan publicationPlan) {
        this.publicationPlan = publicationPlan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Publication)) return false;

        Publication that = (Publication) o;

        if (!getPublicationsId().equals(that.getPublicationsId())) return false;
        return getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        int result = getPublicationsId().hashCode();
        result = 31 * result + getName().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Publication{" +
                "docStatus=" + docStatus +
                ", name='" + name + '\'' +
                ", about='" + about + '\'' +
                ", lead='" + lead + '\'' +
                ", participant='" + participant + '\'' +
                ", dateTo=" + dateTo +
                '}';
    }

}

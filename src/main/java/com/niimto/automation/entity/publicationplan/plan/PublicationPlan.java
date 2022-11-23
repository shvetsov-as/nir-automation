package com.niimto.automation.entity.publicationplan.plan;

import com.niimto.automation.entity.classifier.document.DocStatus;
import com.niimto.automation.entity.publicationplan.publicaton.Publication;
import com.sun.istack.NotNull;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "publication_plans")
public class PublicationPlan {

    @Id
    @Column(name = "publication_plan_id", nullable = false)
    @NotNull
    private UUID publicationPlanId;

    @Column(name = "publication_plan_status", nullable = false)
    @NotNull
    @Enumerated(EnumType.STRING)
    private DocStatus docStatus;

    @Column(name = "publication_plan_name", nullable = false, unique = true)
    @NotNull
    private String name;

    @Column(name = "publication_plan_note")
    private String note;

    @Column(name = "publication_plan_creation_date", nullable = false)
    @Temporal(TemporalType.DATE)
    @NotNull
    private Date dateOfCreation;

    @OneToMany(mappedBy = "publicationPlan",fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List <Publication> publicationList = new ArrayList<>();

    public PublicationPlan() {
    }

    public UUID getPublicationPlanId() {
        return publicationPlanId;
    }

    public void setPublicationPlanId(UUID publicationPlanId) {
        this.publicationPlanId = publicationPlanId;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public List<Publication> getPublicationList() {
        return publicationList;
    }

    public void setPublicationList(List<Publication> publicationList) {
        this.publicationList = publicationList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PublicationPlan)) return false;

        PublicationPlan that = (PublicationPlan) o;

        if (!getPublicationPlanId().equals(that.getPublicationPlanId())) return false;
        return getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        int result = getPublicationPlanId().hashCode();
        result = 31 * result + getName().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "PublicationPlan{" +
                "publicationPlanId=" + publicationPlanId +
                ", docStatus=" + docStatus +
                ", name='" + name + '\'' +
                ", note='" + note + '\'' +
                ", dateOfCreation=" + dateOfCreation +
                '}';
    }
}

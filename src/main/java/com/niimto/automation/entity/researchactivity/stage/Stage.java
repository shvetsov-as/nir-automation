package com.niimto.automation.entity.researchactivity.stage;


import com.niimto.automation.entity.researchactivity.research.Research;
import com.sun.istack.NotNull;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "stages")
public class Stage {

    @Id
    @Column(name = "stage_id", nullable = false)
    @NotNull
    private UUID stageId;

    @Column(name = "stage_date_from", nullable = false)
    @Temporal(TemporalType.DATE)
    @NotNull
    private Date dateFrom;

    @Column(name = "stage_date_to", nullable = false)
    @Temporal(TemporalType.DATE)
    @NotNull
    private Date dateTo;

    @Column(name = "stage_number", nullable = false)
    @NotNull
    private String number;

    @Column(name = "stage_about", nullable = false)
    @NotNull
    private String about;

    @Column(name = "stage_act")
    private String act;

    @Column(name = "stage_out_document")
    private String outDocument;

    @Column(name = "stage_report")
    private String report;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "researches_research_id", referencedColumnName = "research_id")
    private Research research;

    public Stage() {
    }

    public UUID getStageId() {
        return stageId;
    }

    public void setStageId(UUID stageId) {
        this.stageId = stageId;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getAct() {
        return act;
    }

    public void setAct(String act) {
        this.act = act;
    }

    public String getOutDocument() {
        return outDocument;
    }

    public void setOutDocument(String outDocument) {
        this.outDocument = outDocument;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public Research getResearch() {
        return research;
    }

    public void setResearch(Research research) {
        this.research = research;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stage)) return false;

        Stage stage = (Stage) o;

        if (!getStageId().equals(stage.getStageId())) return false;
        return getAbout().equals(stage.getAbout());
    }

    @Override
    public int hashCode() {
        int result = getStageId().hashCode();
        result = 31 * result + getAbout().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Stage{" +
                "dateFrom=" + dateFrom +
                ", dateTo=" + dateTo +
                ", number='" + number + '\'' +
                ", about='" + about + '\'' +
                ", act='" + act + '\'' +
                ", outDocument='" + outDocument + '\'' +
                ", report='" + report + '\'' +
                '}';
    }
}

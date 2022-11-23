package com.niimto.automation.entity.guideline;

import com.niimto.automation.entity.classifier.document.GuideDocType;
import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.UUID;

@Entity
@Table (name = "guidelines")
public class Guideline {

    @Id
    @Column(name = "guideline_id", nullable = false)
    @NotNull
    private UUID guidelineId;

    @Column(name = "guideline_doctype", nullable = false)
    @NotNull
    @Enumerated(EnumType.STRING)
    private GuideDocType docType;

    @Column(name = "guideline_name", nullable = false)
    @NotNull
    private String name;

    @Column(name = "guideline_author", nullable = false)
    @NotNull
    private String author;

    @Column(name = "guideline_from", nullable = false)
    @NotNull
    private String from;

    @Column(name = "guideline_event")
    private String event;

    @Column(name = "guideline_date", nullable = false)
    @Temporal(TemporalType.DATE)
    @NotNull
    private Date date;

    @Column(name = "guideline_file_path", nullable = false)
    @NotNull
    private String path;

    public Guideline() {
    }

    public UUID getGuidelineId() {
        return guidelineId;
    }

    public void setGuidelineId(UUID guidelineId) {
        this.guidelineId = guidelineId;
    }

    public GuideDocType getDocType() {
        return docType;
    }

    public void setDocType(GuideDocType docType) {
        this.docType = docType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Guideline)) return false;

        Guideline guideline = (Guideline) o;

        if (!getGuidelineId().equals(guideline.getGuidelineId())) return false;
        return getName().equals(guideline.getName());
    }

    @Override
    public int hashCode() {
        int result = getGuidelineId().hashCode();
        result = 31 * result + getName().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Guideline{" +
                "docType=" + docType +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", from='" + from + '\'' +
                ", event='" + event + '\'' +
                ", date=" + date +
                '}';
    }
}

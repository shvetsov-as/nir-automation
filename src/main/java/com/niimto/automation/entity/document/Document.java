package com.niimto.automation.entity.document;

import com.niimto.automation.entity.classifier.document.EmployeeDocType;
import com.niimto.automation.entity.user.User;
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
@Table(name = "documents")
public class Document {

    @Id
    @Column(name = "document_id", nullable = false)
    @NotNull
    private UUID documentId;

    @Column(name = "document_type", nullable = false)
    @NotNull
    @Enumerated(EnumType.STRING)
    private EmployeeDocType docType;

    @Column(name = "document_creation_date", nullable = false)
    @Temporal(TemporalType.DATE)
    @NotNull
    private Date dateOfCreation;

    @Column(name = "document_name", nullable = false)
    @NotNull
    private String name;

    @Column(name = "document_about")
    private String about;

    @Column(name = "document_note")
    private String note;

    @Column(name = "document_file_path", nullable = false)
    @NotNull
    private String path;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "users_user_id", referencedColumnName = "user_id")
    private User user;

    public Document() {
    }

    public UUID getDocumentId() {
        return documentId;
    }

    public void setDocumentId(UUID documentId) {
        this.documentId = documentId;
    }

    public EmployeeDocType getDocType() {
        return docType;
    }

    public void setDocType(EmployeeDocType docType) {
        this.docType = docType;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Document)) return false;

        Document document = (Document) o;

        if (!documentId.equals(document.documentId)) return false;
        return name.equals(document.name);
    }

    @Override
    public int hashCode() {
        int result = documentId.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Document{" +
                "docType=" + docType +
                ", dateOfCreation=" + dateOfCreation +
                ", name='" + name + '\'' +
                ", about='" + about + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}

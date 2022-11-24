package com.niimto.automation.entity.personalplan.plan;

import com.niimto.automation.entity.classifier.document.DocStatus;
import com.niimto.automation.entity.personalplan.task.PersonalTask;
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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "personal_plans")
public class PersonalPlan {

    @Id
    @Column(name = "personal_plan_id", nullable = false)
    @NotNull
    private UUID personalPlanId;

    @Column(name = "personal_plan_status", nullable = false)
    @NotNull
    @Enumerated(EnumType.STRING)
    private DocStatus docStatus;

    @Column(name = "personal_plan_name", nullable = false, unique = true)
    @NotNull
    private String name;

    @Column(name = "personal_plan_note")
    private String note;

    @Column(name = "personal_plan_todo")
    private String todo;

    @Column(name = "personal_plan_creation_date", nullable = false)
    @Temporal(TemporalType.DATE)
    @NotNull
    private Date dateOfCreation;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "users_user_id", referencedColumnName = "user_id")
    private User user;

    @OneToMany(mappedBy = "personalPlan",fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PersonalTask> personalTaskList = new ArrayList<>();

    public PersonalPlan() {
    }

    public UUID getPersonalPlanId() {
        return personalPlanId;
    }

    public void setPersonalPlanId(UUID personalPlanId) {
        this.personalPlanId = personalPlanId;
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

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<PersonalTask> getPersonalTaskList() {
        return personalTaskList;
    }

    public void setPersonalTaskList(List<PersonalTask> personalTaskList) {
        this.personalTaskList = personalTaskList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonalPlan)) return false;

        PersonalPlan that = (PersonalPlan) o;

        if (!getPersonalPlanId().equals(that.getPersonalPlanId())) return false;
        return getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        int result = getPersonalPlanId().hashCode();
        result = 31 * result + getName().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "PersonalPlan{" +
                "docStatus=" + docStatus +
                ", name='" + name + '\'' +
                ", note='" + note + '\'' +
                ", todo='" + todo + '\'' +
                ", dateOfCreation=" + dateOfCreation +
                '}';
    }
}

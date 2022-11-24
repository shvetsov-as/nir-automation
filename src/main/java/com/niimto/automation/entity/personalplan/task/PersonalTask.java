package com.niimto.automation.entity.personalplan.task;


import com.niimto.automation.entity.classifier.document.DocStatus;
import com.niimto.automation.entity.classifier.document.EmployeeDocType;
import com.niimto.automation.entity.classifier.document.TaskType;
import com.niimto.automation.entity.personalplan.plan.PersonalPlan;
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
@Table(name = "personal_tasks")
public class PersonalTask {

    @Id
    @Column(name = "personal_task_id", nullable = false)
    @NotNull
    private UUID personalTaskId;

    @Column(name = "personal_task_status", nullable = false)
    @NotNull
    @Enumerated(EnumType.STRING)
    private DocStatus taskStatus;

    @Column(name = "personal_task_document_type", nullable = false)
    @NotNull
    @Enumerated(EnumType.STRING)
    private EmployeeDocType docType;

    @Column(name = "personal_task_type", nullable = false)
    @NotNull
    @Enumerated(EnumType.STRING)
    private TaskType taskType;

    @Column(name = "personal_task_date_from", nullable = false)
    @Temporal(TemporalType.DATE)
    @NotNull
    private Date dateFrom;

    @Column(name = "personal_task_date_to", nullable = false)
    @Temporal(TemporalType.DATE)
    @NotNull
    private Date dateTo;

    @Column(name = "personal_task_name", nullable = false)
    @NotNull
    private String name;

    @Column(name = "personal_task_todo")
    private String todo;

    @Column(name = "personal_task_note")
    private String note;

    @Column(name = "personal_task_file_path", nullable = false)
    @NotNull
    private String path;

    @Column(name = "personal_task_point")
    private Integer point;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "personal_plans_personal_plan_id", referencedColumnName = "personal_plan_id")
    private PersonalPlan personalPlan;

    public PersonalTask() {
    }

    public UUID getPersonalTaskId() {
        return personalTaskId;
    }

    public void setPersonalTaskId(UUID personalTaskId) {
        this.personalTaskId = personalTaskId;
    }

    public DocStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(DocStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    public EmployeeDocType getDocType() {
        return docType;
    }

    public void setDocType(EmployeeDocType docType) {
        this.docType = docType;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
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

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public PersonalPlan getPersonalPlan() {
        return personalPlan;
    }

    public void setPersonalPlan(PersonalPlan personalPlan) {
        this.personalPlan = personalPlan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonalTask)) return false;

        PersonalTask that = (PersonalTask) o;

        if (!getPersonalTaskId().equals(that.getPersonalTaskId())) return false;
        return getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        int result = getPersonalTaskId().hashCode();
        result = 31 * result + getName().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "PersonalTask{" +
                "taskStatus=" + taskStatus +
                ", docType=" + docType +
                ", taskType=" + taskType +
                ", dateFrom=" + dateFrom +
                ", dateTo=" + dateTo +
                ", name='" + name + '\'' +
                ", todo='" + todo + '\'' +
                ", note='" + note + '\'' +
                ", point=" + point +
                '}';
    }
}

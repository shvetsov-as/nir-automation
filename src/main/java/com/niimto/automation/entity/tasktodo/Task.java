package com.niimto.automation.entity.tasktodo;


import com.niimto.automation.entity.classifier.document.DocStatus;
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
@Table(name = "tasks")
public class Task {

    @Id
    @Column(name = "task_id", nullable = false)
    @NotNull
    private UUID taskId;

    @Column(name = "task_status", nullable = false)
    @NotNull
    @Enumerated(EnumType.STRING)
    private DocStatus taskStatus;

    @Column(name = "task_date_from", nullable = false)
    @Temporal(TemporalType.DATE)
    @NotNull
    private Date dateFrom;

    @Column(name = "task_date_to", nullable = false)
    @Temporal(TemporalType.DATE)
    @NotNull
    private Date dateTo;

    @Column(name = "task_name", nullable = false)
    @NotNull
    private String name;

    @Column(name = "task_todo")
    private String todo;

    @Column(name = "task_note")
    private String note;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "users_user_id", referencedColumnName = "user_id")
    private User user;

    public Task() {
    }

    public UUID getTaskId() {
        return taskId;
    }

    public void setTaskId(UUID taskId) {
        this.taskId = taskId;
    }

    public DocStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(DocStatus taskStatus) {
        this.taskStatus = taskStatus;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;

        Task task = (Task) o;

        if (!getTaskId().equals(task.getTaskId())) return false;
        return getName().equals(task.getName());
    }

    @Override
    public int hashCode() {
        int result = getTaskId().hashCode();
        result = 31 * result + getName().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskStatus=" + taskStatus +
                ", dateFrom=" + dateFrom +
                ", dateTo=" + dateTo +
                ", name='" + name + '\'' +
                ", todo='" + todo + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}

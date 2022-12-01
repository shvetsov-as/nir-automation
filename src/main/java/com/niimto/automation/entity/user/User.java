package com.niimto.automation.entity.user;

import com.niimto.automation.entity.classifier.position.EmployeeDepartment;
import com.niimto.automation.entity.classifier.position.EmployeePosition;
import com.niimto.automation.entity.classifier.security.UserRole;
import com.niimto.automation.entity.classifier.security.UserStatus;
import com.niimto.automation.entity.document.Document;
import com.niimto.automation.entity.employee.Employee;
import com.niimto.automation.entity.personalplan.plan.PersonalPlan;
import com.niimto.automation.entity.publicationplan.plan.PublicationPlan;
import com.niimto.automation.entity.researchactivity.group.Group;
import com.niimto.automation.entity.tasktodo.Task;
import com.sun.istack.NotNull;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "user_id", nullable = false)
    @NotNull
    private UUID userId;

    @Column(name = "user_role", nullable = false)
    @NotNull
    @Enumerated(EnumType.STRING)
    private UserRole userRole;

    @Column(name = "user_status", nullable = false)
    @NotNull
    @Enumerated(EnumType.STRING)
    private UserStatus userStatus;

    @Column(name = "user_department", nullable = false)
    @NotNull
    @Enumerated(EnumType.STRING)
    private EmployeeDepartment department;

    @Column(name = "user_position", nullable = false)
    @NotNull
    @Enumerated(EnumType.STRING)
    private EmployeePosition position;

    @Column(name = "user_login", nullable = false, unique = true)
    @NotNull
    private String login;

    @Column(name = "user_passwd", nullable = false)
    @NotNull
    private String password;

    @Column(name = "user_appointment_date", nullable = false)
    @Temporal(TemporalType.DATE)
    @NotNull
    private Date appointmentDate;

    @Column(name = "user_surname", nullable = false)
    @NotNull
    private String surname;

    @Column(name = "user_name", nullable = false)
    @NotNull
    private String name;

    @Column(name = "user_patronymic")
    private String patronymic;

    @Column(name = "user_photo_path")
    private String photoPath;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private Employee employee;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private PublicationPlan publicationPlan;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private PersonalPlan personalPlan;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Document> documentList = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Task> taskList = new ArrayList<>();

    @ManyToMany(mappedBy = "users", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Group> groups = new LinkedHashSet<>();

    public User() {
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public UserStatus getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus;
    }

    public EmployeeDepartment getDepartment() {
        return department;
    }

    public void setDepartment(EmployeeDepartment department) {
        this.department = department;
    }

    public EmployeePosition getPosition() {
        return position;
    }

    public void setPosition(EmployeePosition position) {
        this.position = position;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public PublicationPlan getPublicationPlan() {
        return publicationPlan;
    }

    public void setPublicationPlan(PublicationPlan publicationPlan) {
        this.publicationPlan = publicationPlan;
    }

    public PersonalPlan getPersonalPlan() {
        return personalPlan;
    }

    public void setPersonalPlan(PersonalPlan personalPlan) {
        this.personalPlan = personalPlan;
    }

    public List<Document> getDocumentList() {
        return documentList;
    }

    public void setDocumentList(List<Document> documentList) {
        this.documentList = documentList;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    public Set<Group> getGroups() {
        return groups;
    }

    public void setGroups(Set<Group> groups) {
        this.groups = groups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (!getLogin().equals(user.getLogin())) return false;
        if (!getSurname().equals(user.getSurname())) return false;
        return getName().equals(user.getName());
    }

    @Override
    public int hashCode() {
        int result = getLogin().hashCode();
        result = 31 * result + getSurname().hashCode();
        result = 31 * result + getName().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userRole=" + userRole +
                ", userStatus=" + userStatus +
                ", department=" + department +
                ", position=" + position +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", appointmentDate=" + appointmentDate +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", photoPath='" + photoPath + '\'' +
                '}';
    }
}

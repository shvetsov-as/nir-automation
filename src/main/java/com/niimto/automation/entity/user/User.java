package com.niimto.automation.entity.user;

import com.niimto.automation.entity.classifier.position.EmployeePosition;
import com.niimto.automation.entity.classifier.security.UserRole;
import com.niimto.automation.entity.classifier.security.UserStatus;
import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
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

    @Column(name = "user_position", nullable = false)
    @NotNull
    @Enumerated(EnumType.STRING)
    private EmployeePosition position;

    @Column(name = "user_login", nullable = false, unique = true)
    @NotNull
    private String userLogin;

    @Column(name = "user_passwd", nullable = false)
    @NotNull
    private String userPasswd;

    @Column(name = "user_appointment_date", nullable = false)
    @NotNull
    private Date appointmentDate;

    @Column(name = "user_surname", nullable = false)
    @NotNull
    private String surname;

    @Column(name = "user_name", nullable = false)
    @NotNull
    private String name;

    @Column(name = "user_patronymic", nullable = false)
    @NotNull
    private String patronymic;

    public User() {
    }

    public User(UserRole userRole,
                UserStatus userStatus,
                EmployeePosition position,
                String userLogin,
                String userPasswd,
                Date appointmentDate,
                String surname,
                String name,
                String patronymic) {

        this.userRole = userRole;
        this.userStatus = userStatus;
        this.position = position;
        this.userLogin = userLogin;
        this.userPasswd = userPasswd;
        this.appointmentDate = appointmentDate;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
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

    public EmployeePosition getPosition() {
        return position;
    }

    public void setPosition(EmployeePosition position) {
        this.position = position;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserPasswd() {
        return userPasswd;
    }

    public void setUserPasswd(String userPasswd) {
        this.userPasswd = userPasswd;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (!getUserId().equals(user.getUserId())) return false;
        return getUserLogin().equals(user.getUserLogin());
    }

    @Override
    public int hashCode() {
        int result = getUserId().hashCode();
        result = 31 * result + getUserLogin().hashCode();
        return result;
    }
}

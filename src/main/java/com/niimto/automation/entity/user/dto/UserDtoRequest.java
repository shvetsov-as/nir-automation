package com.niimto.automation.entity.user.dto;

import com.niimto.automation.entity.classifier.position.EmployeeDepartment;
import com.niimto.automation.entity.classifier.position.EmployeePosition;
import com.niimto.automation.entity.classifier.security.UserRole;
import com.niimto.automation.entity.classifier.security.UserStatus;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.UUID;


public class UserDtoRequest {

    private UUID userId;
    private UserRole userRole;
    private UserStatus userStatus;
    private EmployeeDepartment department;
    private EmployeePosition position;
    private String login;
    private String password;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date appointmentDate;
    private String surname;
    private String name;
    private String patronymic;
    private String photoPath;

    public UserDtoRequest() {
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

    @Override
    public String toString() {
        return "UserDtoRequest{" +
                "userRole=" + userRole +
                ", userStatus=" + userStatus +
                ", department=" + department +
                ", position=" + position +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", appointmentDate=" + appointmentDate +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }
}

package com.niimto.automation.entity.employee;

import com.niimto.automation.entity.classifier.absence.EmployeeStatus;
import com.niimto.automation.entity.classifier.education.EmployeeDegree;
import com.niimto.automation.entity.classifier.education.EmployeeEducation;
import com.niimto.automation.entity.classifier.education.EmployeeQualification;
import com.niimto.automation.entity.classifier.education.EmployeeTitle;
import com.niimto.automation.entity.classifier.position.EmployeeRank;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @Column(name = "employee_id", nullable = false)
    @NotNull
    private UUID employeeId;

    @Column(name = "employee_education", nullable = false)
    @NotNull
    @Enumerated(EnumType.STRING)
    private EmployeeEducation education;

    @Column(name = "employee_qualification", nullable = false)
    @NotNull
    @Enumerated(EnumType.STRING)
    private EmployeeQualification qualification;

    @Column(name = "employee_degree", nullable = false)
    @NotNull
    @Enumerated(EnumType.STRING)
    private EmployeeDegree degree;

    @Column(name = "employee_education_title", nullable = false)
    @NotNull
    @Enumerated(EnumType.STRING)
    private EmployeeTitle title;

    @Column(name = "employee_rank", nullable = false)
    @NotNull
    @Enumerated(EnumType.STRING)
    private EmployeeRank rank;

    @Column(name = "employee_absence", nullable = false)
    @NotNull
    @Enumerated(EnumType.STRING)
    private EmployeeStatus employeeAbsenceStatus;

    @Column(name = "employee_date_of_bday", nullable = false)
    @Temporal(TemporalType.DATE)
    @NotNull
    private Date birthdayDate;

    @Column(name = "employee_citizenship", nullable = false)
    @NotNull
    private String citizenship;

    @Column(name = "employee_registration", nullable = false)
    @NotNull
    private String registration;

    @Column(name = "employee_specialization", nullable = false)
    @NotNull
    private String specialization;

    @Column(name = "employee_graduation_date", nullable = false)
    @Temporal(TemporalType.DATE)
    @NotNull
    private Date graduationDate;

    @Column(name = "employee_graduated_from", nullable = false)
    @NotNull
    private String graduatedFrom;

    @Column(name = "employee_cabinet")
    private String cabinetNum;

    @Column(name = "employee_telephone")
    private String telephoneNum;

    @Column(name = "employee_stamp")
    private String stampNum;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "users_user_id", referencedColumnName = "user_id")
    private User user;

    public Employee() {
    }

    public Employee(EmployeeEducation education,
                    EmployeeQualification qualification,
                    EmployeeDegree degree,
                    EmployeeTitle title,
                    EmployeeRank rank,
                    EmployeeStatus employeeAbsenceStatus,
                    Date birthdayDate,
                    String citizenship,
                    String registration,
                    String specialization,
                    Date graduationDate,
                    String graduatedFrom,
                    String cabinetNum,
                    String telephoneNum,
                    String stampNum) {
        this.education = education;
        this.qualification = qualification;
        this.degree = degree;
        this.title = title;
        this.rank = rank;
        this.employeeAbsenceStatus = employeeAbsenceStatus;
        this.birthdayDate = birthdayDate;
        this.citizenship = citizenship;
        this.registration = registration;
        this.specialization = specialization;
        this.graduationDate = graduationDate;
        this.graduatedFrom = graduatedFrom;
        this.cabinetNum = cabinetNum;
        this.telephoneNum = telephoneNum;
        this.stampNum = stampNum;
    }

    public UUID getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(UUID employeeId) {
        this.employeeId = employeeId;
    }

    public EmployeeEducation getEducation() {
        return education;
    }

    public void setEducation(EmployeeEducation education) {
        this.education = education;
    }

    public EmployeeQualification getQualification() {
        return qualification;
    }

    public void setQualification(EmployeeQualification qualification) {
        this.qualification = qualification;
    }

    public EmployeeDegree getDegree() {
        return degree;
    }

    public void setDegree(EmployeeDegree degree) {
        this.degree = degree;
    }

    public EmployeeTitle getTitle() {
        return title;
    }

    public void setTitle(EmployeeTitle title) {
        this.title = title;
    }

    public EmployeeRank getRank() {
        return rank;
    }

    public void setRank(EmployeeRank rank) {
        this.rank = rank;
    }

    public EmployeeStatus getEmployeeAbsenceStatus() {
        return employeeAbsenceStatus;
    }

    public void setEmployeeAbsenceStatus(EmployeeStatus employeeAbsenceStatus) {
        this.employeeAbsenceStatus = employeeAbsenceStatus;
    }

    public Date getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(Date birthday) {
        this.birthdayDate = birthday;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Date getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(Date graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduatedFrom() {
        return graduatedFrom;
    }

    public void setGraduatedFrom(String graduatedFrom) {
        this.graduatedFrom = graduatedFrom;
    }

    public String getCabinetNum() {
        return cabinetNum;
    }

    public void setCabinetNum(String cabinetNum) {
        this.cabinetNum = cabinetNum;
    }

    public String getTelephoneNum() {
        return telephoneNum;
    }

    public void setTelephoneNum(String telephoneNum) {
        this.telephoneNum = telephoneNum;
    }

    public String getStampNum() {
        return stampNum;
    }

    public void setStampNum(String stampNum) {
        this.stampNum = stampNum;
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
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (!getEmployeeId().equals(employee.getEmployeeId())) return false;
        return getBirthdayDate().equals(employee.getBirthdayDate());
    }

    @Override
    public int hashCode() {
        int result = getEmployeeId().hashCode();
        result = 31 * result + getBirthdayDate().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "education=" + education +
                ", qualification=" + qualification +
                ", degree=" + degree +
                ", title=" + title +
                ", rank=" + rank +
                ", employeeAbsenceStatus=" + employeeAbsenceStatus +
                ", birthday=" + birthdayDate +
                ", citizenship='" + citizenship + '\'' +
                ", registration='" + registration + '\'' +
                ", specialization='" + specialization + '\'' +
                ", graduationDate=" + graduationDate +
                ", graduatedFrom='" + graduatedFrom + '\'' +
                ", cabinetNum='" + cabinetNum + '\'' +
                ", telephoneNum='" + telephoneNum + '\'' +
                ", stampNum='" + stampNum + '\'' +
                '}';
    }

}

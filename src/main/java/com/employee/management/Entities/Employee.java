package com.employee.management.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

/**
 * @author Latitude
 * @project management
 * @created 16/10/2023-11:53 AM
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
    @Id
    @Column(name="employee_id")
    private Long employee_id;
    @Column(name="first_name")
    private String first_name;
    @Column(name="last_name")
    private String last_name;
    @Column(name="phone_number")
    private String  phone_number;
    @Column(name="office_extension")
    private String office_extension;
    @Column(name="address")
    private String address;
    @Column(name="emailId")
    private String  emailId;
    @Column(name="national_id")
    private String national_id;
    @Column(name="passport_number")
    private String passport_number;
    @Column(name="dob")
    private String dob;
    @Column(name="gender")
    private String gender;
    @Column(name="profession")
    private String profession;
    @Column(name="roles")
    private String roles;
    @Column(name="responsibilities")
    private String responsibilities;
    @Column(name="department")
    private String  department;
    @Column(name="reporting_manager")
    private String reporting_manager;
    @Column(name="employment_type")
    private String employment_type;
    @Column(name="joining_date")
    private String joining_date;
    @Column(name="basic_salary")
    private BigDecimal basic_salary;
    @Column(name="hra")
    private BigDecimal hra;
    @Column(name="over_time_pay")
    private BigDecimal over_time_pay;
    @Column(name="gross_salary")
    private BigDecimal gross_salary;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(getEmployee_id(), employee.getEmployee_id()) && Objects.equals(getFirst_name(), employee.getFirst_name()) && Objects.equals(getLast_name(), employee.getLast_name()) && Objects.equals(getPhone_number(), employee.getPhone_number()) && Objects.equals(getOffice_extension(), employee.getOffice_extension()) && Objects.equals(getAddress(), employee.getAddress()) && Objects.equals(getEmailId(), employee.getEmailId()) && Objects.equals(getNational_id(), employee.getNational_id()) && Objects.equals(getPassport_number(), employee.getPassport_number()) && Objects.equals(getDob(), employee.getDob()) && Objects.equals(getGender(), employee.getGender()) && Objects.equals(getProfession(), employee.getProfession()) && Objects.equals(getRoles(), employee.getRoles()) && Objects.equals(getResponsibilities(), employee.getResponsibilities()) && Objects.equals(getDepartment(), employee.getDepartment()) && Objects.equals(getReporting_manager(), employee.getReporting_manager()) && Objects.equals(getEmployment_type(), employee.getEmployment_type()) && Objects.equals(getJoining_date(), employee.getJoining_date()) && Objects.equals(getBasic_salary(), employee.getBasic_salary()) && Objects.equals(getHra(), employee.getHra()) && Objects.equals(getOver_time_pay(), employee.getOver_time_pay()) && Objects.equals(getGross_salary(), employee.getGross_salary());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmployee_id(), getFirst_name(), getLast_name(), getPhone_number(), getOffice_extension(), getAddress(), getEmailId(), getNational_id(), getPassport_number(), getDob(), getGender(), getProfession(), getRoles(), getResponsibilities(), getDepartment(), getReporting_manager(), getEmployment_type(), getJoining_date(), getBasic_salary(), getHra(), getOver_time_pay(), getGross_salary());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employee_id=" + employee_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", office_extension='" + office_extension + '\'' +
                ", address=" + address +
                ", emailId='" + emailId + '\'' +
                ", national_id='" + national_id + '\'' +
                ", passport_number='" + passport_number + '\'' +
                ", DOB=" + dob +
                ", gender='" + gender + '\'' +
                ", profession='" + profession + '\'' +
                ", roles='" + roles + '\'' +
                ", responsibilities='" + responsibilities + '\'' +
                ", department='" + department + '\'' +
                ", reporting_manager='" + reporting_manager + '\'' +
                ", employment_type='" + employment_type + '\'' +
                ", joining_date=" + joining_date +
                ", basic_salary=" + basic_salary +
                ", HRA=" + hra +
                ", over_time_pay=" + over_time_pay +
                ", gross_salary=" + gross_salary +
                '}';
    }
}

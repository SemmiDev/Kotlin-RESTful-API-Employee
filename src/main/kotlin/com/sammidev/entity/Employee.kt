package com.sammidev.entity

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "employee")
data class Employee (
        @Id
        @Column(name = "employee_id")
        var employeeId: String,
        @Column(name = "employee_number")
        var employeeNumber: String,
        @Column(name = "ssn")
        var employeeSocialSecurityNumber: String,
        @Column(name = "firstname")
        var employeeFirstName: String,
        @Column(name = "lastname")
        var employeeLastname: String,
        @Column(name = "address")
        var employeeAdress: String,
        @Column(name = "city")
        var employeeCity: String,
        @Column(name = "zip_code")
        var employeZipCode: Int,
        @Column(name = "department")
        var employeeDepartment: String,
        @Column(name = "account_number")
        var employeeBankAccountNumber: String,
        @Column(name = "salary")
        var employeeSalary: Long,
        @Column(name = "hourly")
        var employeeHourly: Int,
        @Column(name = "contract_amt")
        var employeeContractAmt: Int,
        @Column(name = "sex")
        var employeeGender: String,
        @Column(name = "status")
        var employeeStatus: String,
        @Column(name = "created_at")
        var createdAt: Date,
        @Column(name = "updated_at")
        var updatedAt: Date?
)
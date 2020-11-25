package com.sammidev.model

import java.util.*

data class EmployeeResponse(
        val employeeId: String?,
        val employeeNumber: String?,
        val employeeSocialSecurityNumber: String?,
        val employeeFirstName: String?,
        val employeeLastname: String?,
        val employeeAdress: String?,
        val employeeCity: String?,
        val employeZipCode: Int?,
        val employeeDepartment: String?,
        val employeeBankAccountNumber: String?,
        val employeeSalary: Long?,
        val employeeHourly: Int?,
        val employeeContractAmt: Int?,
        val employeeGender: String?,
        val employeeStatus: String?,
        val createdAt: Date,
        val updatedAt: Date?
)
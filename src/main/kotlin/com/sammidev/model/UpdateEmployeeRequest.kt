package com.sammidev.model

import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull


data class UpdateEmployeeRequest(
        @field:NotBlank
        val employeeNumber: String?,

        @field:NotBlank
        val employeeSocialSecurityNumber: String?,

        @field:NotBlank
        val employeeFirstName: String?,

        @field:NotBlank
        val employeeLastname: String?,

        @field:NotBlank
        val employeeCity: String?,

        @field:NotBlank
        val employeeAddress: String?,

        @field:NotNull
        @field:Min(value = 1)

        val employeZipCode: Int?,
        @field:NotBlank
        val employeeDepartment: String?,

        @field:NotBlank
        val employeeBankAccountNumber: String?,

        @field:NotNull
        @field:Min(value = 10_000_000)
        val employeeSalary: Long?,

        @field:NotNull
        @field:Max(value = 168)
        val employeeHourly: Int?,

        @field:NotNull
        @field:Min(2)
        val employeeContractAmt: Int?,

        @field:NotBlank
        val employeeGender: String?,

        @field:NotBlank
        val employeeStatus: String?,
)
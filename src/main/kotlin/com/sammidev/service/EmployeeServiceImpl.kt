package com.sammidev.service

import com.sammidev.entity.Employee
import com.sammidev.error.NotFoundException
import com.sammidev.model.CreateEmployeeRequest
import com.sammidev.model.EmployeeResponse
import com.sammidev.model.ListEmployeeRequest
import com.sammidev.model.UpdateEmployeeRequest
import com.sammidev.repository.EmployeeRepository
import com.sammidev.validation.ValidationUtil
import org.springframework.data.domain.PageRequest
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import java.util.*
import java.util.stream.Collectors
import kotlin.jvm.Throws

@Service
class EmployeeServiceImpl(val employeeRepository: EmployeeRepository, val validationUtil: ValidationUtil) : EmployeeService {

    override fun create(createEmployeeRequest: CreateEmployeeRequest): EmployeeResponse {
        validationUtil.validate(createEmployeeRequest)
        val employee = Employee (
                employeeId = createEmployeeRequest.employeeId!!,
                employeeNumber = createEmployeeRequest.employeeNumber!!,
                employeeSocialSecurityNumber = createEmployeeRequest.employeeSocialSecurityNumber!!,
                employeeFirstName = createEmployeeRequest.employeeFirstName!!,
                employeeLastname = createEmployeeRequest.employeeLastname!!,
                employeeAdress = createEmployeeRequest.employeeAddress!!,
                employeeCity = createEmployeeRequest.employeeCity!!,
                employeZipCode = createEmployeeRequest.employeZipCode!!,
                employeeDepartment = createEmployeeRequest.employeeDepartment!!,
                employeeBankAccountNumber = createEmployeeRequest.employeeBankAccountNumber!!,
                employeeSalary = createEmployeeRequest.employeeSalary!!,
                employeeHourly = createEmployeeRequest.employeeHourly!!,
                employeeContractAmt = createEmployeeRequest.employeeContractAmt!!,
                employeeGender = createEmployeeRequest.employeeGender!!,
                employeeStatus = createEmployeeRequest.employeeStatus!!,
                createdAt = Date(),
                updatedAt = null
        )
        employeeRepository.save(employee)
        return convertEmployeeToEmployeeResponse(employee)
    }

    override fun get(id: String): EmployeeResponse {
        val employee = findEmployeeByIdThrowNotFound(id)
        return convertEmployeeToEmployeeResponse(employee)
    }

    override fun update(id: String, updateEmployeeRequest: UpdateEmployeeRequest): EmployeeResponse {
        val employee = findEmployeeByIdThrowNotFound(id)
        validationUtil.validate(updateEmployeeRequest)
        employee.apply {
            employeeNumber = updateEmployeeRequest.employeeNumber!!
            employeeSocialSecurityNumber = updateEmployeeRequest.employeeSocialSecurityNumber!!
            employeeFirstName = updateEmployeeRequest.employeeFirstName!!
            employeeLastname = updateEmployeeRequest.employeeLastname!!
            employeeAdress = updateEmployeeRequest.employeeAddress!!
            employeeCity = updateEmployeeRequest.employeeCity!!
            employeZipCode = updateEmployeeRequest.employeZipCode!!
            employeeDepartment = updateEmployeeRequest.employeeDepartment!!
            employeeBankAccountNumber = updateEmployeeRequest.employeeBankAccountNumber!!
            employeeSalary = updateEmployeeRequest.employeeSalary!!
            employeeHourly = updateEmployeeRequest.employeeHourly!!
            employeeContractAmt = updateEmployeeRequest.employeeContractAmt!!
            employeeGender = updateEmployeeRequest.employeeGender!!
            employeeStatus = updateEmployeeRequest.employeeStatus!!
        }
        employeeRepository.save(employee)
        return convertEmployeeToEmployeeResponse(employee)
    }

    override fun delete(id: String) {
        val employee = findEmployeeByIdThrowNotFound(id)
        employeeRepository.delete(employee)
    }

    override fun list(listEmployeeRequest: ListEmployeeRequest): List<EmployeeResponse> {
        val page = employeeRepository.findAll(
                PageRequest.of(listEmployeeRequest.page, listEmployeeRequest.size))

        val employee: List<Employee> = page.get().collect(
                Collectors.toList())
        return employee.map {
            convertEmployeeToEmployeeResponse(it)
        }
    }

    @Throws(NotFoundException::class)
    private fun findEmployeeByIdThrowNotFound(id: String) : Employee {
        val employee = employeeRepository.findByIdOrNull(id)
        if (employee == null) {
            throw NotFoundException()
        }else {
            return employee
        }
    }
    private fun convertEmployeeToEmployeeResponse(employee: Employee): EmployeeResponse {
        return EmployeeResponse(
                employeeId = employee.employeeId,
                employeeNumber = employee.employeeNumber,
                employeeSocialSecurityNumber = employee.employeeSocialSecurityNumber,
                employeeFirstName = employee.employeeFirstName,
                employeeLastname = employee.employeeLastname,
                employeeAdress = employee.employeeAdress,
                employeeCity = employee.employeeCity,
                employeZipCode = employee.employeZipCode,
                employeeDepartment = employee.employeeDepartment,
                employeeBankAccountNumber = employee.employeeBankAccountNumber,
                employeeSalary = employee.employeeSalary,
                employeeHourly = employee.employeeHourly,
                employeeContractAmt = employee.employeeContractAmt,
                employeeGender = employee.employeeGender,
                employeeStatus = employee.employeeStatus,
                createdAt = employee.createdAt,
                updatedAt = employee.updatedAt
        )
    }

}
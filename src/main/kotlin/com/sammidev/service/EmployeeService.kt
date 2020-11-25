package com.sammidev.service

import com.sammidev.model.CreateEmployeeRequest
import com.sammidev.model.EmployeeResponse
import com.sammidev.model.ListEmployeeRequest
import com.sammidev.model.UpdateEmployeeRequest

interface EmployeeService {
    fun create(createEmployeeRequest: CreateEmployeeRequest): EmployeeResponse
    fun get(id: String): EmployeeResponse
    fun update(id: String, updateEmployeeRequest: UpdateEmployeeRequest): EmployeeResponse
    fun delete(id: String)
    fun list(listEmployeeRequest: ListEmployeeRequest) : List<EmployeeResponse>
}

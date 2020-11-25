package com.sammidev.controller

import com.sammidev.model.*
import com.sammidev.service.EmployeeService
import org.springframework.web.bind.annotation.*


@RestController
class employeeController(val employeeService: EmployeeService) {

    @PostMapping(
            value = ["api/employees"],
            produces = ["application/json"],
            consumes = ["application/json"]
    )
    fun createEmployee(@RequestBody body: CreateEmployeeRequest): WebResponse<EmployeeResponse> {
        val employeeResponse = employeeService.create(body)
        return WebResponse(
                code = 200,
                status = "OK",
                data = employeeResponse
        )
    }


    @GetMapping(
            value = ["api/employees/{idEmployee}"],
            produces = ["application/json"]
    )
    fun getEmployee(@PathVariable("idEmployee") id: String): WebResponse<EmployeeResponse> {
        val employeeResponse = employeeService.get(id)
        return WebResponse(
                code = 200,
                status = "ok",
                data = employeeResponse
        )
    }

    @PutMapping(
            value = ["/api/employees/{idEmployee}"],
            produces = ["application/json"],
            consumes = ["application/json"]
    )
    fun updateProduct(@PathVariable("idEmployee") id: String,
                      @RequestBody updateEmployeeRequest: UpdateEmployeeRequest): WebResponse<EmployeeResponse> {
        val employeeResponse = employeeService.update(id, updateEmployeeRequest)
        return WebResponse(
                code = 200,
                status = "OK",
                data = employeeResponse
        )
    }

    @DeleteMapping(
            value = ["/api/employees/{idEmployee}"],
            produces = ["application/json"]
    )
    fun deleteProduct(@PathVariable("idEmployee") id: String): WebResponse<String> {
        employeeService.delete(id)
        return WebResponse(
                code = 200,
                status = "OK",
                data = id
        )
    }


    @GetMapping(
            value = ["/api/employees"],
            produces = ["application/json"]
    )
    fun listProducts(@RequestParam(value = "size", defaultValue = "10") size: Int,
                     @RequestParam(value = "page", defaultValue = "0") page: Int): WebResponse<List<EmployeeResponse>> {
        val request = ListEmployeeRequest(page = page, size = size)
        val responses = employeeService.list(request)
        return WebResponse(
                code = 200,
                status = "OK",
                data = responses
        )
    }
}
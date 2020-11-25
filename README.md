**2020 | sammidev**
# API Spec ^_^

## Authentication

All API must use this authentication

Request :
- Header :
    - X-Api-Key : "your secret api key"

## Create Employee

Request :
- Method : POST
- Endpoint : `/api/employees`
- Header :
    - Content-Type: application/json
    - Accept: application/json
- Body :

```json 
{
    "employeeId" : "A0010",
    "employeeNumber" : "11111",
    "employeeSocialSecurityNumber" : "12431",
    "employeeFirstName" : "Sammi",
    "employeeLastname" : "Dev",
    "employeeCity" : "padang",
    "employeeAddress" : "sumbar",
    "employeZipCode" : 26361,
    "employeeDepartment" : "gopay",
    "employeeBankAccountNumber" : "123132",
    "employeeSalary" : 12000000,
    "employeeHourly" : 100,
    "employeeContractAmt" : 10,
    "employeeGender" : "male",
    "employeeStatus" : "actice"
}
```

Response :

```json 
{
    "code" : "number",
    "status" : "string",
    "data" : {
        "employeeId" : "A0010",
        "employeeNumber" : "11111",
        "employeeSocialSecurityNumber" : "12431",
        "employeeFirstName" : "Sammi",
        "employeeLastname" : "Dev",
        "employeeCity" : "padang",
        "employeeAddress" : "sumbar",
        "employeZipCode" : 26361,
        "employeeDepartment" : "gopay",
        "employeeBankAccountNumber" : "123132",
        "employeeSalary" : 12000000,
        "employeeHourly" : 100,
        "employeeContractAmt" : 10,
        "employeeGender" : "male",
        "employeeStatus" : "actice"
        "createdAt" : "date",
        "updatedAt" : "date"
    }
}
```

## Get Employee

Request :
- Method : GET
- Endpoint : `/api/employees/{id_employee}`
- Header :
    - Accept: application/json

Response :

```json 
{
    "code" : "number",
    "status" : "string",
    "data" : {
        "employeeId" : "A0010",
        "employeeNumber" : "11111",
        "employeeSocialSecurityNumber" : "12431",
        "employeeFirstName" : "Sammi",
        "employeeLastname" : "Dev",
        "employeeCity" : "padang",
        "employeeAddress" : "sumbar",
        "employeZipCode" : 26361,
        "employeeDepartment" : "gopay",
        "employeeBankAccountNumber" : "123132",
        "employeeSalary" : 12000000,
        "employeeHourly" : 100,
        "employeeContractAmt" : 10,
        "employeeGender" : "male",
        "employeeStatus" : "actice"
    }
}
```

## Update Employee

Request :
- Method : PUT
- Endpoint : `/api/employees/{id_employee}`
- Header :
    - Content-Type: application/json
    - Accept: application/json
- Body :

```json 
{
   "employeeNumber" : "11111",
   "employeeSocialSecurityNumber" : "12431",
   "employeeFirstName" : "Sammi",
   "employeeLastname" : "Dev",
   "employeeCity" : "padang",
   "employeeAddress" : "sumbar",
   "employeZipCode" : 26361,
   "employeeDepartment" : "gopay",
   "employeeBankAccountNumber" : "123132",
   "employeeSalary" : 12000000,
   "employeeHourly" : 100,
   "employeeContractAmt" : 10,
   "employeeGender" : "male",
   "employeeStatus" : "actice"
}
```

Response :

```json 
{
    "code" : "number",
    "status" : "string",
    "data" : {
         "employeeId" : "A0010",
         "employeeNumber" : "11111",
         "employeeSocialSecurityNumber" : "12431",
         "employeeFirstName" : "Sammi",
         "employeeLastname" : "Dev",
         "employeeCity" : "padang",
         "employeeAddress" : "sumbar",
         "employeZipCode" : 26361,
         "employeeDepartment" : "gopay",
         "employeeBankAccountNumber" : "123132",
         "employeeSalary" : 12000000,
         "employeeHourly" : 100,
         "employeeContractAmt" : 10,
         "employeeGender" : "male",
         "employeeStatus" : "actice"
         "createdAt" : "date",
         "updatedAt" : "date"
    }
}
```

## List Employee

Request :
- Method : GET
- Endpoint : `/api/employees`
- Header :
    - Accept: application/json
- Query Param :
    - size : number,
    - page : number

Response :

```json 
{
    "code" : "number",
    "status" : "string",
    "data" : [
        {
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
        },
        {
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
         }
    ]
}
```

## Delete Employee

Request :
- Method : DELETE
- Endpoint : `/api/employees/{id_employee}`
- Header :
    - Accept: application/json

Response :

```json 
{
    "code" : "number",
    "status" : "string"
}
```
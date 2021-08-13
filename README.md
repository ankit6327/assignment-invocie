# Recruitment Assignment
assignment-invoice


*After deployment, you will able to following REST endpoints:


|SNO|URL|REQUEST|DESCRIBE|
|---|---|---|---|
|1|http://localhost:8080/invoices|POST|Add Invoice|
|2|http://localhost:8080/invoices|GET|View All invoices|
|3|http://localhost:8080/invoices/{invoiceId}|GET|View Invoice|


## 1. Add Invoice

**URL :** _POST http://localhost:8080/invoices_

**REQUEST BODY :**

```JSON

{
   "client":"TestClient",
   "varRate":"1",
   "lineItems":[
      {
         "quantity":"10",
         "description":"demo description",
         "unitPrice":"0.00"
      },
      {
         "quantity":"10",
         "description":"description",
         "unitPrice":"0.00"
      }
   ]
}

```

**RESPONSE**

```JSON
Invoice added successfully

```



## 2. View All Invoice
**URL :** -GET http://localhost:8080/invoices

**RESPONSE**


```JSON
{
   "invoices":[
      {
         "id":1,
         "client":"TestClient",
         "varRate":1,
         "invoiceDate":"2021-08-13T18:45:15.553+00:00",
         "lineItems":[
            {
               "id":2,
               "quantity":10,
               "description":"demo description",
               "unitPrice":0.00
            },
            {
               "id":3,
               "quantity":10,
               "description":"description",
               "unitPrice":0.00
            }
         ]
      }
   ]
}

```


## 3. View Invoice
**URL :** -GET http://localhost:8080/invoices/{invoiceId}

**RESPONSE**


```JSON
{
    "id": 1,
    "client": "TestClient",
    "varRate": 1,
    "invoiceDate": "2021-08-13T18:45:15.553+00:00",
    "lineItems": [
        {
            "id": 2,
            "quantity": 10,
            "description": "demo description",
            "unitPrice": 0.00
        },
        {
            "id": 3,
            "quantity": 10,
            "description": "description",
            "unitPrice": 0.00
        }
    ]
}

```
## Check tables in database
Click on [H2-Console](http://localhost:8080/h2-console)

Properties need to set 

|SNO|Property|Value|
|---|---|---|
|1.|Saved Settings|Generic H2 (Embedded)|
|2.|Setting Name|Generic H2 (Embedded)|
|3.|Driver Class|org.h2.Driver|
|4.|JDBC URL|jdbc:h2:mem:invoicedb1|
|5.|User Name|sa|
|6.|Password||



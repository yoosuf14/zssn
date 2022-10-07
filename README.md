# Zombie Social Security Network
This is a Springboot Rest Api for a Zombie Social Security Network

Database name: zssn

## Add survivor
### Request
`POST /registerSurvivor/`
### JSON example

'{
	"name":"Yoosuf Ahmadh",
	"age": 25,
	"gender": "Male",
	"locationX":10.00,
	"locationY":20.15,
	"infected":"false"
}'

## Update Survivor location
### Request
`PUT /updateSurvivorLocation/{survivorId}`
### JSON example
{
	"locationX":100.0,
	"locationY":100..0
}

## Get infected percentage
### Request
`GET /infectedPercentage/`



## Get non-infected percentage
### Request
`GET /nonInfectedPercentage/`

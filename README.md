# You will develop a REST API (yes, we care about architecture design even in the midst of a zombie apocalypse!), which will store information about the survivors, as well as the resources they own.
Add survivors to the database
A survivor must have a name, age, gender and last location (latitude, longitude).
A survivor also has an inventory of resources of their own property (which you need to declare when upon the registration of the survivor).
Update survivor location
A survivor must have the ability to update their last location, storing the new latitude/longitude pair in the base (no need to track locations, just replacing the previous one is enough).
Reports
The API must offer the following reports:
Percentage of infected survivors.
Percentage of non-infected survivors.

- Database name: zssn

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

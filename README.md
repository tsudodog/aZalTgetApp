# myRetail RESTful Service

Hello, this is my implementation of the myReatil RESTful Service project. At a high level
this application utilizes a web framework called [Spark](http://sparkjava.com/). It is a microframework
ideal for restful applications and small quick to deploy projects. It enables quick development and
provides excellent integration with Heroku allowing for a hosted application to be relatively trivial.

## Testing Instructions
A live instance of the application is hosted on Heroku, located [HERE](https://a-zalewski-tget-app.herokuapp.com)

The application accepts two endpoints

| TYPE     | End Point            | Content-Type |
| -------- | :----------:         | ------------     |
| GET      | /products/:productID | none             |
| PUT      | /products/:productID | application/json |


The following is an example of the body the PUT /products/:productID is expecting
``` json
{
    "currentPrice" : {
        "value" : 654.23,
        "currencyCode" : "AUD"
    }
}
```

Each endpoint has a postman example that can be found [HERE](https://app.getpostman.com/run-collection/99ecdab871a606d074fb)


## Technology Stack
  I used several utilities and libraries to make the application possible.
* Language: Java 1.8
* Application Server: [Spark](http://sparkjava.com/)
* Database: [MongoDB](https://www.mongodb.com/)
* Object Relational Mapping : [Morphia](http://morphiaorg.github.io/morphia/1.4/)
* Json Utility: [Gson](https://github.com/google/gson)
* General Utility: [Apache Commons](https://commons.apache.org/)

The application is hosted on [heroku](http://heroku.com) and the instance of MongoDB is located
at [Mlab](https://mlab.com)

## Coding Philosophy
* Write code that the next engineer that works on it does not hate the original author.
* If it is not testable it is detestable!

## Building locally
The application is a standard Maven project which should be able to be pulled from the repository and
have the dependencies downloaded automatically. The application expects two environment variables mdb_usr
and mdb_pass for the database username and password. The database connection string will also need to be changed
to reflect the location of the mongodb instance you wish to use.
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

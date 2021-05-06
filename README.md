# holarest
Simple Java REST client

###How to test REST without parameter
1. Run app
1. http://localhost:8080/holarest/resources/developers gives "duchess, duke" as answer.

###How to test REST with parameter "firstname-lastname"
1. Run app
1. http://localhost:8080/holarest/resources/developers/hans-ruedi gives "hans - ruedi" as answer.

###How to test REST with parameter "firstname-lastname" and XML object as return -> doesn't work :-(
1. Run app
1. http://localhost:8080/holarest/resources/developers/hans-ruedi gives "hans - ruedi" as answer.
1. curl test
   
   ``curl http://localhost:8080/holarest/resources/developers/hans-ruedi``
   
   ``curl -H "Accept: application/json" http://localhost:8080/holarest/resources/developers/hans-ruedi``

###How to test REST with JSON response
1. Run app
1. http://localhost:8080/holarest/resources/developers gives a JSON answer.
1. curl test
   
   ``curl -H "Accept: application/json" http://localhost:8080/holarest/resources/developers``

# Time service
Simple microservice that returns the current time.

This service will register itself in Spring Eureka server.

It will also use Spring Eureka server to discover the Spring Cloud Configuration server where the service configuration
is stored.

The idea is to have multiple instances of this service and later use another service (`time-ui`) to use them through
some kind of load balancer.

## Endpoints

This service will offer the following endpoints

* `GET /`: This will return the current date with the configured format.
```
$ curl http://localhost:8081
   11/06/2020 11:55:19(from time-service:-1029068730)
```

* `PUT /put-down`: This will mark the node that receives the request as `DOWN`. Useful to see how to Eureka panics.
```
$ curl -XPUT http://localhost:8081/put-down
```

* `PUT /get-up`: This will mark the node that receives the request as `UP`. Useful to see how to Eureka gets relaxed.
```
$ curl -XPUT http://localhost:8081/get-up
```

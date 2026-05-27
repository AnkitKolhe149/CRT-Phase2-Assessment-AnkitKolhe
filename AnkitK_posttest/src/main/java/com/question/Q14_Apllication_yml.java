//spring:
//  application:
//    name: api-gateway
//
//server:
//  port: 8080
//
//spring:
//  cloud:
//    gateway:
//      routes:
//        - id: order-service
//          uri: lb://order-service
//          predicates:
//            - Path=/api/orders/**
//        - id: user-service
//          uri: lb://user-service
//          predicates:
//            - Path=/api/users/**

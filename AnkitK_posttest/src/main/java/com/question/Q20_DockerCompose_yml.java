//version: '3.8'
//
//services:
//  db:
//    image: postgres:15
//    container_name: postgres-db
//    environment:
//      POSTGRES_DB: mydb
//      POSTGRES_USER: myuser
//      POSTGRES_PASSWORD: mypassword
//    ports:
//      - "5432:5432"
//
//  app:
//    image: myapp:latest
//    container_name: springboot-app
//    ports:
//      - "8080:8080"
//    depends_on:
//      - db
//    environment:
//      SPRING_DATASOURCE_URL: jdbc:postgresql://db:5432/mydb
//      SPRING_DATASOURCE_USERNAME: myuser
//      SPRING_DATASOURCE_PASSWORD: mypassword

//for running both services together:
//docker-compose up
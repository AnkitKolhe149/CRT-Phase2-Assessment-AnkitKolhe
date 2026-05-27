Q1.
Ans:  First "Constructor called" will get printed , then  "Init called".
Code: @Component public class MyBean {    public MyBean() {        System.out.println("Constructor called");    }    @PostConstruct    public void init() {        System.out.println("Init called");    } }
Reason: Annotations. 
============================================================================================
Q2. 
Ans: 
return new ResponseEntity<>(HttpStatus.OK); is the mistake because , user was not passed. 

is the corrected version : return new ResponseEntity<>(u, HttpStatus.OK);  user is passed.

============================================================================================
Q4. 
Ans: 
The missing annotation is @Transactional. 
@ Transactional help us so both database operations must succeed or fail as one transaction.

if this annotation is missing then , one save succeeds while the other fails, data becomes inconsistent (money deducted but not credited). Spring will not automatically roll back both operations.

============================================================================================
Q6.
Ans:
a. 
It reads the JWT token from the Authorization header of the request.
If the token is valid, it authenticates the user and stores auth information in SecurityContext.

b. mistake : String token = header.substring(6);
 corrected: String token = header.substring(7);
 reason: "Bearer " contains 7 characters including the space.
Using substring(6) keeps an extra space at the beginning of the token, making the JWT key wrong .

============================================================================================
Q8. 
Ans: 
1. The N+1 query problem in JPA happens when fetching a list of parent entities triggers one query for the parents and then an extra query for each child entity, leading to many unnecessary queries. 

2. For example, loading 10 students and then lazily fetching their courses results in 11 queries instead of 1. 

3. The most common cause is lazy loading of relationships, and you can fix it with a single line like:
@Query("SELECT s FROM Student s JOIN FETCH s.courses")

============================================================================================
Q9. 
Ans: For SQL : Subquery method:
SELECT MAX(salary) 
FROM employees 
WHERE salary < (SELECT MAX(salary) FROM employees);

USing JPQL : 
@Query("SELECT MAX(e.salary) FROM Employee e WHERE e.salary < (SELECT MAX(e2.salary) FROM Employee e2)")
Double findSecondHighestSalary();

============================================================================================

Q10.
Ans: 
a. Find by city
List<Student> findByCity(String city);

b. Find by name and city
List<Student> findByNameAndCity(String name, String city);

c. Find by email containing a keyword
List<Student> findByEmailContaining(String keyword);

d. Count students in a city
long countByCity(String city);

Spring Data JPA already help us by providing this simple kind of query. 

============================================================================================
Q11. 
Ans:
This is an example of n+1 problem in spring Jpa or hibernate .
mistake : System.out.println(o.getItems().size());
corrected :
 @Query("SELECT o FROM Order o JOIN FETCH o.items")
List<Order> findAllWithItems();

============================================================================================
Q13. 
Ans: 
1. A Circuit Breaker in microservices is a resilience pattern that prevents repeated calls to a failing service, protecting the system from cascading failures.

2.  It is needed because in distributed systems, one slow or failing service can drag down the entire application if calls keep retrying endlessly. 

3. With a circuit breaker, calls are blocked once failures cross a threshold, and a fallback ensures graceful degradation.

============================================================================================
Q14.
Ans:

An API Gateway is a single entry point for all client requests in a microservices architecture.
 It handles routing, load balancing, authentication, and other cross-cutting concerns.

Advantage: 
centralized routing & load balancing -> Clients don’t need to know individual service urls.
cross-cutting concerns -> Security, logging, and rate limiting can be applied consistently in one place.

============================================================================================
Q15.
Ans: 
1. Service Discovery in microservices is the mechanism by which services automatically locate each other at runtime instead of relying on fixed IP addresses or hostnames. 

2. It’s needed because microservices often scale dynamically, move across nodes, or restart, making hardcoded IPs brittle and error-prone. In class, the tool we used was Eureka.

3. it is a self configuring when service up , we don't need to hardcode check everytime.

============================================================================================
Q16. 
Ans: 
A. Benefits of splitting into microservices: 
Independent scaling -> Each different service  can scale separately based on demand.

Technology flexibility -> Teams can use different tech stacks or databases for each service.

Fault isolation ->  A failure in one service doesn’t crash the entire system.


B. 
Challenges: 
1. Operational complexity -> More services mean more deployments, monitoring, and logging pipelines.

2 . Data consistency -> Transactions across multiple services are harder to manage (eventual consistency is common).


C. Eureka + API Gateway working together: 
1. Eureka acts as the service registry, keeping track of all running instances of User, Order, and Product services.

2. The API Gateway is the single entry point for the React frontend. It routes requests like /api/users/, /api/orders/, and /api/products/ to the correct service.

3. The gateway uses service names (resolved dynamically via Eureka) instead of hardcoded IPs, so the React app only needs to call one URL (e.g., http://localhost:8080/api/...).
============================================================================================

Q18.
Ans: 
Difference between @Mock and @MockBean: 
1. @Mock (Mockito): Creates a mock object in plain unit tests. It does not load the Spring context — you use it when testing a class in isolation.

2. @MockBean (Spring Boot Test): Creates a mock and also injects it into the Spring ApplicationContext, replacing the real bean. one can use it in integration-style tests with @SpringBootTest when you want Spring to wire everything but substitute one dependency with a mock.

============================================================================================
Q22.
Ans: 
mistake: 
The useEffect hook is missing its dependency array. Without it, the effect runs after every render, and since setUsers triggers a re-render, it causes an infinite loop of fetches.
 fetch('/api/users')
       .then(res => res.json())      
       .then(data => setUsers(data));   });
       								  ^  

Corrected:
Adding an empty dependency array [] so the fetch runs only once when the component mounts.
 fetch('/api/users')
       .then(res => res.json())
             .then(data => setUsers(data)); [] });  //array dependency fulfilled.
											^

============================================================================================

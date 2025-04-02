package com.tothenew.firstSpringBProj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //Used to define REST API endpoints.
public class Car {

    @Autowired //The @Autowired annotation in Spring is used for dependency injection. It allows Spring to automatically inject a required bean (dependency) into another bean, reducing the need for manual instantiation.
    // When you mark a field, constructor, or setter with @Autowired, Spring looks for a matching bean in the application context and injects it.
    private Dog dog;

    @GetMapping("sayHello")
    public String sayHello()
    {
//        return "Hello Zubair this is the first Spring Boot Project ";
        return dog.fun();
    }
}

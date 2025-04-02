package com.tothenew.firstSpringBProj;

import org.springframework.stereotype.Component;

@Component //@Component annotation makes the bean of any class over which it is mentioned
public class Dog {
    public String fun()
    {
        return "something";
    }
}

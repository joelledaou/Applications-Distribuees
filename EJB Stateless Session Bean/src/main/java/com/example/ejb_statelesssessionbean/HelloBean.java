package com.example.ejb_statelesssessionbean;

import javax.ejb.Stateless;

@Stateless
public class HelloBean implements Hello {
    @Override
    public String sayHello() {
        return "Hello World";
    }
}

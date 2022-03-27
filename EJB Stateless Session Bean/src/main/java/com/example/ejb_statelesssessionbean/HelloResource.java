package com.example.ejb_statelesssessionbean;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello-world")
@Stateless
public class HelloResource {
    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello World";
    }
}
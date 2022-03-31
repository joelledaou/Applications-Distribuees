package com.example.ejb_statelesssessionbean;

import javax.ejb.Remote;

@Remote
public interface Hello {
    String sayHello();
}

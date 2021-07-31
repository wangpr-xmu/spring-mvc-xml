package org.worker.mvcxml.service.impl;

import org.worker.mvcxml.service.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public void hello() {
        System.out.println("hello service");
    }
}

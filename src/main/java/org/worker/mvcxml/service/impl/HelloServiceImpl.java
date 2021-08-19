package org.worker.mvcxml.service.impl;

import org.worker.mvcxml.service.HelloService;
import org.worker.mvcxml.service.TestService;

public class HelloServiceImpl implements HelloService {
    private TestService testService;
    @Override
    public void hello() {
        System.out.println(testService);
        System.out.println("hello service");
    }

    public void setTestService(TestService testService) {
        this.testService = testService;
    }
}

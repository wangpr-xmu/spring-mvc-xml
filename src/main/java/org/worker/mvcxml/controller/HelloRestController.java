package org.worker.mvcxml.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.worker.mvcxml.service.HelloRestService;

/**
 * @author peiru wang
 * @date 2021/8/12
 */
@RestController
public class HelloRestController {

    @Autowired
    private HelloRestService helloRestService;


    @RequestMapping(value = "/rest.do", method = RequestMethod.GET)
    public String hello() {
        System.out.println(helloRestService);
        return "hello restful";
    }
}

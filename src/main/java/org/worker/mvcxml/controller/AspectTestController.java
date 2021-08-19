package org.worker.mvcxml.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.worker.mvcxml.service.HelloService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author peiru wang
 * @date 2021/8/8
 */
public class AspectTestController extends AbstractController {
    private HelloService helloService;

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        helloService.hello();
        return new ModelAndView("hello");
    }

    
    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }
}

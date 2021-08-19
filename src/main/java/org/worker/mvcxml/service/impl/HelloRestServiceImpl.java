package org.worker.mvcxml.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.worker.mvcxml.service.HelloRestService;

/**
 * @author peiru wang
 * @date 2021/8/12
 */
@Service
public class HelloRestServiceImpl implements HelloRestService {

    @Override
    public void helloRest() {
        System.out.println("hello rest");
    }
}

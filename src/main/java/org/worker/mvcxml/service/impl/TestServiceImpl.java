package org.worker.mvcxml.service.impl;

import org.worker.mvcxml.service.TestService;

/**
 * @author peiru wang
 * @date 2021/8/6
 */
public class TestServiceImpl implements TestService {
    @Override
    public void say() {
        System.out.println("test");
    }
}

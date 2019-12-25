package com.czd.service;

import com.czd.api.IDemoService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class DemoServiceTest extends SpringTest{

    @Autowired
    private IDemoService demoServices;

    @Test
    public void say() {
        demoServices.say();
    }
}
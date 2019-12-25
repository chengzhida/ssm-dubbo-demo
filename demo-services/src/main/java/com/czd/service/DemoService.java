package com.czd.service;

import com.czd.api.IDemoService;
import org.springframework.stereotype.Service;


@Service
public class DemoService implements IDemoService {

    public DemoService() {
        System.out.println("加载DemoService");
    }

    @Override
    public void say() {
        System.out.println("hello dubbo");
    }

    @Override
    public String sayHelloWorld() {
        return "hello world";
    }

    @Override
    public String echo(String echo) {
        return echo;
    }
}

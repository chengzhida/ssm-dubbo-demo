package com.czd.service;

import java.io.PrintStream;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/spring-test.xml"})
public class SpringTest {
    private long start;
    protected String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";

    @Test
    public void test(){}

    public SpringTest() {
    }

    @Before
    public void before() {
        this.start = System.currentTimeMillis();
        System.out.println(DateFormatUtils.format(this.start, this.DATE_FORMAT) + " test case start.");
    }

    @After
    public void after() {
        long end = System.currentTimeMillis();
        PrintStream var10000 = System.out;
        String var10001 = DateFormatUtils.format(end, this.DATE_FORMAT);
        var10000.println(var10001 + " test case end,used time : " + (end - this.start) + " ms.");
    }
}


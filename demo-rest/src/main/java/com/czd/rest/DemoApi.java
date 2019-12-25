package com.czd.rest;

import com.alibaba.dubbo.rpc.service.EchoService;
import com.czd.api.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.LinkedHashMap;
import java.util.Map;


//@Api(value = "demo示例")
@Path("demo-api")
@Service
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DemoApi {

    @Autowired
    private IDemoService demoServices;

    @GET
    @Path("/test")
//    @ApiOperation(value = "测试")
    public String sayHelloWorld() {
       return demoServices.sayHelloWorld();
    }

//    @ApiOperation(value = "回声测试")
    @GET
    @Path("echo")
    public Map<String, Object> echo() {
        Map<String, Object> result = new LinkedHashMap<>();
        try {
            result.put("demo-api",((EchoService)demoServices).$echo("OK"));
        } catch (Exception e) {
            result.put("demo-api", e.getMessage());
        }
        return result;
    }

}

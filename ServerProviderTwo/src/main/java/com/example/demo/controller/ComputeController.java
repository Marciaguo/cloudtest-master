package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ComputeController {
    @Autowired
    private Registration registration;//服务注册
    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
       // ServiceInstance instance = serviceInstance();
        Integer r = a * b;
        //System.out.println("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
        return r;
    }
//    public ServiceInstance serviceInstance() {
//        List<ServiceInstance> list = client.getInstances(registration.getServiceId());
//        if (list != null && list.size() > 0) {
//            for(ServiceInstance itm : list){
//                if(itm.getPort() == 2001)
//                    return itm;
//            }
//        }
//        return null;
//    }
//@Value("${server.port}")
//private String port;
//
//    @RequestMapping(value = "/hi",method = RequestMethod.GET)
//    public String sayHi(){
//        return "hello ,I'm port:"+port;
//    }

}
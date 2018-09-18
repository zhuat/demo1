package com.zat.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: ConsumerController
 * @author: ZAT
 * @create: 2018-09-18 15:42
 **/
@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/ribbon-consumer",method = RequestMethod.GET)
    public String hellConsumer(){
        return  restTemplate.getForEntity("http://HELLO-SERVICE/hello",String.class).getBody();
    }
}
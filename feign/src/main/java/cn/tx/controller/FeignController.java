package cn.tx.controller;


import cn.tx.entity.Person;
import cn.tx.service.FeignDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/feign")
public class FeignController{

    @Autowired
    private FeignDemo feignDemo;

    @GetMapping("/findAll")
    public Collection<Person> findAll() {
        return feignDemo.findAll();
    }


    @GetMapping("/index")
    public String index() {
        return feignDemo.index();
    }
}

package cn.tx.controller;


import cn.tx.entity.Person;
import cn.tx.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;
    @Value("${server.port}")
    private String port;

    @GetMapping("/findAll")
    public Collection<Person> findAll(){
        return personService.findAll();
    }

    @GetMapping("index")
    public String index(){
        return port;
    }


}

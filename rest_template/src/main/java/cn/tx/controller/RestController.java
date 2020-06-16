package cn.tx.controller;

import cn.tx.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("rest")
public class RestController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("findAll")
    public Collection<Person> findAll(){
        return restTemplate.getForEntity("http://localhost:8010/person/findAll",Collection.class).getBody();
    }

    @GetMapping("findAll2")
    public Collection<Person> findAll2(){
        return restTemplate.getForObject("http://localhost:8010/person/findAll",Collection.class);
    }
}

package cn.tx.service;


import cn.tx.entity.Person;
import cn.tx.service.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value = "provider",fallback = FeignError.class)
public interface FeignDemo {

    @GetMapping("/person/findAll")
    public Collection<Person> findAll();

    @GetMapping("/person/index")
    public String index();
}

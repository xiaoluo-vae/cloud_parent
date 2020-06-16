package cn.tx.service.impl;

import cn.tx.entity.Person;
import cn.tx.service.FeignDemo;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeignError implements FeignDemo {
    @Override
    public Collection<Person> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中。。";
    }
}

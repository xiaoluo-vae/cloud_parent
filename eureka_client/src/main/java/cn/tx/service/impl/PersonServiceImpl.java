package cn.tx.service.impl;

import cn.tx.entity.Person;
import cn.tx.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PersonServiceImpl implements PersonService {

    private static Map<Long,Person> map;

    static {
        map = new HashMap<>();
        map.put(1l,new Person("王五",23));
        map.put(2l,new Person("王五",29));
        map.put(3l,new Person("王五",28));
    }
    @Override
    public Collection<Person> findAll() {
        return map.values();
    }
}

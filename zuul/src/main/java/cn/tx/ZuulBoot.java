package cn.tx;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableAutoConfiguration
@EnableZuulProxy
public class ZuulBoot {

    public static void main(String[] args) {
        SpringApplication.run(ZuulBoot.class,args);
    }
}

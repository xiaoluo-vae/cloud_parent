package cn.tx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignBoot {

    public static void main(String[] args) {
        SpringApplication.run(FeignBoot.class,args);
    }
}

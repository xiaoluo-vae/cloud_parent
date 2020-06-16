package cn.tx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ApplicationBoot {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationBoot.class,args);
    }
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}

package cn.tx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigBoot {
    public static void main(String[] args) {
        SpringApplication.run(ConfigBoot.class,args);
    }
}

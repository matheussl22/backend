package br.com.acert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com.core", "br.com.acert"})
public class PrincipalServer {

    public static void main(String[] args) {
        SpringApplication.run(PrincipalServer.class, args);
    }

}

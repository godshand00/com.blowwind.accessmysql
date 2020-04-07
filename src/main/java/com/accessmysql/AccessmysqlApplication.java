package com.accessmysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@Configuration
public class AccessmysqlApplication {

    @GetMapping("hello")
    @ResponseBody
    public String hello() {
        return "hello, world! yeah";
    }

    public static void main(String[] args) {
        SpringApplication.run(AccessmysqlApplication.class, args);
        for (int i = 0; i < 6; i++) {
            for (int i1 = 0; i1 < 20; i1++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int[] arrayA = new int[100];
        String[] arrayStr = new String[100];
        int[] arrayInt =new int[] {5,15,25};

    }

}

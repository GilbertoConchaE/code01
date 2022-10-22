package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class Main {
    @RequestMapping("/")
    @ResponseBody
    String bienvenida() {
        return "¡Hola! te damos la bienvenida";
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
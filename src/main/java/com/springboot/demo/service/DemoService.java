package com.springboot.demo.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public interface DemoService {
    int add(int page);

    @RestController
    class HelloController {

        @RequestMapping("/hello")
        public String index() {
            return "Hello World";
        }

    }
}

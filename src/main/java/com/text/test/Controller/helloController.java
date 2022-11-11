package com.text.test.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    @Value("${os.name}")
    private String os;
    @Value("${JAVA_HOME}")
    private String HOME;
    @GetMapping("/os")
    public String getos(){
        return os;
    }
    @GetMapping("/java")
    private String getjava(){
        return HOME;
    }
}
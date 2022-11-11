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
    @GetMapping("hello")
    public String gethello(){
        return "hello";
    }
    @GetMapping("helloworld")
    public String gethelloworld(){
        return "helloworld";
    }
    @GetMapping("master")
    public String master(){
        return "master";
    }
    @GetMapping("/init")
    public String init(){
        return "init";
    }
    @GetMapping("/inin")
    public String inin(){
        return "inin";
    }
    public void test(){
        System.out.println("hello");
        System.out.println("world");
    }
    
    }

package sma.trial.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldCtrl {
    @GetMapping("helloworld")
    public String helloworld() {
        return "hello world";
    }
}

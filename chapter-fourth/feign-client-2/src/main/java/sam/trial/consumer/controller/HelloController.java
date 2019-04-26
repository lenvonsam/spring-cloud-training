package sam.trial.consumer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client")
public class HelloController {

    @Value("${server.port}")
    private int appPort;

    @GetMapping("hello")
    public String helloWorld() {
        return "http client hello world from client-2 port " + appPort;
    }
}

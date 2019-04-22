package sam.trial.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sam.trial.dataspi.model.User;
import sam.trial.dataspi.provider.UserProvider;

@RestController
@RequestMapping("consumer")
public class HelloController {
    @Autowired
    private UserProvider userProvider;

    @GetMapping("hello/{id}")
    public String helloUser(@PathVariable(value = "id", required = true) Long id) {
        User u = userProvider.userInfo(id);
        return "hello " + u.getName();
    }
}

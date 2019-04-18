package sam.trial.provider.controller;


import org.springframework.web.bind.annotation.RestController;
import sam.trial.dataspi.model.User;
import sam.trial.dataspi.provider.UserProvider;

@RestController
public class UserControllerImpl implements UserProvider {
    @Override
    public User userInfo(Long id) {
        User user = new User();
        user.setId(id);
        user.setName("feign provider 1");
        user.setGender("male");
        return user;
    }
}

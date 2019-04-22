package sam.trial.provider.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import sam.trial.dataspi.model.User;
import sam.trial.dataspi.provider.UserProvider;

@RestController
public class UserControllerImpl implements UserProvider {
    @Value("${server.port}")
    private int appPort = 0;

    @Override
    public User userInfo(Long id) {
        User user = new User();
        user.setId(id);
        user.setName("port:>>" + appPort + " feign provider");
        user.setGender("male");
//        throw new NullPointerException();
        return user;
    }
}

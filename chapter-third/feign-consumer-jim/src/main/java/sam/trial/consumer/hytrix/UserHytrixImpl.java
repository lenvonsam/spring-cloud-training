package sam.trial.consumer.hytrix;

import org.springframework.stereotype.Component;
import sam.trial.dataspi.hytrix.UserHystrix;
import sam.trial.dataspi.model.User;

@Component
public class UserHytrixImpl extends UserHystrix {
    @Override
    public User userInfo(Long id) {
        User u = new User();
        u.setName("jim user hytrix 服务中断了");
        return u;
    }
}

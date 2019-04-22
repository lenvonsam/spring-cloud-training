package sam.trial.consumer.hytrix;

import org.springframework.stereotype.Component;
import sam.trial.dataspi.hytrix.UserHystrix;
import sam.trial.dataspi.model.User;

@Component
public class UserHystrixImpl extends UserHystrix {
    @Override
    public User userInfo(Long id) {
        User u = new User();
        u.setName("user hytrix 服务中断了");
        return u;
    }
}

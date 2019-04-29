package sam.trial.consumer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import sam.trial.consumer.provider.HelloProvider;

@RestController
public class HelloProviderImpl implements HelloProvider {
    @Value("${server.port}")
    private int appPort;

    @Override
    public String providerHello() {
        return "provider client hello world from client-1 port" + appPort;
    }
}

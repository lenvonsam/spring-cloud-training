package sam.trial.consumer.provider;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("api-sec")
public interface HelloProvider {
    @GetMapping("hello")
    String providerHello();
}

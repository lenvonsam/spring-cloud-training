package sam.trial.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import sam.trial.dataspi.provider.UserProvider;

@SpringBootApplication
@EnableFeignClients(basePackageClasses = {UserProvider.class})
@EnableEurekaClient
public class FeignConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignConsumerApplication.class, args);
	}

}

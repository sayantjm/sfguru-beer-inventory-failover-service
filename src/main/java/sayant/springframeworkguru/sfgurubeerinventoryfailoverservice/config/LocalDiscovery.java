package sayant.springframeworkguru.sfgurubeerinventoryfailoverservice.config;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by sayantjm on 6/3/21
 */
@EnableDiscoveryClient
@Profile("local-discovery")
@Configuration
public class LocalDiscovery {
}

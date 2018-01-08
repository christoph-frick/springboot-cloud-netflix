@Grapes([
@Grab('org.springframework.cloud:spring-cloud-starter-config:1.4.0.RELEASE'),
@Grab('org.springframework.cloud:spring-cloud-starter-netflix-eureka-client:1.4.0.RELEASE'),
@Grab('org.springframework.cloud:spring-cloud-config-server:1.4.0.RELEASE'),
])

import org.springframework.cloud.config.server.EnableConfigServer
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableConfigServer
@EnableDiscoveryClient
class ConfigServer {
}

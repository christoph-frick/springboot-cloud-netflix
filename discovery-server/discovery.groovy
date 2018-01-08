@Grapes([
@Grab('org.springframework.cloud:spring-cloud-starter-netflix-eureka-server:1.4.0.RELEASE'),
])

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
class DiscoveryServer {
}

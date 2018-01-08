@Grapes([
@Grab('org.springframework.cloud:spring-cloud-starter-netflix-zuul:1.4.0.RELEASE'),
@Grab('org.springframework.cloud:spring-cloud-starter-netflix-eureka-client:1.4.0.RELEASE'),
])

import org.springframework.cloud.netflix.zuul.EnableZuulProxy
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableZuulProxy
@EnableCircuitBreaker
@EnableDiscoveryClient
class ProxyServer {
}

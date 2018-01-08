@Grapes([
@Grab('org.springframework.cloud:spring-cloud-starter-config:1.4.0.RELEASE'),
@Grab('org.springframework.cloud:spring-cloud-starter-netflix-eureka-client:1.4.0.RELEASE'),
@Grab('org.springframework.cloud:spring-cloud-starter-netflix-hystrix:1.4.0.RELEASE'),
])

import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@RestController
@EnableDiscoveryClient
@EnableCircuitBreaker
class Rest {
	@GetMapping("/")
	def index() {
		return [hello: "world"]
	}
}

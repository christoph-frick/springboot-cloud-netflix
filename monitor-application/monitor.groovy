@Grapes([
@Grab('org.springframework.cloud:spring-cloud-starter-config:1.4.0.RELEASE'),
@Grab('org.springframework.cloud:spring-cloud-starter-netflix-eureka-client:1.4.0.RELEASE'),
@Grab('org.springframework.cloud:spring-cloud-starter-netflix-hystrix-dashboard:1.4.0.RELEASE'),
@Grab('org.springframework.cloud:spring-cloud-starter-netflix-turbine:1.4.0.RELEASE'),
])

import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard
import org.springframework.cloud.netflix.turbine.EnableTurbine

@EnableDiscoveryClient
@EnableHystrixDashboard
@EnableTurbine
class Monitor {
}

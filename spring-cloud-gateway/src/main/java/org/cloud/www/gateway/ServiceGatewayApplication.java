package org.cloud.www.gateway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

/**
 * ref:https://spring.io/projects/spring-cloud-gateway#overview
 * <p>
 * Features
 * Spring Cloud Gateway features:
 * <p>
 * Built on Spring Framework 5, Project Reactor and Spring Boot 2.0
 * <p>
 * Able to match routes on any request attribute.
 * <p>
 * Predicates and filters are specific to routes.
 * <p>
 * Circuit Breaker integration.
 * <p>
 * Spring Cloud DiscoveryClient integration
 * <p>
 * Easy to write Predicates and Filters
 * <p>
 * Request Rate Limiting
 * <p>
 * Path Rewriting
 */
@SpringBootApplication
public class ServiceGatewayApplication {


    public static void main(String[] args) {
        SpringApplication.run(ServiceGatewayApplication.class, args);
    }

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("path_route1", r -> r.path("/get")
                        .uri("http://httpbin.org"))
                .route("path_route2", r -> r.path("/a/**")
                        .uri("lb://micro-service-a"))
                .route("path_route3", r -> r.path("/b")
                        .uri("lb://micro-service-b"))
                .route("path_route4", r -> r.path("/c")
                        .uri("http://httpbin.org"))
                .route("host_route5", r -> r.host("*.myhost.org")
                        .uri("http://httpbin.org"))
                .route("rewrite_route6", r -> r.host("*.rewrite.org")
                        .filters(f -> f.rewritePath("/foo/(?<segment>.*)", "/${segment}"))
                        .uri("http://httpbin.org"))
                .route("hystrix_route7", r -> r.host("*.hystrix.org")
                        .filters(f -> f.hystrix(c -> c.setName("slowcmd")))
                        .uri("http://httpbin.org"))
                .route("hystrix_fallback_route", r -> r.host("*.hystrixfallback.org")
                        .filters(f -> f.hystrix(c -> c.setName("slowcmd").setFallbackUri("forward:/hystrixfallback")))
                        .uri("http://httpbin.org"))
                .route("limit_route", r -> r
                        .host("*.limited.org").and().path("/anything/**")
                        //.filters(f -> f.requestRateLimiter(c -> c.setRateLimiter(redisRateLimiter())))
                        .uri("http://httpbin.org"))
                .build();
    }
}

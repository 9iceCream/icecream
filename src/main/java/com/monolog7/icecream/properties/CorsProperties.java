package com.monolog7.icecream.properties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ToString
@ConfigurationProperties(prefix = "cors")
@PropertySource("classpath:properties/cors.properties")
public class CorsProperties {
    private String allowedOrigin;
    private boolean allowCredentials;
    private String allowedMethod;
    private String allowedHeader;
    private String exposedHeader;
}

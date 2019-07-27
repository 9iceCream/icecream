package com.monolog7.icecream.config;

import com.monolog7.icecream.properties.CorsProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.nio.charset.Charset;
import java.util.List;

@Configuration
public class CorsConfig extends WebMvcConfigurationSupport {

    @Autowired
    private CorsProperties corsProperties;

    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**")
                .allowedOrigins(corsProperties.getAllowedOrigin())
                .allowedMethods(corsProperties.getAllowedMethod())
                .allowedHeaders(corsProperties.getAllowedHeader());
        super.addCorsMappings(registry);
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters){
        StringHttpMessageConverter converter = new StringHttpMessageConverter(Charset.forName("UTF-8"));
        converters.add(converter);
    }

    /*@Bean
    public CorsFilter corsFilter(){
        // 1.添加cors配置信息
        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedOrigin(corsProperties.getAllowedOrigin());
        config.setAllowCredentials(corsProperties.isAllowCredentials());
        config.addAllowedMethod(corsProperties.getAllowedMethod());
        config.addAllowedHeader(corsProperties.getAllowedHeader());

        //2.添加映射路径
        UrlBasedCorsConfigurationSource configurationSource = new UrlBasedCorsConfigurationSource();
        configurationSource.registerCorsConfiguration("/**",config);

        //3.返回corsFilter
        return new CorsFilter(configurationSource);
    }*/
}

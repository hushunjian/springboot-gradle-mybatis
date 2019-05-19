package com.hushunjian.gradle.mybatis.configuration;

import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.HashSet;

/**
 * @author hushunjian
 */
@Configuration
public class SwaggerConfig {
    @Bean
    public Docket documentation(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.hushunjian.gradle.mybatis.controller"))
                .build()
                .protocols(new HashSet<>(Lists.newArrayList("http")))
                .pathMapping("/")
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("服务API")
                .description("服务端后台接口说明文档")
                .version("1.0")
                .build();
    }
}

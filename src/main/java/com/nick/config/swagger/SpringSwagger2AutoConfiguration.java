package com.nick.config.swagger;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.service.Contact;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.context.annotation.Bean;

/**
 * 可视化接口测试Web界面配置
 * Created by Nick on 2017/01/05.
 * 参考地址
 * http://www.baeldung.com/swagger-2-documentation-for-spring-rest-api
 */
@Configuration
@EnableSwagger2
public class SpringSwagger2AutoConfiguration {

    @Bean
    public Docket CommonServiceSwaggerConfig() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .useDefaultResponseMessages(false)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.nick.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfo("HNAStore-CommonService",
                "Common Service which contains the basic service interface, such as menus, console home",
                "v1.0",
                "NO",
                new Contact(
                        "",
                        "",
                        ""),
                null,
                "");
    }
}


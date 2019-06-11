package com.kamanon;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.extras.java8time.dialect.Java8TimeDialect;

/** ThymeleafでJava8のDate and Time APIクラスを利用可能にするための設定*/
@Configuration
public class ThymeleafConfig {

    @Bean
    public Java8TimeDialect java8TimeDialect() {
        return new Java8TimeDialect();
    }
}

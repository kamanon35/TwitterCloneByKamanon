package com.kamanon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * 各種マッパーのDI設定
 * */
@Configuration
@MapperScan("com.kamanon.domain.model.mybatis")
public class MapperConfig {
}

package com.codeliu.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.codeliu.mapper"})
public class MybatisConfig {
    
}

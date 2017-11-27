package com.lowen.configure;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * mybatis 扫描dao路径配置
 *
 */
@Configuration
public class MapperScanConfig {

	@Bean
	public MapperScannerConfigurer mapperScannerConfigurer() {
		MapperScannerConfigurer mapperScan = new MapperScannerConfigurer();
		mapperScan.setSqlSessionFactoryBeanName("sqlSessionFactory");
		mapperScan.setBasePackage("com.lowen.bus.dao");
		return mapperScan;
	}
}

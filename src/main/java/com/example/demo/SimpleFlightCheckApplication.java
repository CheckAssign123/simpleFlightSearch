package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import com.example.demo.helper.ResultInfo;
import com.example.demo.service.FlightInfoService;
import com.example.demo.service.FlightInfoServiceImpl;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class SimpleFlightCheckApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleFlightCheckApplication.class, args);
	}

	@Bean
	public FlightInfoService flightService() {
		return new FlightInfoServiceImpl();
	}
	
	@Bean
	@Scope("prototype")
	public ResultInfo resultInfo() {
		return new ResultInfo();
	}
}

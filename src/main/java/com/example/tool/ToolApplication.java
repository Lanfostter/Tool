package com.example.tool;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.tool.Listener.ApplicationStartupListener;


@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class ToolApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ToolApplication.class, args);
		ApplicationStartupListener applicationStartupListener = new ApplicationStartupListener();
		applicationStartupListener.onApplicationEvent(null);
	}

}

package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;

import com.foo.User;

import java.util.Arrays;

@ComponentScan ({"com.example", "com.foo"})
//@ContextConfiguration({"classpath*:resources/application.yml"})
@SpringBootApplication
@EnableConfigurationProperties
public class SpringBeansDemoApplication {

	@Bean
	public User user () {
		return new User ("Arild", "Birkeland");
		
	};
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBeansDemoApplication.class, args);

		String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String name : beanNames) {
            System.out.println(name);
        }
        
        System.out.println (ctx.getBean("user").toString());
        
        
        MyAppConfig config = (MyAppConfig) ctx.getBean("myAppConfig");
        System.out.println (config.toString());
        
	}
}

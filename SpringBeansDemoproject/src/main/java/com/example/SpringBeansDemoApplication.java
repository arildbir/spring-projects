package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.foo.User;

import java.util.Arrays;

@ComponentScan ({"com.example", "com.foo"})
@SpringBootApplication
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
        
	}
}

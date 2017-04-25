package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foo.NotificationService;

@RestController
public class PageController {
	
	
	private NotificationService notificationService;
	
	@Value ("${pageController.msg}")
	private String pageControllerMsg;
	
	@Value ("${my.secret}")
	private String mySecret;
	
	//denne kan også lages som en konstruktør. Da brukes også Autowired
	@Autowired
	public void setNotificationService (NotificationService notificationService) {
		this.notificationService = notificationService;
	}
	
	@RequestMapping
	public String home () {
		//return notificationService.toString();
		//return pageControllerMsg;
		return mySecret;
	}
}

package com.arildbir;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class PageController {


    //private NotificationService notificationService;

    //@Value ("${pageController.msg}")
    //private String pageControllerMsg;

   /* @Value ("${my.secret}")
    private String mySecret;

    @Value ("${app.description}")
    private String appName;

    @Value ("${spring.profiles.active}")
    private String enviroment;

    */

    @Value ("${yet-another-markup-language.msg}")
    private String msg;

    //denne kan også lages som en konstruktør. Da brukes også Autowired
   // @Autowired
   // public void setNotificationService (NotificationService notificationService) {
   //     this.notificationService = notificationService;
    //}

    //@RequestMapping
    //@Controller
    public String home () {
        //return notificationService.toString();
        //return pageControllerMsg;
        //return mySecret;
        //return appName;
        //return enviroment;
        return msg;
    }
}

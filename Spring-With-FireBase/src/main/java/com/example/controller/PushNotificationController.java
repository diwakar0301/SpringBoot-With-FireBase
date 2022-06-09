package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dtos.DirectNotification;
import com.example.service.FirebaseCloudMessagingService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/")
public class PushNotificationController {

	@Autowired
	FirebaseCloudMessagingService FCM;
	
	@PostMapping("notification")
	public void sendFirstNotification(@RequestBody DirectNotification notification) {
		System.out.println(notification.getMessage());
		FCM.sendNotificationToTarget(notification);
		
	}
	
	@GetMapping("hello")
	void hello() {
		System.out.println("get mapping hello method");
	}
}

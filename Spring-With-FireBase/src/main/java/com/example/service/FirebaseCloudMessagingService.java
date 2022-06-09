package com.example.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.dtos.DirectNotification;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.Message;
import com.google.firebase.messaging.WebpushConfig;
import com.google.firebase.messaging.WebpushNotification;

@Service
public class FirebaseCloudMessagingService {

	public void sendNotificationToTarget(DirectNotification notification){
	       var message = Message.builder()
	                // Set the configuration for our web notification
	               .setWebpushConfig(
	                       // Create and pass a WebpushConfig object setting the notification
	                       WebpushConfig.builder()
	                               .setNotification(
	                                       // Create and pass a web notification object with the specified title, body, and icon URL 
	                                       WebpushNotification.builder()
	                                               .setTitle(notification.getTitle())
	                                               .setBody(notification.getMessage())
	                                               .setIcon("https://assets.mapquestapi.com/icon/v2/circle@2x.png")
	                                               .build()
	                               ).build()
	               )
	                // Specify the user to send it to in the form of their token  
	               .setToken(notification.getTarget())
	               .build();
	       FirebaseMessaging.getInstance().sendAsync(message);
	   }
	
}

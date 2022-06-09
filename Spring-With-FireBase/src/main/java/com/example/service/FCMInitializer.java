package com.example.service;

import java.io.FileInputStream;
import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

@Service
public class FCMInitializer {

	@Value("${app.firebase-config-file}")
	String firebaseConfigPath;
	
	
	
	@PostConstruct
	//@Bean
	public void initialize(){
	   // Get our credentials to authorize this Spring Boot application.
	   try {
		 
		System.out.println(firebaseConfigPath);
		   FirebaseOptions options = new FirebaseOptions.Builder()
                   .setCredentials(GoogleCredentials.fromStream(new ClassPathResource(firebaseConfigPath).getInputStream()))
                 //  .setDatabaseUrl(firebaseConfigPath)
                   .build();
		   
		   if (FirebaseApp.getApps().isEmpty()) {
               FirebaseApp.initializeApp(options);
              
           }
        
	       
	   } catch (Exception e) {
		
	      System.out.println(e);
	   }

	}
	
}


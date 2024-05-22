package com.enduser.config;

import com.enduser.Constants.AppConstants;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {

    @KafkaListener(topics = AppConstants.LOCATION_UPDATE_TOPIC,groupId = AppConstants.GROUP_ID)  //listens to topic specified
    public void updatedLocation(String value){
     System.out.println(value);
    }
}

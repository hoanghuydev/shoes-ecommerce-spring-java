package com.shoe.config;

import com.cloudinary.Cloudinary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class WebConfig {
    @Bean
    public Cloudinary getCloudinary(){
        Map<String, Object> config = new HashMap<String, Object>();
        config.put("cloud_name", "your_cloud");
        config.put("api_key", "your_api_key");
        config.put("api_secret", "your_api_secret_key");
        config.put("secure", true);
        return new Cloudinary(config);
    }

}

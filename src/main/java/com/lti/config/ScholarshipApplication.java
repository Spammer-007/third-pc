package com.lti.config;



import java.util.concurrent.TimeUnit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ScholarshipApplication implements WebMvcConfigurer {
	
	

	public static void main(String[] args) {
		SpringApplication.run(ScholarshipApplication.class, args);
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {

	    // Register resource handler for images
	    registry.addResourceHandler("/images/**").addResourceLocations("/WEB-INF/images/")
	            .setCacheControl(CacheControl.maxAge(2, TimeUnit.HOURS).cachePublic());
	    
	    registry.addResourceHandler("/css/**").addResourceLocations("/WEB-INF/css/")
        .setCacheControl(CacheControl.maxAge(2, TimeUnit.HOURS).cachePublic());
	}


}


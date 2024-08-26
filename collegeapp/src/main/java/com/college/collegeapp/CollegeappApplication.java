package com.college.collegeapp;

import com.college.collegeapp.configuration.AppConfig;
import com.college.collegeapp.service.CourseService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CollegeappApplication {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		CourseService courseService = context.getBean(CourseService.class);
		courseService.displayRecommendations();
	}

}

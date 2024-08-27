package com.college.collegeapp.configuration;

import com.college.collegeapp.recommender.CourseRecommender;
import com.college.collegeapp.recommender.FirstCourseRecommender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.college.collegeapp", "com.explicitcollege"})
public class AppConfig {

    @Bean
    public CourseRecommender firstCourseRecommender() {
        return new FirstCourseRecommender();
    }
}
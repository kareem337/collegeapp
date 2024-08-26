package com.college.collegeapp.configuration;

import com.college.collegeapp.recommender.CourseRecommender;
import com.college.collegeapp.recommender.FirstCourseRecommender;
import com.college.collegeapp.recommender.SecondCourseRecommender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.beans.factory.annotation.Qualifier;

@Configuration
@ComponentScan(basePackages = "com.college.collegeapp")
public class AppConfig {

    @Bean
    public CourseRecommender firstCourseRecommender() {
        return new FirstCourseRecommender();
    }

    @Bean
    @Qualifier("second")
    public CourseRecommender secondCourseRecommender() {
        return new SecondCourseRecommender();
    }
}
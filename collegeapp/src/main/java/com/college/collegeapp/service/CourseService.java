package com.college.collegeapp.service;

import com.college.collegeapp.recommender.CourseRecommender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    //name should match the bean name
    @Autowired
    private CourseRecommender secondCourseRecommender;

    public void displayRecommendations() {
        System.out.println(secondCourseRecommender.recommendCourses());
    }
}


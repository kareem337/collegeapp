package com.college.collegeapp.service;

import com.college.collegeapp.recommender.CourseRecommender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    private final CourseRecommender courseRecommender;

    @Autowired
    public CourseService(@Qualifier("second") CourseRecommender courseRecommender) {
        this.courseRecommender = courseRecommender;
    }

    public void displayRecommendations() {
        System.out.println(courseRecommender.recommendCourses());
    }
}


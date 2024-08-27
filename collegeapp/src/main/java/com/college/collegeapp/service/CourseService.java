package com.college.collegeapp.service;

import com.college.collegeapp.recommender.CourseRecommender;
import com.explicitcollege.explicitcollegeapp.recommender.ExplicitCourseRecommender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    private final ExplicitCourseRecommender courseRecommender;

    @Autowired
    public CourseService(@Qualifier("explicit") ExplicitCourseRecommender courseRecommender) {
        this.courseRecommender = courseRecommender;
    }


    public void displayRecommendations() {
        System.out.println(courseRecommender.recommendExplicitCourses());
    }
}



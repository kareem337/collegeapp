package com.college.collegeapp.service;

import com.college.collegeapp.recommender.CourseRecommender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    private CourseRecommender courseRecommender;

    @Autowired
    @Qualifier("second")
    public void setCourseRecommender(CourseRecommender courseRecommender) {
        this.courseRecommender = courseRecommender;
    }

    public void displayRecommendations() {
        System.out.println(courseRecommender.recommendCourses());
    }
}


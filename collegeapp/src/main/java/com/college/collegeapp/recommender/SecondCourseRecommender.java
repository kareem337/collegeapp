package com.college.collegeapp.recommender;

import java.util.Arrays;
import java.util.List;

public class SecondCourseRecommender implements CourseRecommender {
    @Override
    public List<String> recommendCourses() {
        return Arrays.asList("Second Course 1", "Second Course 2", "Second Course 3");
    }
}
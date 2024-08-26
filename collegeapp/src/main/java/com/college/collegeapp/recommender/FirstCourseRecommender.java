package com.college.collegeapp.recommender;

import java.util.Arrays;
import java.util.List;

public class FirstCourseRecommender implements CourseRecommender {
    @Override
    public List<String> recommendCourses() {
        return Arrays.asList("First Course 1", "First Course 2", "First Course 3");
    }
}

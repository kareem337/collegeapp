package com.college.collegeapp.service;

import com.college.collegeapp.model.Course;
import com.college.collegeapp.recommender.CourseRecommender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    private final JdbcTemplate jdbcTemplate;

    public CourseService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void addCourse(Course course) {
        String sql = "INSERT INTO course (name, description, credit) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, course.getName(), course.getDescription(), course.getCredit());
    }

    public void updateCourse(Course course) {
        String sql = "UPDATE course SET name=?, description=?, credit=? WHERE course_id=?";
        jdbcTemplate.update(sql, course.getName(), course.getDescription(), course.getCredit(), course.getCourse_id());
    }


    public Course viewCourse(int courseId) {
        String sql = "SELECT * FROM course WHERE course_id=?";
        return jdbcTemplate.queryForObject(sql, new Object[]{courseId}, (rs, rowNum) ->
                new Course(
                        rs.getInt("course_id"),
                        rs.getString("name"),
                        rs.getString("description"),
                        rs.getInt("credit")

                )
        );
    }


    public void deleteCourse(int courseId) {
        String sql = "DELETE FROM course WHERE course_id=?";
        jdbcTemplate.update(sql, courseId);
    }

}


package com.college.collegeapp;

import com.college.collegeapp.configuration.AppConfig;
import com.college.collegeapp.model.Course;
import com.college.collegeapp.service.CourseService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CollegeappApplication {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		CourseService courseService = context.getBean(CourseService.class);

		testCrudOperations(courseService);
	}
	private static void testCrudOperations(CourseService courseService) {

		Course courseAdded = new Course(98,"jdbc","Intro to JDBC",3,1);
		courseService.addCourse(courseAdded);
		System.out.println("Course added.");

		// View the course (assuming id 1 for demonstration)
		Course course = courseService.viewCourse(1);
		System.out.println("Course Details: " + course);


		Course courseUpdated = new Course(22,"Updated JDBC","Intro to JDBC",3,1);
		courseService.updateCourse(courseUpdated);
		System.out.println("Course updated.");

		// View the updated course
		course = courseService.viewCourse(20);
		System.out.println("Updated Course Details: " + course);


		courseService.deleteCourse(21);
		System.out.println("Course deleted.");

		// Try to view the deleted course
		try {
			course = courseService.viewCourse(21);
			System.out.println("Course Details after Deletion: " + course);
		} catch (Exception e) {
			System.out.println("Course not found, as expected.");
		}

	}
}

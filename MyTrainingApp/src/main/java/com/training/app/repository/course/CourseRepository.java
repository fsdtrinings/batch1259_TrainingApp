package com.training.app.repository.course;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.app.entity.Course;

public interface CourseRepository extends JpaRepository<Course,Integer>{

}

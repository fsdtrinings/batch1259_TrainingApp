package com.training.app.util;

import org.springframework.stereotype.Component;

import com.training.app.dto.CourseAdminResponseDTO;
import com.training.app.entity.Course;

@Component
public class CourseDTOConvertor {

	public CourseAdminResponseDTO getCourseAdminResponseDTO(Course course)
	{
		CourseAdminResponseDTO dto = new CourseAdminResponseDTO();
		dto.setCourseId(course.getCourseId());
		dto.setCourseName(course.getCourseName());
		dto.setMsg("Course Saved");
		return dto;
	}
}

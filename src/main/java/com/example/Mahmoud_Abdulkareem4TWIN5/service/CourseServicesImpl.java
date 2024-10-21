package com.example.Mahmoud_Abdulkareem4TWIN5.service;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import com.example.Mahmoud_Abdulkareem4TWIN5.Entities.Course;
import com.example.Mahmoud_Abdulkareem4TWIN5.Repositories.ICourseRepository;

import java.util.List;

@Primary
@RequiredArgsConstructor
@Service
public class CourseServicesImpl implements ICourseService{
    private final ICourseRepository courseRepository;
    public Course addCourse(Course course){
        return courseRepository.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return null;
    }

    @Override
    public Course retriveCourse(Long numCourse) {
        return null;
    }

    @Override
    public List<Course> retriveAll() {
        return null;
    }

    @Override
    public void removeCours(Long numCourse) {

    }
}

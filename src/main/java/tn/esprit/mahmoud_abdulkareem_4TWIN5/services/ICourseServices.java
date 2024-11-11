package tn.esprit.mahmoud_abdulkareem_4TWIN5.services;

import tn.esprit.mahmoud_abdulkareem_4TWIN5.entities.Course;


import java.util.List;

public interface ICourseServices {

    Course addCourse(Course course);
    Course updateCourse(Course course);
    Course retrieveCourse(Long numCourse);
    List<Course> retrieveAll();
    void removeCourse(Long numCourse);
}

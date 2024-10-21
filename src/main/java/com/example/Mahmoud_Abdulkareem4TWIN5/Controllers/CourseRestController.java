package com.example.Mahmoud_Abdulkareem4TWIN5.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.Mahmoud_Abdulkareem4TWIN5.Entities.*;
import com.example.Mahmoud_Abdulkareem4TWIN5.service.;


@RequiredArgsConstructor
@RequestMapping("Course")
@RestController
public class CourseRestController {
    private final ICourseService courseServices;
    @PostMapping("/add")
    public Course saveCourse(@RequestBody Course course){
        return courseServices.addCourse(course);
    }

    @GetMapping("/get/{numCourse}")
    public Course getCourse(@PathVariable Long numCourse){
        return courseServices.retriveCourse(numCourse);

    }
}

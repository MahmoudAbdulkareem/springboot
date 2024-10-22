package tn.esprit.Mahmoud_Abdulkareem_4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Mahmoud_Abdulkareem_4twin5.entities.Course;
import tn.esprit.Mahmoud_Abdulkareem_4twin5.entities.Instructor;
import tn.esprit.Mahmoud_Abdulkareem_4twin5.service.IInstructorService;

@RequiredArgsConstructor
@RequestMapping("Instructor")
@RestController
public class InstructorRestController {
    private final IInstructorService instructorServices;
    @PostMapping("/add")
    public Instructor saveInstructor(@RequestBody Instructor instructor){
        return instructorServices.addInstructor(instructor);
    }
  @PutMapping("/update")
  public Instructor updateInstructor(@RequestBody Instructor instructor){
    return instructorServices.updateInstructor(instructor);
  }
  @DeleteMapping("/delete/{numInstructor}")
  public Instructor removeInstructor(@PathVariable long numInstructor) {
    return instructorServices.removeInstructor(numInstructor);
  }

  @GetMapping("/get/{numInstructor}")
    public Instructor getInstructor(@PathVariable Long numInstructor){
        return instructorServices.retriveInstructor(numInstructor);

    }
}

package tn.esprit.mahmoud_abdulkareem_4TWIN5.services;

import tn.esprit.mahmoud_abdulkareem_4TWIN5.entities.Instructor;
import java.util.List;

public interface IInstructorServices {

    Instructor addInstructor(Instructor instructor);
    Instructor updateInstructor(Instructor instructor);
    Instructor retrieveInstructor(Long numInstructor);
    List<Instructor> retrieveAll();
    Instructor removeInstructor(Long numInstructor);
}

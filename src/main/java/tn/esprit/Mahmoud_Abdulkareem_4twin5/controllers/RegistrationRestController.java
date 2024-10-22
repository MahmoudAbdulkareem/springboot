package tn.esprit.Mahmoud_Abdulkareem_4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Mahmoud_Abdulkareem_4twin5.entities.Course;
import tn.esprit.Mahmoud_Abdulkareem_4twin5.entities.Registration;
import tn.esprit.Mahmoud_Abdulkareem_4twin5.service.IPisteService;
import tn.esprit.Mahmoud_Abdulkareem_4twin5.service.IRegistrationService;


@RequiredArgsConstructor
@RequestMapping("Registration")
@RestController
public class RegistrationRestController {
    private final IRegistrationService registrationServices;
    @PostMapping("/add")
    public Registration saveRegistration(@RequestBody Registration registration){
        return registrationServices.addRegistration(registration);
    }
  @PutMapping("/update")
  public Registration updateRegistration(@RequestBody Registration registration){
    return registrationServices.updateRegistration(registration);
  }


  @DeleteMapping("/delete/{numPiste}")
  public Registration removeRegistration(@PathVariable Long numRegistration){
   return registrationServices.removeRegistration(numRegistration);
  }
    @GetMapping("/get/{numRegistration}")
    public Registration getRegistration(@PathVariable Long numRegistration){
        return registrationServices.retriveRegistration(numRegistration);

    }
}

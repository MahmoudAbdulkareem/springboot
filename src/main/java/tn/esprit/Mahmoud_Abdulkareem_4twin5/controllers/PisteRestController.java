package tn.esprit.Mahmoud_Abdulkareem_4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Mahmoud_Abdulkareem_4twin5.entities.Course;
import tn.esprit.Mahmoud_Abdulkareem_4twin5.entities.Instructor;
import tn.esprit.Mahmoud_Abdulkareem_4twin5.entities.Piste;
import tn.esprit.Mahmoud_Abdulkareem_4twin5.service.IPisteService;


@RequiredArgsConstructor
@RequestMapping("Piste")
@RestController
public class PisteRestController {
    private final IPisteService pisteServices;
    @PostMapping("/add")
    public Piste savePiste(@RequestBody Piste piste){
        return pisteServices.addPiste(piste);
    }

  @PutMapping("/update")
  public Piste updatePiste(@RequestBody Piste piste){
    return pisteServices.updatePiste(piste);
  }

  @DeleteMapping("/delete/{numPiste}")
  public void removePiste(@PathVariable Long numPiste) {
    pisteServices.removePiste(numPiste);
  }

  @GetMapping("/get/{numPiste}")
    public Piste getPiste(@PathVariable Long numPiste){
        return pisteServices.retrivePiste(numPiste);

    }
}

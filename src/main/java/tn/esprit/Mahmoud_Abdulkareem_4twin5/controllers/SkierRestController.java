package tn.esprit.Mahmoud_Abdulkareem_4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Mahmoud_Abdulkareem_4twin5.entities.Course;
import tn.esprit.Mahmoud_Abdulkareem_4twin5.entities.Skier;
import tn.esprit.Mahmoud_Abdulkareem_4twin5.service.IPisteService;
import tn.esprit.Mahmoud_Abdulkareem_4twin5.service.ISkierServices;

@RequiredArgsConstructor
@RequestMapping("skier")
@RestController
public class SkierRestController {
    private final ISkierServices skierServices;
  @PostMapping(value = "/add", consumes = {"application/x-www-form-urlencoded"})
    public Skier saveSkier(@RequestBody Skier skier){
        return skierServices.addSkier(skier);
    }
  @PutMapping("/update")
  public Skier updateSkier(@RequestBody Skier skier){
    return skierServices.updateSkier(skier);
  }

    @GetMapping("/get/{numSkier}")
    public Skier getSkier(@PathVariable Long numSkier){
        return skierServices.retriveSkier(numSkier);

    }

  @DeleteMapping("/delete/{numSkier}")
  public void removeSkier(@PathVariable Long numSkier) {
      skierServices.removeSkier(numSkier);
  }

  @PutMapping("/assignToPiste/{numSkier}/{numPiste}")
  public void assignSkier(@PathVariable Long numSkier, @PathVariable Long numPiste){
    skierServices.assignSkier(numSkier, numPiste);
  }


}

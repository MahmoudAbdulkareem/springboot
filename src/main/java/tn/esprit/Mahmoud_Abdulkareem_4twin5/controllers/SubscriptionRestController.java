package tn.esprit.Mahmoud_Abdulkareem_4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Mahmoud_Abdulkareem_4twin5.entities.Course;
import tn.esprit.Mahmoud_Abdulkareem_4twin5.entities.Subscription;
import tn.esprit.Mahmoud_Abdulkareem_4twin5.service.IPisteService;
import tn.esprit.Mahmoud_Abdulkareem_4twin5.service.ISubscriptionService;

@RequiredArgsConstructor
@RequestMapping("Subscription")
@RestController
public class SubscriptionRestController {
    private final ISubscriptionService subscriptionServices;
    @PostMapping("/add")
    public Subscription saveSubscription(@RequestBody Subscription subscription){
        return subscriptionServices.addSubscription(subscription);
    }

  @PutMapping("/update")
  public Subscription updateSubscription(@RequestBody Subscription subscription){
    return subscriptionServices.updateSubscription(subscription);
  }
    @GetMapping("/get/{numSubscription}")
    public Subscription getSubscription(@PathVariable Long numSubscription){
        return subscriptionServices.retriveSubscription(numSubscription);

    }



  @DeleteMapping("/delete/{numSubscription}")
  public Subscription removeSubscription(@PathVariable Long numSubscription) {
    return subscriptionServices.removeSubscription(numSubscription);
  }

}

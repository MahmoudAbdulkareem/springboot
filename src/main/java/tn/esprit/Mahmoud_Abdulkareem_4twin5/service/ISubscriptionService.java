package tn.esprit.Mahmoud_Abdulkareem_4twin5.service;

import tn.esprit.Mahmoud_Abdulkareem_4twin5.entities.Subscription;

import java.util.List;

public interface ISubscriptionService {
    Subscription addSubscription(Subscription subscription);
    Subscription updateSubscription(Subscription subscription);
    Subscription retriveSubscription(Long subscription);
    List<Subscription> retriveAll();
    Subscription removeSubscription(Long numSubscription);
}

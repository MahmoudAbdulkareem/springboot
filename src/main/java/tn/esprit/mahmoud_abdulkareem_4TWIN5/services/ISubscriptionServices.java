package tn.esprit.mahmoud_abdulkareem_4TWIN5.services;
import tn.esprit.mahmoud_abdulkareem_4TWIN5.entities.Subscription;
import tn.esprit.mahmoud_abdulkareem_4TWIN5.entities.TypeSubscription;

import java.util.List;
import java.util.Set;

public interface ISubscriptionServices {

  Subscription addSubscription(Subscription subscription);
  Subscription updateSubscription(Subscription subscription);
  Subscription retrieveSubscription(Long numSub);
  List<Subscription> retrieveAll();
  void removeSubscription(Long numSub);
  Set<Subscription> getSubscriptionByType(TypeSubscription type);
}

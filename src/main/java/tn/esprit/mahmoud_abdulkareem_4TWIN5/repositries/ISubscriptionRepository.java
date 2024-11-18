package tn.esprit.mahmoud_abdulkareem_4TWIN5.repositries;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.mahmoud_abdulkareem_4TWIN5.entities.Subscription;
import tn.esprit.mahmoud_abdulkareem_4TWIN5.entities.TypeSubscription;

import java.util.Set;

public interface ISubscriptionRepository extends CrudRepository<Subscription , Long> {
  Set<Subscription> findByTypeSub(TypeSubscription type);
}

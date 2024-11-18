package tn.esprit.mahmoud_abdulkareem_4TWIN5.repositries;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.mahmoud_abdulkareem_4TWIN5.entities.Skier;
import tn.esprit.mahmoud_abdulkareem_4TWIN5.entities.TypeSubscription;

import java.time.LocalDate;

import java.time.LocalDate;
import java.util.List;


public interface ISkierRepository extends CrudRepository<Skier, Long> {

  Skier findByFirstNameAndLastName(String firstName, String lastName);
  Skier findByBirthDate(LocalDate birthDate);
  List<Skier> findBySubscription_TypeSub(TypeSubscription subscription_typeSub);
}

package tn.esprit.Mahmoud_Abdulkareem_4twin5.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.Mahmoud_Abdulkareem_4twin5.entities.Skier;


//3anna CrudRepository w PagingAndSortingRepository w JpaRepository
public interface ISkierRepository extends CrudRepository <Skier, Long>  {

}

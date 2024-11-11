package tn.esprit.mahmoud_abdulkareem_4TWIN5.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.mahmoud_abdulkareem_4TWIN5.entities.Piste;
import tn.esprit.mahmoud_abdulkareem_4TWIN5.entities.Registration;
import tn.esprit.mahmoud_abdulkareem_4TWIN5.entities.Skier;
import tn.esprit.mahmoud_abdulkareem_4TWIN5.entities.Subscription;
import tn.esprit.mahmoud_abdulkareem_4TWIN5.repositries.IPisteRepository;
import tn.esprit.mahmoud_abdulkareem_4TWIN5.repositries.IRegistrationRepository;
import tn.esprit.mahmoud_abdulkareem_4TWIN5.repositries.ISkierRepository;
import tn.esprit.mahmoud_abdulkareem_4TWIN5.repositries.ISubscriptionRepository;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Service
public class SkierServicesImpl implements ISkierServices{

    private final ISkierRepository skierRepository;
    private final IPisteRepository pisteRepository;
    private final ISubscriptionRepository subscriptionRepository;
    private final IRegistrationRepository registrationRepository;


    public Skier addSkier (Skier skier){
        Subscription subscription = skier.getSubscription();
        subscriptionRepository.save(subscription);
        skier.setSubscription(subscription);
        return skierRepository.save(skier);
    }

    @Override
    public Skier updateSkier(Skier skier) {
        return skierRepository.save(skier);
    }

    @Override
    public Skier retrieveSkier(Long numSkier) {
        return skierRepository.findById(numSkier).orElse(null);
    }

    @Override
    public List<Skier> retrieveAll() {
        return (List<Skier>) skierRepository.findAll();
    }

    @Override
    public void removeSkier(Long numSkier) {
        skierRepository.deleteById(numSkier);
    }

    @Override
    public void assignSkier(Long numSkier, Long numPiste) {
        Skier skier = skierRepository.findById(numSkier).orElse(null);
        Piste piste = pisteRepository.findById(numPiste).orElse(null);
        assert piste != null;
        piste.getSkiers().add(skier);
        pisteRepository.save(piste);
    }
    @Override
    public Skier getByFirstNameAndLastName(String firstName, String lastName) {
        return skierRepository.findByFirstNameAndLastName(firstName, lastName);
    }

    @Override
    public Skier getBybirthDate(LocalDate birthDate) {
        return skierRepository.findByBirthDate(birthDate);
    }
    @Override
     public Registration addRegistrationAndAssignToSkier(Registration registration, Long numSkier){
        Skier skier = skierRepository.findById(numSkier).orElse(null);
        registration.setSkier(skier);
        return registrationRepository.save(registration);
    }

}
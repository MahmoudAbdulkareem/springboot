package tn.esprit.Mahmoud_Abdulkareem_4twin5.service;

import tn.esprit.Mahmoud_Abdulkareem_4twin5.entities.Registration;

import java.util.List;

public interface IRegistrationService {
    Registration addRegistration(Registration piste);
    Registration updateRegistration(Registration registration);
    Registration retriveRegistration(Long numRegistration);
    List<Registration> retriveAll();
    Registration removeRegistration(Long numRegistration);
}

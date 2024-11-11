package tn.esprit.mahmoud_abdulkareem_4TWIN5.services;
import tn.esprit.mahmoud_abdulkareem_4TWIN5.entities.Piste;

import java.util.List;

public interface IPisteServices {

    Piste addPiste(Piste piste);
    Piste updatePiste(Piste piste);
    Piste retrievePiste(Long numPiste);
    List<Piste> retrieveAll();
}

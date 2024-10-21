package com.example.Mahmoud_Abdulkareem4TWIN5.Services;
import com.example.Mahmoud_Abdulkareem4TWIN5.Entities.*;
import com.example.Mahmoud_Abdulkareem4TWIN5.Repositories.ISkierRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequiredArgsConstructor
@Service
@RestController
public class SkierServiceImpl implements ISkierServices {

  private final ISkierRepository skierRepository;


@Override
public Skier addSkier(Skier skier)
  {
    return skierRepository.save(skier);
}

  public Skier updateSkier(Skier skier)
  {
    return skierRepository.save(skier);}

  @Override
  public Skier retrieveSkier(Long numSkier) {
    return ;
  }

  @Override
  public List<Skier> retrieveAll() {
    return null;
  }

  @Override
  public void removeSkier(Long numSkier) {

  }
}




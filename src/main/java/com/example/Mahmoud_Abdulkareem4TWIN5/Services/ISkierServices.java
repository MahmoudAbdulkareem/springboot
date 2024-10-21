package com.example.Mahmoud_Abdulkareem4TWIN5.Services;

import com.example.Mahmoud_Abdulkareem4TWIN5.Entities.Skier;

import java.util.List;

public interface ISkierServices {
  Skier addSkier(Skier skier);
  Skier updateSkier(Skier skier);
  Skier retrieveSkier(Long numSkier);
  List<Skier> retrieveAll();
  void removeSkier(Long numSkier);
}

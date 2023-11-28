package com.betrybe.agrix.service;

import com.betrybe.agrix.exceptions.src.main.java.com.betrybe.agrix.exceptions.FarmNotFoundException;
import com.betrybe.agrix.model.entities.CropModel;
import com.betrybe.agrix.model.repositories.CropRepository;
import java.util.List;
import org.springframework.stereotype.Service;


/**
 * Crop service.
 */
@Service
public class CropService {
  private final CropRepository cropRepository;

  public CropService(CropRepository cropRepository) {
    this.cropRepository = cropRepository;
  }
  
  public List<CropModel> getAll() {
    return cropRepository.findAll();
  }

  /**
   * Get id crops.
   */
  public CropModel getById(Long id) {
    return cropRepository.findById(id)
            .orElseThrow(FarmNotFoundException::new);
  }
}

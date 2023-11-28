package com.betrybe.agrix.controller.dto;

import com.betrybe.agrix.model.entities.CropModel;
import java.time.LocalDate;

/**
 * DTO Crop.
 */
public record CropDto(
        Long id, String name, Double plantedArea, Long farmId,
        LocalDate plantedDate, LocalDate harvestDate) {
  public CropModel toCrop() {
    return new CropModel(id, name, plantedArea, null, plantedDate, harvestDate, null);
  }

  /**
   * DTO Crop from model.
   */
  public static CropDto fromCropModel(CropModel cropModel, Long farmId) {
    return new CropDto(
            cropModel.getId(), cropModel.getName(), cropModel.getPlantedArea(),
            farmId, cropModel.getPlantedDate(), cropModel.getHarvestDate()
    );
  }
}


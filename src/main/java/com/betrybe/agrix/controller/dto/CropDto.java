package com.betrybe.agrix.controller.dto;

import com.betrybe.agrix.model.entities.CropModel;

/**
 * DTO Crop.
 */
public record CropDto(Long id, String name, Double plantedArea, Long farmId) {
  public CropModel toCrop() {
    return new CropModel(id, name, plantedArea, null);
  }

  public static CropDto fromCropModel(CropModel cropModel, Long farmId) {
    return new CropDto(cropModel.getId(), cropModel.getName(), cropModel.getPlantedArea(), farmId);
  }
}

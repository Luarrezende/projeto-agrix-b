package com.betrybe.agrix.controller.dto;

/**
  * crops dto.
  */
public record CropDtos(Long id, String name, Long farmId, Double plantedArea) {
}

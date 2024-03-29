package com.betrybe.agrix.controller.dto;

import com.betrybe.agrix.model.entities.Fertilizer;

/**
 * DTO fertilizer.
 */
public record FertilizerDto(Long id, String name,
    String brand, String composition) {
      
  public Fertilizer toEntity() {
    return new Fertilizer(id, name, brand, composition, null);
  }

}
package com.betrybe.agrix.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * Entity Crop.
 */
@Data
@Entity
@Table(name = "crops")
public class CropModel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;

  @Column(name = "planted_area")
  private Double plantedArea;

  @ManyToOne
  @JoinColumn(name = "farm_id")
  private FarmModel farmModel;

  public CropModel() {
  }

  /**
   * Constructor com coisas.
   */
  public CropModel(Long id, String name, Double plantedArea, FarmModel farmModel) {
    this.id = id;
    this.name = name;
    this.plantedArea = plantedArea;
    this.farmModel = farmModel;
  }
}
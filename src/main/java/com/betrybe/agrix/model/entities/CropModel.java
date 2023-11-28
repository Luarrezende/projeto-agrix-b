package com.betrybe.agrix.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.List;
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

  @Column(name = "planted_date")
  private LocalDate plantedDate;

  @Column(name = "harvest_date")
  private LocalDate harvestDate;

  @ManyToMany
  @JoinTable(
      name = "crop_fertilizer",
      joinColumns = @JoinColumn(name = "fertilizer_id"),
      inverseJoinColumns = @JoinColumn(name = "crop_id")
  )
  private List<Fertilizer> fertilizer;

  public CropModel() {
  }

  /**
   * Constructor com coisas.
   */
  public CropModel(Long id, String name, Double plantedArea, FarmModel farmModel,
      LocalDate plantedDate, LocalDate harvestDate, List<Fertilizer> fertilizer) {
    this.id = id;
    this.name = name;
    this.plantedArea = plantedArea;
    this.farmModel = farmModel;
    this.plantedDate = plantedDate;
    this.harvestDate = harvestDate;
    this.fertilizer = fertilizer;
  }
}
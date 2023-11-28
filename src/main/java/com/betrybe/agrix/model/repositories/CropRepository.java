package com.betrybe.agrix.model.repositories;

import com.betrybe.agrix.model.entities.CropModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository Crop.
 */
@Repository
public interface CropRepository extends JpaRepository<CropModel, Long> {
}

package com.apap.tutorial04.repository;

import com.apap.tutorial04.model.PilotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PilotDb extends JpaRepository<PilotModel,Long> {
    PilotModel findByLicenseNumber(String licenseNumber);
}

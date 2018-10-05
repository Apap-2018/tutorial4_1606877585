package com.apap.tutorial04.service;

import com.apap.tutorial04.model.PilotModel;
import com.apap.tutorial04.repository.PilotDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class PilotServiceImpl implements PilotService {
    @Autowired
    private PilotDb pilotDB;
    @Override
    public PilotModel getPilotDetailByLicenseNumber(String licenseNumber) {
        return pilotDB.findByLicenseNumber(licenseNumber);
    }

    @Override
    public void addPilot(PilotModel pilotModel) {
        pilotDB.save(pilotModel);

    }



    @Override
    public void delete(PilotModel pilotModel) {
        pilotDB.delete(pilotModel);
    }


}

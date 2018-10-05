package com.apap.tutorial04.service;

import com.apap.tutorial04.model.PilotModel;

public interface PilotService {
    PilotModel getPilotDetailByLicenseNumber(String licenseNumber);
    void addPilot(PilotModel pilotModel);
    void delete(PilotModel pilotModel);

}

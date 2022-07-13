package lk.rental.service;

import lk.rental.dto.VehicleDTO;

import java.util.List;

public interface VehicleService {
    void saveVehicle(VehicleDTO dto);
    void deleteVehicle(String id);
    void updateVehicle(VehicleDTO dto);
    VehicleDTO searchVehicle(String id);
    List<VehicleDTO> getAllVehicles();

}

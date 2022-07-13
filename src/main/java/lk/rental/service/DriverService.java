package lk.rental.service;

import lk.rental.dto.DriverDTO;

import java.util.List;

public interface DriverService {
    void saveDriver(DriverDTO dto);
    void deleteDriver(String id);
    void updateDriver(DriverDTO dto);
    DriverDTO searchDriver(String id);
    List<DriverDTO> getAllDriver();
}

package lk.rental.service;

import lk.rental.dto.ReturnCarDTO;

import java.util.List;

public interface ReturnCarService {
    void saveReturnCar(ReturnCarDTO dto);
    void deleteReturnCar(String id);
    void updateReturnCar(ReturnCarDTO dto);
    ReturnCarDTO searchReturnCar(String id);
    List<ReturnCarDTO> getAllReturnCars();
}

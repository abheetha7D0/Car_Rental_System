package lk.rental.service;

import lk.rental.dto.ReturnDetailsDTO;

import java.util.List;

public interface ReturnDetailsService {
    void saveReturnDetails(ReturnDetailsDTO dto);
    void deleteReturnDetails(String id);
    void updateReturnDetails(ReturnDetailsDTO dto);
    ReturnDetailsDTO searchReturnDetails(String id);
    List<ReturnDetailsDTO> getAllReturnDetails();
}

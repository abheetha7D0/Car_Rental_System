package lk.rental.service;

import lk.rental.dto.BookingDetailsDTO;

import java.util.List;

public interface BookingDetailsService {
    void saveBookingDetails(BookingDetailsDTO dto);
    void deleteBookingDetails(String id);
    void updateBookingDetails(BookingDetailsDTO dto);
    BookingDetailsDTO searchBookingDetails(String id);
    List<BookingDetailsDTO> getAllBookingDetails();
}

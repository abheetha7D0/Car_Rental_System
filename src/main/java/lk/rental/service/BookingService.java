package lk.rental.service;

import lk.rental.dto.BookingDTO;

import java.util.List;

public interface BookingService {
    void saveBooking(BookingDTO dto);
    void deleteBooking(String id);
    void updateBooking(BookingDTO dto);
    BookingDTO searchBooking(String id);
    List<BookingDTO> getAllBooking();
}

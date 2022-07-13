package lk.rental.service.impl;

import lk.rental.dto.BookingDTO;
import lk.rental.dto.CustomerDTO;
import lk.rental.entity.Booking;
import lk.rental.entity.Customer;
import lk.rental.repo.BookingRepo;
import lk.rental.repo.CustomerRepo;
import lk.rental.service.BookingService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BookingServiceImpl implements BookingService {
    @Autowired
    private BookingRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveBooking(BookingDTO dto) {
        if (!repo.existsById(dto.getId())) {
            repo.save(mapper.map(dto, Booking.class));
        } else {
            throw new RuntimeException("Booking Already Exist..!");
        }
    }

    @Override
    public void deleteBooking(String id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("Please check the Booking ID..!");
        }
    }

    @Override
    public void updateBooking(BookingDTO dto) {
        if (repo.existsById(dto.getId())) {
            repo.save(mapper.map(dto, Booking.class));
        } else {
            throw new RuntimeException("No Such Booking To Update..! Please Check the ID..!");
        }
    }

    @Override
    public BookingDTO searchBooking(String id) {
        if (repo.existsById(id)) {
            return mapper.map(repo.findById(id).get(), BookingDTO.class);
        } else {
            throw new RuntimeException("No Customer For " + id + " ..!");
        }
    }

    @Override
    public List<BookingDTO> getAllBooking() {
        return mapper.map(repo.findAll(), new TypeToken<List<BookingDTO>>() {
        }.getType());
    }
}

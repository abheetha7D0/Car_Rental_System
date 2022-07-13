package lk.rental.service.impl;

import lk.rental.dto.BookingDetailsDTO;
import lk.rental.entity.BookingDetails;
import lk.rental.repo.BookingDetailsRepo;
import lk.rental.service.BookingDetailsService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BookingDetailsServiceImpl implements BookingDetailsService {
    @Autowired
    private BookingDetailsRepo repo;

    @Autowired
    private ModelMapper mapper;


    @Override
    public void saveBookingDetails(BookingDetailsDTO dto) {
        if (!repo.existsById(dto.getBookingId())) {
            repo.save(mapper.map(dto, BookingDetails.class));
        } else {
            throw new RuntimeException("BookingDetails Already Exist..!");
        }
    }

    @Override
    public void deleteBookingDetails(String id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("Please check the BookingDetail ID...!");
        }
    }

    @Override
    public void updateBookingDetails(BookingDetailsDTO dto) {
        if (repo.existsById(dto.getBookingId())) {
            repo.save(mapper.map(dto, BookingDetails.class));
        } else {
            throw new RuntimeException("No Such BookingDetails To Update..! Please Check the ID..!");
        }
    }

    @Override
    public BookingDetailsDTO searchBookingDetails(String id) {
        if (repo.existsById(id)) {
            return mapper.map(repo.findById(id).get(), BookingDetailsDTO.class);
        } else {
            throw new RuntimeException("No Customer For " + id + " ..!");
        }
    }

    @Override
    public List<BookingDetailsDTO> getAllBookingDetails() {
        return mapper.map(repo.findAll(), new TypeToken<List<BookingDetailsDTO>>() {
        }.getType());
    }
}

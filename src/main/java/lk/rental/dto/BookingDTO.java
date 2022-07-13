package lk.rental.dto;


import lk.rental.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class BookingDTO {
    private String id;
    private String pickUpDate;
    private String returnDate;
    private String status;
    private CustomerDTO customer;
    List<BookingDetailsDTO> bookingDetails;
}

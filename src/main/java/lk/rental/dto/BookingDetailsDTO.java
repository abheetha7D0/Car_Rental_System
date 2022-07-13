package lk.rental.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class BookingDetailsDTO {
    private String bookingId;
    private String vNumber;
    private String driverId;
    private String loseDamage;
    private BookingDTO booking;
    private VehicleDTO vehicle;
    private DriverDTO driver;
}

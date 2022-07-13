package lk.rental.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class BookingCar_PK implements Serializable {
    private String bookingId;
    private String vNumber;
    private String driverId;
}

package lk.rental.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@ToString
@IdClass(BookingCar_PK.class)
public class BookingDetails {
    @Id
    private String bookingId;
    @Id
    private String vNumber;
    @Id
    private String driverId;


    private String loseDamage;

    @ManyToOne
    @JoinColumn(name = "bookingId",referencedColumnName = "id",insertable = false,updatable = false)
    private Booking booking;

    @ManyToOne
    @JoinColumn(name = "vNumber",referencedColumnName = "number",insertable = false,updatable = false)
    private Vehicle vehicle;

    @ManyToOne
    @JoinColumn(name = "driverId",referencedColumnName = "id",insertable = false,updatable = false)
    private Driver driver;
}

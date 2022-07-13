package lk.rental.entity;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@ToString
public class ReturnCar {
    @Id
    private String id;


    @ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH})
    @JoinColumn(name = "customerID",referencedColumnName = "id",nullable = false)
    private Customer customer;

    @ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH})
    @JoinColumn(name = "bookingId",referencedColumnName = "id",nullable = false)
    private Booking booking;

    @OneToMany(mappedBy = "returnCar",cascade = CascadeType.ALL)
    private List<ReturnDetails> returnDetails;
}

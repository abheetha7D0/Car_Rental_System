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
@IdClass(ReturnCar_PK.class)
public class ReturnDetails {
    @Id
    private String returnId;
    @Id
    private String vNumber;

    private String returnDate;
    private String lossDamageStatus;
    private double lossDamage;
    private double rentalFee;

    @ManyToOne
    @JoinColumn(name = "returnID",referencedColumnName = "id",insertable = false,updatable = false)
    private ReturnCar returnCar ;


    @ManyToOne
    @JoinColumn(name = "vNumber",referencedColumnName = "number",insertable = false,updatable = false)
    private Vehicle vehicle;
}

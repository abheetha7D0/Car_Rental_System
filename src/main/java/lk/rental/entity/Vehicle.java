package lk.rental.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@ToString
public class Vehicle {

    @Id
    private String number;
    private String type;
    private String brand;
    private String transmissionType;
    private int noOfPassenger;
    private String color;
    private double dailyRent; //Rs
    private double MonthlyRent; //Rs
    private double extraPerKMRent; //Rs
    private String status;

}

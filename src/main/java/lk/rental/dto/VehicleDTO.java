package lk.rental.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class VehicleDTO {
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

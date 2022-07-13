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
public class Customer {
    @Id
    private String id;
    private String name;
    private String address;
    private String contactNumber;
    private String email;
    private String password;
    private String licenseNumber;
    //private String licensePhoto;
    private String NICNumber;
    //private String NICPhoto;
    private String status; //available or not

}

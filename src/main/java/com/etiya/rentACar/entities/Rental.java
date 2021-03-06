package com.etiya.rentACar.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="rentals")
@Entity
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="rentDate")
    private LocalDate rentDate;

    @Column(name="returnDate")
    private LocalDate returnDate;

  


    @Column(name="totalPrice")
    private double totalPrice;

    @Column(name="cityFee")
    private double cityFee;

    @ManyToOne
    @JoinColumn(name="car_id")
    private Car car;

    @ManyToOne
    @JoinColumn(name="customer_id")
    private Customer customer;

//    @OneToMany(mappedBy = "rental")
//    private List<AdditionalProperty> additionalProperties;

    @ManyToOne
    @JoinColumn(name="additionalProperty_id")
    private AdditionalProperty additionalProperty;
    
    
    @ManyToOne
    @JoinColumn(name="returnCityId",referencedColumnName = "id")
    private City returnCity;
    
    @ManyToOne
    @JoinColumn(name="rentCityId",referencedColumnName = "id")
    private City rentCity;
    

    
   /* @ManyToOne
    @JoinColumn(name="city")
    private City city;*/
    

}
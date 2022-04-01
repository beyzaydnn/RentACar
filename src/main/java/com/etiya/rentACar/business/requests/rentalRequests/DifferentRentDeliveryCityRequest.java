package com.etiya.rentACar.business.requests.rentalRequests;


import javax.validation.constraints.NotNull;

import com.etiya.rentACar.entities.City;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DifferentRentDeliveryCityRequest {
    int id;
   
    private int rentCityId;
    private  int returnCityId;
    private int carId;
}

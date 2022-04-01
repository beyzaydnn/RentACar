package com.etiya.rentACar.business.requests.cityRequests;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.etiya.rentACar.business.requests.carRequests.CreateCarRequest;
import com.etiya.rentACar.entities.Car;
import com.etiya.rentACar.entities.CarStates;
import com.etiya.rentACar.entities.Rental;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCityRequest {

	
	@JsonIgnore
	private int id;
	
	@NotNull
	private String name;
	



}

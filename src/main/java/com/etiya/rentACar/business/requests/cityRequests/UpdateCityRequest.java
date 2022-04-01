package com.etiya.rentACar.business.requests.cityRequests;

import javax.validation.constraints.NotNull;

import com.etiya.rentACar.business.requests.carRequests.CreateCarRequest;
import com.etiya.rentACar.entities.CarStates;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCityRequest {

	
	private int id;
	
	@NotNull
	private String name;
	
}

package com.etiya.rentACar.business.responses.cityResponses;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.OneToMany;

import com.etiya.rentACar.business.responses.carResponses.CarDto;
import com.etiya.rentACar.entities.Car;
import com.etiya.rentACar.entities.CarStates;
import com.etiya.rentACar.entities.Rental;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListCityDto {

	private int id;
	
	private String name;
	

}

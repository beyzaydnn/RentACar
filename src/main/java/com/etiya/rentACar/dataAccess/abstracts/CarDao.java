package com.etiya.rentACar.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.etiya.rentACar.entities.Car;

import java.util.List;


@Repository
public interface CarDao extends JpaRepository<Car,Integer>{
    List<Car> getByModelYear(double modelYear);
    List<Car> getByModelYearIn(List<Double> modelYears);
    List<Car> getByModelYearAndDailyPrice(double modelYear, double dailyPrice);
    List<Car> getByDescriptionContains(String description);
    List<Car> getAllByCity(String city);
}
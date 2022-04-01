package com.etiya.rentACar.business.abstracts;

import java.util.List;

import com.etiya.rentACar.business.requests.brandRequests.CreateBrandRequest;
import com.etiya.rentACar.business.requests.brandRequests.DeleteBrandRequest;
import com.etiya.rentACar.business.requests.brandRequests.UpdateBrandRequest;
import com.etiya.rentACar.business.requests.cityRequests.CreateCityRequest;
import com.etiya.rentACar.business.requests.cityRequests.DeleteCityRequest;
import com.etiya.rentACar.business.requests.cityRequests.UpdateCityRequest;
import com.etiya.rentACar.business.responses.brandResponses.ListBrandDto;
import com.etiya.rentACar.business.responses.cityResponses.ListCityDto;
import com.etiya.rentACar.core.utilities.results.DataResult;
import com.etiya.rentACar.core.utilities.results.Result;

public interface CityService {
	DataResult<List<ListCityDto>> getAll();

	Result add(CreateCityRequest createCityRequest);
	Result update(UpdateCityRequest updateCityRequest);
	Result delete(DeleteCityRequest deleteCityRequest);
}

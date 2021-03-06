package com.etiya.rentACar.business.abstracts;

import java.util.List;

import com.etiya.rentACar.business.requests.brandRequests.DeleteBrandRequest;
import com.etiya.rentACar.business.requests.rentalRequests.*;
import com.etiya.rentACar.business.responses.rentalResponses.ListRentalDto;
import com.etiya.rentACar.core.utilities.results.DataResult;
import com.etiya.rentACar.core.utilities.results.Result;
import lombok.Data;

public interface RentalService {
    DataResult<List<ListRentalDto>> getAll();
    Result add(CreateRentalRequest createRentalRequest,List<Integer>additionalPropertyIdentities);

    Result updateRentalReturnDate(UpdateReturnDateRequest updateReturnDateRequest);
    Result update(UpdateRentalRequest updateRentalRequest,List<Integer>additionalPropertyIdentities);
    Result delete(DeleteRentalRequest deleteRentalRequest);
}
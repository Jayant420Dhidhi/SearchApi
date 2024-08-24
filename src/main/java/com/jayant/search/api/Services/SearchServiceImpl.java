package com.jayant.search.api.Services;

import com.jayant.search.api.Entity.*;
import com.jayant.search.api.Repository.SupplyRepository;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchServiceImpl implements  SearchService{
    @Autowired
    private SupplyRepository supplyRepository;
    @Override
    public Response searchSupplier(SearchRequest request) {
        try {
            BussinessType.valueOf(request.getNatureOfBussiness().toLowerCase());
            ManufacturingProcessType.valueOf(request.getManufacturingProcess().toLowerCase());
        }
        catch (Exception e) {
            return Response.builder()
                    .desiredList(null)
                    .httpStatusCode(HttpStatus.BAD_REQUEST)
                    .message("Bussiness Nature or Manufacturing Process is Not Valid")
                    .build();
        }

        List<Supplier> supplierList = supplyRepository
                .findByLocationAndNatureOfBussinessAndManufacturingProcess(
                        request.getLocation().toLowerCase(),
                        request.getNatureOfBussiness().toLowerCase(),
                        request.getManufacturingProcess().toLowerCase()
                );
        return Response.builder()
                .desiredList(supplierList)
                .httpStatusCode(HttpStatus.OK)
                .message("Successfully Fetched !!")
                .build();
    }
}

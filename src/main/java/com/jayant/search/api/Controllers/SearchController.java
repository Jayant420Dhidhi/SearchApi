package com.jayant.search.api.Controllers;

import com.jayant.search.api.Entity.*;
import com.jayant.search.api.Services.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier")
public class SearchController {
    @Autowired
    private SearchService searchService;

    @PostMapping("/query")
    Response searchSupplier(@RequestParam("city")String location, @RequestParam("btype") String natureOfBussines, @RequestParam("ptype") String manufacturingProcess){
       return searchService.searchSupplier(
               SearchRequest.builder()
                       .location(location)
                       .natureOfBussiness(natureOfBussines)
                       .manufacturingProcess(manufacturingProcess)
                       .build()
       );
    }
}

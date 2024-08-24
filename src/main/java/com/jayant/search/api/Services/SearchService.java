package com.jayant.search.api.Services;

import com.jayant.search.api.Entity.Response;
import com.jayant.search.api.Entity.SearchRequest;
import com.jayant.search.api.Entity.Supplier;

import java.util.List;

public interface SearchService {
    public Response searchSupplier(SearchRequest request);
}

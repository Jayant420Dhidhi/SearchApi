package com.jayant.search.api.Repository;

import com.jayant.search.api.Entity.BussinessType;
import com.jayant.search.api.Entity.ManufacturingProcessType;
import com.jayant.search.api.Entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupplyRepository extends JpaRepository<Supplier, Long>{
    List<Supplier> findByLocationAndNatureOfBussinessAndManufacturingProcess(String location, String natureOfBussines, String mamanufacturingProcess);
}

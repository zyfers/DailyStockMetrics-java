package com.bfm.app.controller;

import com.bfm.app.model.Stock;
import com.bfm.app.repositories.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge=3600)
@RequestMapping("/Stock")
public class StockController {

    @Autowired
    StockRepository repository;

    @GetMapping("/top")
    List<Stock> top(){
        return repository.getTop(10);
    }

    @GetMapping("/high")
    List<Stock> high() {
        return repository.getByHighAndYearlyHigh(20);
    }

    @GetMapping("/low")
    List<Stock> low() {
        return repository.getByLowAndYearlyLow(20);
    }

    @GetMapping("/all")
    List<Stock> all() {
        return repository.getAllStocks(20);
    }
}

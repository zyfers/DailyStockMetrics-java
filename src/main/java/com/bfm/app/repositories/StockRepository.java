package com.bfm.app.repositories;

import com.bfm.app.model.Stock;
import org.apache.ignite.springdata.repository.IgniteRepository;
import org.apache.ignite.springdata.repository.config.Query;
import org.apache.ignite.springdata.repository.config.RepositoryConfig;

import java.util.List;

@RepositoryConfig(cacheName = "StockCache")
public interface StockRepository extends IgniteRepository<Stock, Long> {

    @Query("SELECT * from Stock WHERE high = yearlyHigh LIMIT ?")
    List<Stock> getByHighAndYearlyHigh(int limit);

    @Query("SELECT * FROM Stock ORDER BY numberOfTrades DESC LIMIT ?")
    List<Stock> getTop(int limit);

    @Query("SELECT * from Stock WHERE low = yearlyLow LIMIT ?")
    List<Stock> getByLowAndYearlyLow(int limit);

    @Query("SELECT * FROM Stock limit ?")
    List<Stock> getAllStocks(int limit);

}

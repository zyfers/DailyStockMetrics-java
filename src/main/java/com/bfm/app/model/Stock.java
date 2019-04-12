package com.bfm.app.model;

import org.apache.ignite.cache.query.annotations.QuerySqlField;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Stock implements Serializable {

    @QuerySqlField(index = true)
    private Long id;
    @QuerySqlField(index = true)
    private String isin;
    @QuerySqlField(index = true)
    private String company;
    @QuerySqlField(index = true)
    private Double open;
    @QuerySqlField(index = true)
    private Double high;
    @QuerySqlField(index = true)
    private Double low;
    @QuerySqlField(index = true)
    private Double close;
    @QuerySqlField(index = true)
    private Long numberOfTrades;
    @QuerySqlField(index = true)
    private Double yearlyHigh;
    @QuerySqlField(index = true)
    private Double yearlyLow;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Double getOpen() {
        return open;
    }

    public void setOpen(Double open) {
        this.open = open;
    }

    public Double getHigh() {
        return high;
    }

    public void setHigh(Double high) {
        this.high = high;
    }

    public Double getLow() {
        return low;
    }

    public void setLow(Double low) {
        this.low = low;
    }

    public Double getClose() {
        return close;
    }

    public void setClose(Double close) {
        this.close = close;
    }

    public Long getNumberOfTrades() {
        return numberOfTrades;
    }

    public void setNumberOfTrades(Long numberOfTrades) {
        this.numberOfTrades = numberOfTrades;
    }

    public Double getYearlyHigh() {
        return yearlyHigh;
    }

    public void setYearlyHigh(Double yearlyHigh) {
        this.yearlyHigh = yearlyHigh;
    }

    public Double getYearlyLow() {
        return yearlyLow;
    }

    public void setYearlyLow(Double yearlyLow) {
        this.yearlyLow = yearlyLow;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "id=" + id +
                ", isin='" + isin + '\'' +
                ", company='" + company + '\'' +
                ", open=" + open +
                ", high=" + high +
                ", low=" + low +
                ", close=" + close +
                ", numberOfTrades=" + numberOfTrades +
                ", yearlyHigh=" + yearlyHigh +
                ", yearlyLow=" + yearlyLow +
                '}';
    }
}

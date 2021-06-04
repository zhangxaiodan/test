package cn.jsonzh.book.entity;

import java.io.Serializable;
import java.util.Date;

public class Flight implements Serializable {
    private Long id;
    private String flightNo;
    private Long departureCity;
    private String departureCityName;
    private Date departureTime;
    private Long arrivalCity;
    private String arrivalCityName;
    private Date arrivalTime;

    public Flight() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public Long getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(Long departureCity) {
        this.departureCity = departureCity;
    }

    public String getDepartureCityName() {
        return departureCityName;
    }

    public void setDepartureCityName(String departureCityName) {
        this.departureCityName = departureCityName;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Long getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(Long arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public String getArrivalCityName() {
        return arrivalCityName;
    }

    public void setArrivalCityName(String arrivalCityName) {
        this.arrivalCityName = arrivalCityName;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
}

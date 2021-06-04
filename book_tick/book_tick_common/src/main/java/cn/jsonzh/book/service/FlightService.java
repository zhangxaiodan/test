package cn.jsonzh.book.service;

import cn.jsonzh.book.entity.City;
import cn.jsonzh.book.entity.Flight;

import java.util.List;

public interface FlightService {

    /**
     * 添加航班
     * @param flight
     * @return
     */
    int addFlight(Flight flight);

    /**
     * 根据条件查询航班
     * @param from
     * @param to
     * @return
     */
    List<Flight> queryFlight(Integer from, Integer to);





}

package cn.jsonzh.book.mapper;


import cn.jsonzh.book.entity.Flight;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FlightMapper {
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
    List<Flight> queryFlight(@Param("flightFrom") Integer from, @Param("flightTo")Integer to);

    /**
     * 查询重复航班编号
     * @param flightNo
     * @return
     */
    int repectFlight(@Param("flightNo") String flightNo);

}

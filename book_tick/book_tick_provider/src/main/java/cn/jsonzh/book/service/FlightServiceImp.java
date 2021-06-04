package cn.jsonzh.book.service;


import cn.jsonzh.book.entity.Flight;
import cn.jsonzh.book.mapper.FlightMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FlightServiceImp implements FlightService {

    @Resource
    private FlightMapper flightMapper;

    /**
     * 添加航班
     *
     * @param flight
     * @return
     */
    @Override
    public int addFlight(Flight flight) {
        for(int i=0;i<10;i++) {
            System.out.println("service:" + flight.getDepartureCity());
        }
        int rep = flightMapper.repectFlight(flight.getFlightNo());
        if(rep>0){
            return 2;
        }else {
            return flightMapper.addFlight(flight);
        }

    }

    /**
     * 根据条件查询航班
     *
     * @param from
     * @param to
     * @return
     */
    @Override
    public List<Flight> queryFlight(Integer from, Integer to) {
        List<Flight> list = flightMapper.queryFlight(from,to);
        if(list.size()>0){
            return list;
        }
        return null;
    }
}

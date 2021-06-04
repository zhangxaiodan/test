package cn.jsonzh.book.controller;


import cn.jsonzh.book.entity.Flight;
import cn.jsonzh.book.service.FlightService;
import cn.jsonzh.book.util.DateFormat;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;

@RestController
public class FlightController {

    @Reference
    private FlightService flightService;

    @RequestMapping("/getFlight.do")
    public List<Flight> getFlight(Integer from,Integer to){
        return flightService.queryFlight(from,to);
    }

    @RequestMapping("/add.do")
    public String add(String flightNo,String to_time,String from_time,Long departureCity,Long arrivalCity){

        Flight flight = new Flight();
        flight.setFlightNo(flightNo);
        try {
            flight.setDepartureTime(DateFormat.formatDate(from_time));
            flight.setArrivalTime(DateFormat.formatDate(to_time));
        } catch (ParseException e) {
            e.printStackTrace();
            return "error";
        }

        flight.setDepartureCity(departureCity);
        flight.setArrivalCity(arrivalCity);
        for(int i=0;i<10;i++) {
            System.out.println("controller:" + flight.getDepartureCity());
        }
        int count = flightService.addFlight(flight);
        if(count==1){
            return "1";
        }else if(count==0){
            return "0";
        }else if(count == 2){
            return "2";
        }

        return "error";
    }

}

package cn.jsonzh.book.controller;


import cn.jsonzh.book.entity.City;
import cn.jsonzh.book.service.CityService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityController {

    @Reference
    private CityService cityService;

    @RequestMapping("/getAllCity.do")
    public List<City> getAllCity(){
        return cityService.getAllCity();
    }

}

package cn.jsonzh.book.service;

import cn.jsonzh.book.entity.City;

import java.util.List;

public interface CityService {

    /**
     * 查询所有城市
     * @return
     */
    List<City> getAllCity();

}

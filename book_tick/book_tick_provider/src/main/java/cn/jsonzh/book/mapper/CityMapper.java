package cn.jsonzh.book.mapper;

import cn.jsonzh.book.entity.City;
import cn.jsonzh.book.entity.Flight;

import java.util.List;

public interface CityMapper {

    /**
     * 查询所有城市
     * @return
     */
    List<City> getAllCity();
}

package cn.jsonzh.book.service;

import cn.jsonzh.book.entity.City;
import cn.jsonzh.book.mapper.CityMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CityServiceImp implements CityService {

    @Resource
    private CityMapper cityMapper;


    /**
     * 查询所有城市
     *
     * @return
     */
    @Override
    public List<City> getAllCity() {
        return cityMapper.getAllCity();
    }
}

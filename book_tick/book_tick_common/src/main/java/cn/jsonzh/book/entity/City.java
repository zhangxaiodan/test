package cn.jsonzh.book.entity;

import java.io.Serializable;

public class City implements Serializable {

    private Long id;
    private String cityName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public City() {
    }
}

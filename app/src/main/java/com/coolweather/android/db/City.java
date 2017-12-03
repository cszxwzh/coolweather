package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * 城市
 * Created by cszxw on 2017/12/3.
 */

public class City extends DataSupport {
    private int id;
    private int cityName;
    private int cityCode;
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCityName() {
        return cityName;
    }

    public void setCityName(int cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", cityName=" + cityName +
                ", cityCode=" + cityCode +
                ", provinceId=" + provinceId +
                '}';
    }
}
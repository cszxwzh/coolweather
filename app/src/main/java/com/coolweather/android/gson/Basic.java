package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 天气中基础数据
 * Created by cszxw on 2017/12/3.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}

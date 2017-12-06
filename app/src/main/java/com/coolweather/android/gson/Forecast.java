package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by cszxw on 2017/12/3.
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature tmperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{

        public String max;

        public String min;
    }
    public class More{

        @SerializedName("txt_d")
        public String info;
    }
}

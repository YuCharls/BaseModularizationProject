package com.example.yc.mvpdemo.empty.bean;

import java.util.List;

/**
 * Created by Yuchao on 2017/9/22.
 */

public class TestBean {
    
    public String reason;
    public int error_code;
    public List<ResultBean> result;

    public static class ResultBean {

        public String _id;
        public String title;
        public String pic;
        public int year;
        public int month;
        public int day;
        public String des;
        public String lunar;
    }
}

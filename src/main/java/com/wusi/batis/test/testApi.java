package com.wusi.batis.test;


import net.sf.json.JSONArray;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;
import net.sf.json.JSONObject;

import java.util.*;

/**
 * @ Description   :  java类作用描述
 * @ Author        :  wusi
 * @ CreateDate    :  2019/11/28$ 14:21$
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class testApi {

    @Test
    public  void test(){
        String date=null;
        String urlapi="https://free-api.heweather.net/s6/weather/forecast?location=hanyang&key=b941bbcd687b486aa07aab8586dc115e";
        RestTemplate restTemplate =new RestTemplate();
        String json= restTemplate.getForObject(urlapi, String.class);
            JSONObject jsonObject = JSONObject.fromObject(json);
            //获取第二层数据
        JSONArray jSONArray=jsonObject.getJSONArray("HeWeather6");
        JSONObject jsonObject2 = jSONArray.getJSONObject(0);
        JSONArray twos = jsonObject2.getJSONArray("daily_forecast");
        JSONObject weather = twos.getJSONObject(0);
        List<Map<String,String>> list=new ArrayList<>();
        JSONObject two=null;
        for (int i = 0; i <twos.size(); i++) {
            two=twos.getJSONObject(i);
            Map<String,String> map=new LinkedHashMap<>();
            map.put ("日期",two.get("date").toString());
            map.put ("天气情况",two.get("cond_txt_d").toString());
            map.put ("湿度",two.get("hum").toString());
            map.put ("最高温度",two.get("tmp_max").toString()+"摄氏度");
            map.put ("最低温度",two.get("tmp_min").toString()+"摄氏度");
            list.add(map);
            System.out.println(map.toString());
        }

    }
}

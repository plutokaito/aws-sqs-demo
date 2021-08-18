package io.kaitoshy.springbootdemo.dto;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import org.springframework.messaging.converter.JsonbMessageConverter;

public class SqsDemoMsg {
    private String title;
    private Long points;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getPoints() {
        return points;
    }

    public void setPoints(Long points) {
        this.points = points;
    }


    @Override
    public String toString() {
        return "SqsDemoMsg{" +
                "title='" + title + '\'' +
                ", points=" + points +
                '}';
    }

    public static SqsDemoMsg jsonToSqsDemoMsg(String jsonString) {
        try {
            return JSONObject.parseObject(jsonString, SqsDemoMsg.class);
        } catch (JSONException e) {
            return null;
        }
    }
}

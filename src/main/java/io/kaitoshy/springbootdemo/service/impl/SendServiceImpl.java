package io.kaitoshy.springbootdemo.service.impl;

import com.alibaba.fastjson.JSONObject;
import io.kaitoshy.springbootdemo.dto.SqsDemoMsg;
import io.kaitoshy.springbootdemo.service.SendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class SendServiceImpl implements SendService {
    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("${test.queue}")
    private String queueName;

    @Override
    public void sendMessage(Long points, String title) throws IOException {
        SqsDemoMsg msg = new SqsDemoMsg();
        msg.setPoints(points);
        msg.setTitle(title);
        jmsTemplate.convertAndSend(queueName, JSONObject.toJSONString(msg));
    }
}

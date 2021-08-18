package io.kaitoshy.springbootdemo.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.amazonaws.services.sqs.model.Message;
import io.kaitoshy.springbootdemo.dto.SqsDemoMsg;
import io.kaitoshy.springbootdemo.service.ReceiveService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.JmsException;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ReceiveServiceImpl implements ReceiveService {

    @JmsListener(destination = "${test.queue}")
    public void message(String jsonString) {
        log.info("===> received message:{}", jsonString);
        SqsDemoMsg sqsDemoMsg = SqsDemoMsg.jsonToSqsDemoMsg(jsonString);

        log.info("===> points:{} ", sqsDemoMsg.getPoints());
    }
}

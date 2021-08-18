package io.kaitoshy.springbootdemo.controller;

import io.kaitoshy.springbootdemo.service.SendService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/send")
@Slf4j
public class SendMsgController {
    @Autowired
    private SendService sendService;


    @GetMapping("/demo")
    public String send(@RequestParam("points") Long points, @RequestParam("title") String title) {
        try {
            sendService.sendMessage(points, title);
            return "send Ok";
        } catch (IOException ioException) {
            log.error("send error");
        }

        return "send failed";
    }

}

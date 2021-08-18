package io.kaitoshy.springbootdemo.service;

import io.kaitoshy.springbootdemo.dto.SqsDemoMsg;

public interface ReceiveService {

    void message(String jsonString);
}

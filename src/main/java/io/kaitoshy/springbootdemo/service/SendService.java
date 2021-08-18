package io.kaitoshy.springbootdemo.service;

import java.io.IOException;

public interface SendService {
    void sendMessage(Long points, String title) throws IOException;
}

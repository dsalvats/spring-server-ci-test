package org.example.service.impl;

import org.example.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class BaseServiceImpl implements BaseService {
  @Override public String getDummyString() {
    try {
      Thread.sleep(170);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    return "Hello World!";
  }
}

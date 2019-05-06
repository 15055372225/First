package com.springboot.demo.service.impl;

import com.springboot.demo.service.DemoService;
import org.springframework.stereotype.Service;

@Service("demoService")
public class DemoServiceImpl implements DemoService {
    @Override
    public int add(int page) {
        return ++page;
    }
}

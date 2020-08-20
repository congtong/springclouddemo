package com.example.servicefeign.feigninterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tc
 * @createTime 19 16:14
 * @description
 */
@RestController
public class DemoController {

    @Autowired
    HiInterface hiInterface;
    @RequestMapping("/test")
    public String test() {
        return hiInterface.getHiFromClient();
    }
}

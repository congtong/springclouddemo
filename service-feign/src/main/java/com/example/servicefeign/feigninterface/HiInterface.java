package com.example.servicefeign.feigninterface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "service-hi", fallback = HiInterfaceImpl.class)
public interface HiInterface {
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String getHiFromClient();
}

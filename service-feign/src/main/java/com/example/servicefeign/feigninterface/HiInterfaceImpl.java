package com.example.servicefeign.feigninterface;

import org.springframework.stereotype.Service;

/**
 * @author tc
 * @createTime 19 18:19
 * @description
 */
@Service
public class HiInterfaceImpl implements HiInterface{
    @Override
    public String getHiFromClient() {
        return "这里是熔断处理";
    }
}

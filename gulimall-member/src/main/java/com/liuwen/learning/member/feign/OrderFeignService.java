package com.liuwen.learning.member.feign;

import com.liuwen.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gulimall-order")
public interface OrderFeignService {

    @RequestMapping("/order/order/list")
    public R memberOrders();

}

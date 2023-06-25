package com.liuwen.learning.member.controller;

import java.util.Arrays;
import java.util.Map;

import com.liuwen.learning.member.feign.CouponFeignService;
import com.liuwen.learning.member.feign.OrderFeignService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.liuwen.learning.member.entity.MemberEntity;
import com.liuwen.learning.member.service.MemberService;
import com.liuwen.common.utils.PageUtils;
import com.liuwen.common.utils.R;


/**
 * 会员
 *
 * @author lw
 * @email 780442619@qq.com
 * @date 2023-06-19 23:35:19
 */
@RestController
@RequestMapping("member/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @Autowired
    private CouponFeignService couponFeignService;

    @Autowired
    private OrderFeignService orderFeignService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("member:member:list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }

    @RequestMapping("/coupons")
    public R testCoupons() {
        MemberEntity member = new MemberEntity();
        member.setNickname("会员昵称张三");

        R memberCoupon = couponFeignService.memberCoupons();
        //打印会员和优惠券信息
        return R.ok().put("member", member).put("coupons", memberCoupon.get("page"));
    }

    @RequestMapping("/orders")
    public R testOrders() {
        MemberEntity member = new MemberEntity();
        member.setNickname("会员昵称李四");

        R memberOrders = orderFeignService.memberOrders();
        System.out.println(memberOrders);
        //打印会员和优惠券信息
        return R.ok().put("member", member).put("orders", memberOrders.get("page"));
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("member:member:info")
    public R info(@PathVariable("id") Long id) {
        MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("member:member:save")
    public R save(@RequestBody MemberEntity member) {
        memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("member:member:update")
    public R update(@RequestBody MemberEntity member) {
        memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("member:member:delete")
    public R delete(@RequestBody Long[] ids) {
        memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}

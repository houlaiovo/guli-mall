package com.guli.mall.member.controller;

import com.guli.mall.common.utils.PageUtils;
import com.guli.mall.common.utils.R;
import com.guli.mall.member.config.MemberConfig;
import com.guli.mall.member.entity.MemberEntity;
import com.guli.mall.member.feign.CouponService;
import com.guli.mall.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;



/**
 * 会员
 *
 * @author gzc
 * @email gzc@163.com
 * @date 2023-07-30 11:33:50
 */
@RestController
@RefreshScope
@RequestMapping("member/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @Autowired
    private CouponService couponService;
    @Value("${member.test:}")
    private String test;
    @Autowired
    private MemberConfig memberConfig;

    /**
     * 列表
     */
    @RequestMapping("/coupon")
    public R list(){
        //R r = couponService.memberCoupon();
        return R.ok().put("coupon", test+"_"+memberConfig.getCoupon());
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("member:member:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("member:member:info")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("member:member:save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("member:member:update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("member:member:delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}

package com.roman.builder.learn.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.roman.builder.learn.entity.SubsInfo;
import com.roman.builder.learn.service.SubsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author chenxl11
 * @since 2019-12-10
 */
@RestController
@RequestMapping("/subsInfo")
public class SubsInfoController {
    @Autowired
    private transient SubsInfoService subsInfoService;

    @RequestMapping("/test1")
    public List<SubsInfo> test1(){
        return subsInfoService.queryList();
    }

    @RequestMapping("/test2")
    public List<SubsInfo> test2(){
        return subsInfoService.list(new QueryWrapper<SubsInfo>().lambda()
                .eq(SubsInfo::getSubsId,"1"));
    }
}

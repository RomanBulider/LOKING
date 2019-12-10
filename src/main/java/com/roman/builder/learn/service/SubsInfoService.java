package com.roman.builder.learn.service;

import com.roman.builder.learn.entity.SubsInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author chenxl11
 * @since 2019-12-10
 */
public interface SubsInfoService extends IService<SubsInfo> {
    public List<SubsInfo> queryList();
}

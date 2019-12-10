package com.roman.builder.learn.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.roman.builder.learn.entity.SubsInfo;
import com.roman.builder.learn.mapper.SubsInfoMapper;
import com.roman.builder.learn.service.SubsInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author chenxl11
 * @since 2019-12-10
 */
@Service
@DS("slave")
public class SubsInfoServiceImpl extends ServiceImpl<SubsInfoMapper, SubsInfo> implements SubsInfoService {
    @Override
    @DS("master")
    public List<SubsInfo> queryList(){
        return this.list(new QueryWrapper<SubsInfo>().lambda()
                .eq(SubsInfo::getSubsId,"1"));
    }
}

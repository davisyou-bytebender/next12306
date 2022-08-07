package com.aliyun.mapper;

import com.aliyun.model.TrainCity;

public interface TrainCityMapper {
    int insert(TrainCity record);

    int insertSelective(TrainCity record);
}
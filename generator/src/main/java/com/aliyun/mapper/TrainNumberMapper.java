package com.aliyun.mapper;

import com.aliyun.model.TrainNumber;

public interface TrainNumberMapper {
    int insert(TrainNumber record);

    int insertSelective(TrainNumber record);
}
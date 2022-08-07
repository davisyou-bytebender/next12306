package com.aliyun.mapper;

import com.aliyun.model.TrainStation;

public interface TrainStationMapper {
    int insert(TrainStation record);

    int insertSelective(TrainStation record);
}
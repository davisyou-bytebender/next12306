package com.aliyun.mapper;

import com.aliyun.model.TrainTraveller;

public interface TrainTravellerMapper {
    int insert(TrainTraveller record);

    int insertSelective(TrainTraveller record);
}
package com.aliyun.mapper;

import com.aliyun.model.TrainUserTraveller;

public interface TrainUserTravellerMapper {
    int insert(TrainUserTraveller record);

    int insertSelective(TrainUserTraveller record);
}
package com.aliyun.mapper;

import com.aliyun.model.TrainNumberDetail;

public interface TrainNumberDetailMapper {
    int insert(TrainNumberDetail record);

    int insertSelective(TrainNumberDetail record);
}
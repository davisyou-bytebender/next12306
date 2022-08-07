package com.aliyun.mapper;

import com.aliyun.model.TrainUser;

public interface TrainUserMapper {
    int insert(TrainUser record);

    int insertSelective(TrainUser record);
}
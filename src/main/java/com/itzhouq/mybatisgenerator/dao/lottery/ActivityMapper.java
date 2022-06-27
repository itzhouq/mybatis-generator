package com.itzhouq.mybatisgenerator.dao.lottery;

import com.itzhouq.mybatisgenerator.domain.Activity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ActivityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Activity record);

    int insertSelective(Activity record);

    Activity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Activity record);

    int updateByPrimaryKey(Activity record);
}
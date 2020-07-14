package com.itzhouq.mybatisgenerator.dao;

import com.itzhouq.mybatisgenerator.domain.SysLog;

public interface SysLogMapper {
    int deleteByPrimaryKey(String logId);

    int insert(SysLog record);

    int insertSelective(SysLog record);

    SysLog selectByPrimaryKey(String logId);

    int updateByPrimaryKeySelective(SysLog record);

    int updateByPrimaryKey(SysLog record);
}
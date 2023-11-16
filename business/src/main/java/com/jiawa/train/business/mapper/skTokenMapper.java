package com.jiawa.train.business.mapper;

import com.jiawa.train.business.domain.skToken;
import com.jiawa.train.business.domain.skTokenExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface skTokenMapper {
    long countByExample(skTokenExample example);

    int deleteByExample(skTokenExample example);

    int deleteByPrimaryKey(Long id);

    int insert(skToken record);

    int insertSelective(skToken record);

    List<skToken> selectByExample(skTokenExample example);

    skToken selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") skToken record, @Param("example") skTokenExample example);

    int updateByExample(@Param("record") skToken record, @Param("example") skTokenExample example);

    int updateByPrimaryKeySelective(skToken record);

    int updateByPrimaryKey(skToken record);
}
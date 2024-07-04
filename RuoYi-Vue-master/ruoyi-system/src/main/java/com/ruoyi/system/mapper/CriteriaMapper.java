package com.ruoyi.system.mapper;


import com.ruoyi.system.domain.Criteria;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CriteriaMapper {

    @Insert("INSERT INTO evaluationcriteria (criteriaDescription, scoringDetails) VALUES (#{criteriaDescription},#{scoringDetails})")
    int insertCritera(Criteria criteria);






}

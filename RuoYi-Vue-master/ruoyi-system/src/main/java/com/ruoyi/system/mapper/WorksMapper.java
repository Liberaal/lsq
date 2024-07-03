package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.Works;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface WorksMapper {

    @Insert("INSERT INTO competitionwork (workTitle, uploadedBy, score,school,team,phone) VALUES (#{workTitle},#{uploadedBy},#{score},#{school},#{team},#{phone})")
    int Loadon(Works works);

    @Select("SELECT * FROM competitionwork")
    List<Works> Search();

    @Update("UPDATE competitionwork SET score=#{score} WHERE workID =#{workID} ")
    int UpdataScore(@Param("workID") int workID, @Param("score") double score);


}

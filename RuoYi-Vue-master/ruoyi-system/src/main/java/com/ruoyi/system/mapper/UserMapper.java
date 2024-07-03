package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public interface UserMapper {
    @Select("SELECT * FROM user WHERE Name = #{Name} AND Password = #{Password}")
    List<User> loginIt(@Param("Name") String Name, @Param("Password") String Password);



    @Insert("INSERT INTO user (Name, Password, Role) VALUES (#{Name}, #{Password}, #{Role})")
    boolean insertUser(@Param("Name") String Name, @Param("Password") String Password,@Param("Role") String Role);

    @Update("UPDATE user SET Name = #{Name}, Password = #{Password}, Role = #{Role} WHERE ID = #{ID}")
    int updateUser(@Param("ID") int ID, @Param("Name") String Name, @Param("Password") String Password, @Param("Role") String Role);



}

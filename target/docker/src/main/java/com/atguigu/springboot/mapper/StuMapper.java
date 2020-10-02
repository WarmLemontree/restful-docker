package com.atguigu.springboot.mapper;

import com.atguigu.springboot.bean.Stu;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StuMapper {
    @Select("select * from stu")
    public List<Stu> getStu();

    @Delete("delete from stu where studentId=#{studentId}")
    public int deleteStuById(Integer id);

    @Insert("insert into stu(studentId,name,department,major) values(#{studentId},#{name},#{department},#{major})")
    public int insertStu(Stu stu);

    @Update("update stu set studentId=#{studentId},name=#{name},department=#{department},major=#{major} where studentId=#{studentId}")
    public int updateDept(Stu stu);
}

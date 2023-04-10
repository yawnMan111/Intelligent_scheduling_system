package com.pilifenghuolang.ISS.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pilifenghuolang.ISS.domain.Schedule;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ScheduleDAO extends BaseMapper<Schedule> {
    @Delete("delete from schedule")
    public Integer deleteAll();
}

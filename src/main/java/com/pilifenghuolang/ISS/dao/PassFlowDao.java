package com.pilifenghuolang.ISS.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pilifenghuolang.ISS.domain.PassFlow;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PassFlowDao extends BaseMapper<PassFlow> {
    @Delete("delete from pass_flow")
    public Integer deleteAll();
}

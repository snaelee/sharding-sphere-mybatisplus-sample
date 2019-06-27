package com.cyneck.zero.sharding.sample.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.cyneck.zero.sharding.sample.entity.Employee;
import com.cyneck.zero.sharding.sample.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 注解在service实现或mapper接口方法上
 */
@DS("slave")//注解在service实现或mapper接口方法上,dsName可以为组名也可以为具体某个库的名称
public interface EmplopyeeDao extends BaseMapper<Employee> {

    @Select("SELECT * FROM user")
    @DS("slave_1")
    List<User> selectAll();
}

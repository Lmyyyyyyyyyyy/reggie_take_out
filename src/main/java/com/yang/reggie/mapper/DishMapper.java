package com.yang.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yang.reggie.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}

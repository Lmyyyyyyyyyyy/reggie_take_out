package com.yang.reggie.dto;

import com.yang.reggie.entity.Setmeal;
import com.yang.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}

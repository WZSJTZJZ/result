package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("film")
public class Film {
    @TableId(value = "filmId", type = IdType.AUTO)
    private Integer filmId;
    private  String title;
    private  String description;
    private  String releaseYear;
    private  String languageId;
    private  String rentalDuration;
    @TableField(exist = false)
    private String name;
}

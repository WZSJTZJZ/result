package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("actor")
public class Actor {
    @TableId(value = "actor_id", type = IdType.AUTO)
    private Integer actorId;
    private String firstName;
    private String lastName;
    private String lastUpdate;
}

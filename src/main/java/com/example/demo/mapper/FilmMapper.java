package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.Film;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FilmMapper extends BaseMapper<Film> {
    List<Film> getList();
}

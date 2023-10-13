package com.example.demo.controller;

import com.example.demo.entity.Film;
import com.example.demo.mapper.FilmMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class FilmController
{
    @Resource
    private FilmMapper filmMapper;

    @GetMapping("/filmlist")
    public List<Film> filmList(){
        return filmMapper.getList();
    }
}

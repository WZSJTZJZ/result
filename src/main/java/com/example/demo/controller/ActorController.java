package com.example.demo.controller;

import com.example.demo.entity.Actor;
import com.example.demo.mapper.ActorMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ActorController {

    @Resource
    private ActorMapper actorMapper;

    @GetMapping("/list_test")
    public List<String> list1(){
        List<String> list1=new ArrayList<>();
        list1.add("111");
        list1.add("222");
        list1.add("333");
        return list1;
    }

    @GetMapping("/actorlist")
    public List<Actor> actorList(){
        System.out.println(actorMapper.userlist());
        return actorMapper.userlist();
    }
    @GetMapping("/delectById/{id}")
    public String delectById(@PathVariable Integer id){
       Integer result=actorMapper.deleteById(id);
       return result==0?"刪除失败":"刪除成功";
    }
    @PostMapping("/insert")
    public String insert(@RequestBody Actor actor){
        Integer result=actorMapper.insert(actor);
        return result==0?"添加失败":"添加成功";
    }
}

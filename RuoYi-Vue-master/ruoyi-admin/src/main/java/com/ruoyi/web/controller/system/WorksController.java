package com.ruoyi.web.controller.system;

import com.ruoyi.common.annotation.Anonymous;
import com.ruoyi.system.domain.Works;
import com.ruoyi.system.mapper.WorksMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/works")
public class WorksController {

    @Resource
    WorksMapper worksMapper;

    @Anonymous
    @PostMapping("/loadon")
    @ResponseBody
    public int insertWorks(@RequestBody Works works){
        return worksMapper.Loadon(works);
    }


    @Anonymous
    @GetMapping("/search")
    @ResponseBody
    public List<Works> searchWorks(){
        return worksMapper.Search();
    }

    @Anonymous
    @PostMapping("/updataScore")
    @ResponseBody
    public int updataUser(@RequestParam Integer workID,@RequestParam double score){
        return worksMapper.UpdataScore(workID,score);
    }



}

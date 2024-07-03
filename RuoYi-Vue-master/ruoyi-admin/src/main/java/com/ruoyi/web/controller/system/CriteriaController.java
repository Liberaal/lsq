package com.ruoyi.web.controller.system;

import com.ruoyi.common.annotation.Anonymous;
import com.ruoyi.system.domain.Criteria;
import com.ruoyi.system.mapper.CriteriaMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/criteria")
public class CriteriaController {

    @Resource
    CriteriaMapper criteriaMapper;

    @Anonymous
    @PostMapping("/insert")
    @ResponseBody
    public int insertCriteria(@RequestBody Criteria criteria){
        return criteriaMapper.insertCritera(criteria);
    }



}

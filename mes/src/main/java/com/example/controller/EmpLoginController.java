package com.example.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.entity.EmpInfo;
import com.example.entity.EmpLogin;
import com.example.service.impl.EmpInfoServiceImpl;
import com.example.service.impl.EmpLoginServiceImpl;
import com.example.utils.ResponseBean;
import com.example.utils.ReturnCode;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 用户登陆信息表 前端控制器
 * </p>
 *
 * @author csj
 * @since 2020-04-04
 */
@RestController
@RequestMapping("/emp_login")
public class EmpLoginController {
    @Autowired
    private EmpLoginServiceImpl service;


    @ApiOperation(value="查询接口", notes="查询满足条件的数据")
    @GetMapping
    public ResponseBean GetItem(EmpLogin entity){
        QueryWrapper<EmpLogin> queryWrapper = new QueryWrapper<>();
        if(entity.getEmpId()!=null)
            queryWrapper.eq("emp_id",entity.getEmpId());
        if(entity.getEmpPwd()!=null)
            queryWrapper.eq("emp_pwd",entity.getEmpPwd());

        EmpLogin match =  service.getOne(queryWrapper);
        return new ResponseBean(HttpStatus.OK.value(), ReturnCode.SELECT_SUCCESS_MSG,  match);
    }


    @ApiOperation(value="插入接口", notes="插入一条数据")
    @PostMapping
    public ResponseBean InsertItem(@RequestBody EmpLogin entity) {
        Object emplogin = service.save(entity);
        if(emplogin == null){
            return new ResponseBean(500,"信息为空！",null);
        }else if(emplogin.equals("-1")){
            return new ResponseBean(HttpStatus.BAD_REQUEST.value(), ReturnCode.OPERATION_FAIL_MSG, null);
        }
        return new ResponseBean(200,"添加成功",entity);
    }

    @ApiOperation(value="修改接口", notes="更新满足条件的数据")
    @PutMapping
    public ResponseBean UpdateItem(@RequestBody EmpLogin entity) {
        if(service.updateById(entity))
            return new ResponseBean(HttpStatus.OK.value(), ReturnCode.OPERATION_SUCCESS_MSG, null);
        else
            return new ResponseBean(HttpStatus.EXPECTATION_FAILED.value(), ReturnCode.OPERATION_FAIL_MSG, null);

    }


    @ApiOperation(value="删除接口", notes="删除满足条件的数据")
    @DeleteMapping("/{id}")
    public ResponseBean DeleteItem(@PathVariable int id) {
        boolean i = service.removeById(id);
        if(i == true){
            return new ResponseBean(200,"删除成功",null);
        }else {
            return new ResponseBean(500,"删除失败","被删除数据不存在！");
        }
    }

}

package com.example.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.entity.EmrgNoteRecords;
import com.example.entity.MachineProShip;
import com.example.service.impl.EmrgNoteRecordsServiceImpl;
import com.example.service.impl.MachineProShipServiceImpl;
import com.example.utils.ResponseBean;
import com.example.utils.ReturnCode;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 机型工艺流程卡关联表 前端控制器
 * </p>
 *
 * @author csj
 * @since 2020-04-04
 */
@RestController
@RequestMapping("/machine_pro_ship")
public class MachineProShipController {
    @Autowired
    private MachineProShipServiceImpl service;


    @ApiOperation(value="查询接口", notes="查询满足条件的数据")
    @GetMapping("/{id}")
    public ResponseBean GetItem(@PathVariable int id){
        MachineProShip match =  service.getById(id);

        return new ResponseBean(HttpStatus.OK.value(), ReturnCode.SELECT_SUCCESS_MSG,  match);
    }

    @ApiOperation(value="查询接口", notes="查询满足条件的数据")
    @GetMapping("/list")
    public ResponseBean GetItemList(MachineProShip entity){
        QueryWrapper<MachineProShip> queryWrapper = new QueryWrapper<>();
        if(entity.getSewTypeId()!=null)
            queryWrapper.eq("sew_type_id",entity.getSewTypeId());
        List<MachineProShip> list =  service.list(queryWrapper);
        return new ResponseBean(HttpStatus.OK.value(), ReturnCode.SELECT_SUCCESS_MSG,  list);
    }


    @ApiOperation(value="插入接口", notes="插入一条数据")
    @PostMapping
    public ResponseBean InsertItem(@RequestBody MachineProShip entity) {
        Object empInfo = service.save(entity);
        if(empInfo == null){
            return new ResponseBean(500,"主键不能为空！",null);
        }else if(empInfo.equals("-1")){
            return new ResponseBean(HttpStatus.BAD_REQUEST.value(), ReturnCode.OPERATION_FAIL_MSG, null);
        }
        return new ResponseBean(200,"添加成功",entity);
    }

    @ApiOperation(value="修改接口", notes="更新满足条件的数据")
    @PutMapping
    public ResponseBean UpdateItem(@RequestBody MachineProShip entity) {
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

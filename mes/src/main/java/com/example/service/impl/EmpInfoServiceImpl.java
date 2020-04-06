package com.example.service.impl;

import com.example.entity.EmpInfo;
import com.example.mapper.EmpInfoMapper;
import com.example.service.IEmpInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 员工基本信息表 服务实现类
 * </p>
 *
 * @author csj
 * @since 2020-04-04
 */
@Service
public class EmpInfoServiceImpl extends ServiceImpl<EmpInfoMapper, EmpInfo> implements IEmpInfoService {

}

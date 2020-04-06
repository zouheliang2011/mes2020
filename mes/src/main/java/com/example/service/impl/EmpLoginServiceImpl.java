package com.example.service.impl;

import com.example.entity.EmpLogin;
import com.example.mapper.EmpLoginMapper;
import com.example.service.IEmpLoginService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户登陆信息表 服务实现类
 * </p>
 *
 * @author csj
 * @since 2020-04-04
 */
@Service
public class EmpLoginServiceImpl extends ServiceImpl<EmpLoginMapper, EmpLogin> implements IEmpLoginService {

}

package com.example.service.impl;

import com.example.entity.EmpWorkHours;
import com.example.mapper.EmpWorkHoursMapper;
import com.example.service.IEmpWorkHoursService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 员工工时统计表 服务实现类
 * </p>
 *
 * @author csj
 * @since 2020-04-04
 */
@Service
public class EmpWorkHoursServiceImpl extends ServiceImpl<EmpWorkHoursMapper, EmpWorkHours> implements IEmpWorkHoursService {

}

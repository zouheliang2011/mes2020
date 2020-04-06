package com.example.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户登陆信息表
 * </p>
 *
 * @author csj
 * @since 2020-04-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class EmpLogin implements Serializable {

    private static final long serialVersionUID = 1L;

    private  int id;
    /**
     * 员工编号
     */
    private String empId;

    /**
     * 员工姓名
     */
    private String empName;

    /**
     * 登陆密码
     */
    private String empPwd;

    /**
     * 角色类型：1-管理员；2-工班长；3-普通员工
     */
    private Integer roleId;

    /**
     * 创建时间
     */
    private LocalDateTime createdTime;


}

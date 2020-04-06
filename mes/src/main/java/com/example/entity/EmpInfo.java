package com.example.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 员工基本信息表
 * </p>
 *
 * @author csj
 * @since 2020-04-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class EmpInfo implements Serializable {

    private static final long serialVersionUID = 1L;


    private int id;
    /**
     * 员工编号
     */
    private String empId;

    /**
     * 员工姓名
     */
    private String empName;

    /**
     * 年龄
     */
    private Integer empAge;

    /**
     * 员工姓名
     */
    private String cardId;
    /**
     * 入司时间
     */
    private String empHire;

    /**
     * 性别
     */
    private String gender;

    /**
     * 联系电话
     */
    private String empTel;

    /**
     * 籍贯
     */
    private String nativePlace;

    /**
     * 备注
     */
    private String note;

    /**
     * 创建时间
     */
    private LocalDateTime createdTime;


}

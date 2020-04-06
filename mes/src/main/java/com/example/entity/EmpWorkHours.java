package com.example.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 员工工时统计表
 * </p>
 *
 * @author csj
 * @since 2020-04-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class EmpWorkHours implements Serializable {

    private static final long serialVersionUID = 1L;

    private String empId;

    private String empName;

    private Integer workMins;

    private BigDecimal workHours;

    private LocalDateTime createDate;

    private LocalDateTime updatedTime;


}

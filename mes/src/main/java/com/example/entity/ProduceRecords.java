package com.example.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author csj
 * @since 2020-04-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ProduceRecords implements Serializable {

    private static final long serialVersionUID = 1L;

    private  int id;
    /**
     * 订单编号
     */
    private String orderId;

    private Integer sewTypeId;

    private String sewTypeName;
    /**
     * 具体机器编号
     */
    private String machineId;

    /**
     * 工序卡ID
     */
    private Integer mPShipId;

    private String stageName;

    private String pro_Stus;

    private String empId;

    private String empName;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    /**
     * 工序耗时：分钟
     */
    private Integer workMins;

    private Integer chkPassed;

    private LocalDateTime createdTime;

    private String reasons;

}

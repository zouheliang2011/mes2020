package com.example.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 突发情况编辑表
 * </p>
 *
 * @author csj
 * @since 2020-04-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class EmrgNoteRecords implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单编号
     */
    private String orderId;

    /**
     * 生产记录表ID
     */
    private Integer proRecordId;

    private String machineId;

    private String stageName;

    private Integer stageOrderNum;

    /**
     * 生产之后原因
     */
    private String reasons;

    /**
     * 编辑人员
     */
    private String empId;

    private String empName;

    private LocalDateTime createdTime;

    private LocalDateTime updatedTime;


}

package com.example.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 工序配置表
 * </p>
 *
 * @author csj
 * @since 2020-04-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ProcedureCfg implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    /**
     * 序号
     */
    private Integer stageId;

    /**
     * 流程名称
     */
    private String stageName;

    /**
     * 流程描述
     */
    private String stageProNote;

    private LocalDateTime createdTime;

    private LocalDateTime updatedTime;

    private String empId;

    /**
     * 录入人员
     */
    private String empName;


}

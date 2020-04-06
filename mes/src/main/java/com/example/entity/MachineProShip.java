package com.example.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 机型工艺流程卡关联表
 * </p>
 *
 * @author csj
 * @since 2020-04-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class MachineProShip implements Serializable {

    private static final long serialVersionUID = 1L;

    private  int id;
    /**
     * 工序流程组编号
     */
    private String groupId;

    /**
     * 机器大类型
     */
    private Integer sewTypeId;

    private String sewTypeName;


    private Integer stageCfgId;

    /**
     * 顺序编号
     */
    private Integer stageSort;


    /**
     * 备注
     */
    private String note;

    private LocalDateTime createdTime;



}

package com.example.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 机器子分类
 * </p>
 *
 * @author csj
 * @since 2020-04-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SewSubtype implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer sewTypeId;

    private String sewSubtypeCode;

    private String sewSubtypeName;

    private LocalDateTime createdTime;

    private LocalDateTime updatedTime;


}

package com.wnh.springcloud.entities;

import lombok.Data;

/**
 * @author: wnhyang
 * @create: 2021-08-07 15:07
 **/
@Data
public class Storage {

    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;
}

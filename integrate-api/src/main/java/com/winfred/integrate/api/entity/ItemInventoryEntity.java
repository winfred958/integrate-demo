package com.winfred.integrate.api.entity;

import lombok.*;

import java.io.Serializable;

/**
 * @author winfred958
 */

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ItemInventoryEntity implements Serializable {

  private static final long serialVersionUID = 2135189221515197066L;

  private String skuId;

  private Integer availableInventory;

  private Integer totalInventory;
}

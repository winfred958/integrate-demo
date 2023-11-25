package com.winfred.integrate.api.entity;

import lombok.*;

/**
 * @author winfred958
 */

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ItemInventoryEntity {

  private String skuId;

  private Integer availableInventory;

  private Integer totalInventory;
}

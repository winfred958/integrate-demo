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
public class ItemInfoEntity {

  private String skuId;

  private ItemInventoryEntity inventory;
}

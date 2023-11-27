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
public class ItemInfoEntity implements Serializable {

  private static final long serialVersionUID = 2854364780517500000L;

  private String skuId;

  private ItemInventoryEntity inventory;
}

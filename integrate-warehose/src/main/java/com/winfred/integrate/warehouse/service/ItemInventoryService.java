package com.winfred.integrate.warehouse.service;

import com.winfred.integrate.api.entity.ItemInventoryEntity;

/**
 * @author winfred958
 */
public interface ItemInventoryService {

  ItemInventoryEntity getItemInventory(String skuId);
}

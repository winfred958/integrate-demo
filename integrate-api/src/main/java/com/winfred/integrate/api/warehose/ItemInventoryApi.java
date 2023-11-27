package com.winfred.integrate.api.warehose;

import com.winfred.integrate.api.entity.ItemInventoryEntity;

/**
 * @author winfred958
 */
public interface ItemInventoryApi {

  ItemInventoryEntity getItemInventory(String skuId);
}

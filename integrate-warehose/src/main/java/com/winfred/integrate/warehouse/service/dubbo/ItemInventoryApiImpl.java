package com.winfred.integrate.warehouse.service.dubbo;

import com.winfred.integrate.api.entity.ItemInventoryEntity;
import com.winfred.integrate.api.warehose.ItemInventoryApi;
import com.winfred.integrate.warehouse.service.ItemInventoryService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author winfred958
 */
@DubboService(
    version = "1.0.0",
    loadbalance = "leastactive"
)
public class ItemInventoryApiImpl implements ItemInventoryApi {

  private final ItemInventoryService itemInventoryService;

  @Autowired
  public ItemInventoryApiImpl(ItemInventoryService itemInventoryService) {
    this.itemInventoryService = itemInventoryService;
  }

  @Override
  public ItemInventoryEntity getItemInventory(String skuId) {
    return itemInventoryService.getItemInventory(skuId);
  }
}

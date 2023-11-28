package com.winfred.integrate.item.service.impl;

import com.winfred.integrate.api.entity.ItemInfoEntity;
import com.winfred.integrate.api.entity.ItemInventoryEntity;
import com.winfred.integrate.api.warehose.ItemInventoryApi;
import com.winfred.integrate.item.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @author winfred958
 */
@Service
@Slf4j
public class ItemServiceImpl implements ItemService {


  @DubboReference(version = "1.0.0", check = false)
  private ItemInventoryApi itemInventoryApi;

  @Override
  public ItemInfoEntity getItem(String skuId) {
    log.info(" item sku: {}", skuId);
    final ItemInventoryEntity itemInventory = itemInventoryApi.getItemInventory(skuId);
    return ItemInfoEntity
        .builder()
        .skuId(skuId)
        .inventory(itemInventory)
        .build();
  }
}

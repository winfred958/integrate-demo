package com.winfred.integrate.warehouse.service.impl;

import cn.hutool.core.util.RandomUtil;
import com.winfred.integrate.api.entity.ItemInventoryEntity;
import com.winfred.integrate.warehouse.service.ItemInventoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author winfred958
 */
@Slf4j
@Service
public class ItemInventoryServiceImpl implements ItemInventoryService {

  @Override
  public ItemInventoryEntity getItemInventory(String skuId) {
    return ItemInventoryEntity
        .builder()
        .skuId(skuId)
        .totalInventory(RandomUtil.randomInt(100, 200))
        .availableInventory(RandomUtil.randomInt(20, 50))
        .build();
  }
}

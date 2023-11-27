package com.winfred.integrate.warehouse.controller.impl;

import com.winfred.integrate.api.entity.ItemInventoryEntity;
import com.winfred.integrate.api.entity.base.BaseResponse;
import com.winfred.integrate.warehouse.controller.InventoryApi;
import com.winfred.integrate.warehouse.service.ItemInventoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author winfred958
 */
@Slf4j
@RestController
public class InventoryController implements InventoryApi {


  private ItemInventoryService itemInventoryService;

  @Override
  public Mono<BaseResponse<?>> getInventory(String skuId) {
    final ItemInventoryEntity itemInventory = itemInventoryService.getItemInventory(skuId);
    return Mono.just(BaseResponse.success(itemInventory));
  }
}

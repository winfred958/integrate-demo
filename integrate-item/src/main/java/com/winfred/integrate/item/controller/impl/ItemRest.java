package com.winfred.integrate.item.controller.impl;

import com.winfred.integrate.api.entity.ItemInfoEntity;
import com.winfred.integrate.api.entity.base.BaseResponse;
import com.winfred.integrate.item.controller.ItemApi;
import com.winfred.integrate.item.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.apache.shenyu.client.springcloud.annotation.ShenyuSpringCloudClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author winfred958
 */
@Slf4j
@RestController
public class ItemRest implements ItemApi {

  private final ItemService itemService;

  @Autowired
  public ItemRest(ItemService itemService) {
    this.itemService = itemService;
  }

  @Override
  public Mono<BaseResponse<?>> getItemInfo(String skuId) {
    final ItemInfoEntity itemInfo = itemService.getItem(skuId);
    return Mono.just(BaseResponse.success(itemInfo));
  }
}

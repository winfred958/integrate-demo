package com.winfred.integrate.warehouse.controller;

import com.winfred.integrate.api.entity.base.BaseResponse;
import org.apache.shenyu.client.springcloud.annotation.ShenyuSpringCloudClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Mono;

/**
 * @author winfred958
 */
@RequestMapping(value = "/inv")
@ShenyuSpringCloudClient(value = "/inv/**")
public interface InventoryApi {

  @GetMapping(value = "/sku/{skuId}", produces = MediaType.APPLICATION_JSON_VALUE)
  Mono<BaseResponse<?>> getInventory(@PathVariable String skuId);
}

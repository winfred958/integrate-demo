package com.winfred.integrate.item.controller;

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
@RequestMapping(value = "/info/")
@ShenyuSpringCloudClient(value = "/info/**")
public interface ItemApi {

  @GetMapping(value = "/{skuId}", produces = MediaType.APPLICATION_JSON_VALUE)
  Mono<BaseResponse<?>> getItemInfo(@PathVariable String skuId);
}

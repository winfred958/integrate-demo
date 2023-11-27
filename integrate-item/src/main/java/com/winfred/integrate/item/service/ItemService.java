package com.winfred.integrate.item.service;

import com.winfred.integrate.api.entity.ItemInfoEntity;

/**
 * @author winfred958
 */
public interface ItemService {

  ItemInfoEntity getItem(String skuId);
}

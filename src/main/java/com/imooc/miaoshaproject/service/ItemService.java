package com.imooc.miaoshaproject.service;

import com.imooc.miaoshaproject.error.BusinessException;
import com.imooc.miaoshaproject.service.model.ItemModel;

import java.util.List;

/**
 * @author 784909593
 * @data 2019/8/9 - 0:58
 */
public interface ItemService {
    ItemModel createItem(ItemModel itemModel) throws BusinessException;
    List<ItemModel> listItem();
    ItemModel getItemById(Integer id);
    boolean decreaseStock(Integer itemId,Integer amount) throws BusinessException;
    void increaseSales(Integer itemId,Integer amount)throws BusinessException;

}

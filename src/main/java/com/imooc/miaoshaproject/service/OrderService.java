package com.imooc.miaoshaproject.service;

import com.imooc.miaoshaproject.error.BusinessException;
import com.imooc.miaoshaproject.service.model.OrderModel;

/**
 * @author 784909593
 * @data 2019/8/9 - 0:58
 */
public interface OrderService {
    OrderModel createOrder(Integer userId,Integer itemId,Integer promoId,Integer amount) throws BusinessException;
}

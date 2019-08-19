package com.imooc.miaoshaproject.service;

import com.imooc.miaoshaproject.error.BusinessException;
import com.imooc.miaoshaproject.service.model.UserModel;

/**
 * @author 784909593
 * @data 2019/8/9 - 0:59
 */
public interface UserService {
    UserModel getUserById(Integer id);
    void register(UserModel userModel) throws BusinessException;

    UserModel validateLogin(String telphone,String encrptPassword) throws BusinessException;
}

package com.imooc.miaoshaproject.error;

/**
 * @author 784909593
 * @data 2019/8/8 - 23:14
 */
public interface CommonError {
    public int getErrCode();
    public String getErrMsg();
    public CommonError setErrMSg(String errMSg);
}

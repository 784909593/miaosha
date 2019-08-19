package com.imooc.miaoshaproject.error;

/**
 * @author 784909593
 * @data 2019/8/8 - 23:16
 */
public class BusinessException extends Exception implements CommonError{

    private CommonError commonError;

    public BusinessException(CommonError commonError) {
        super();
        this.commonError = commonError;
    }

    public BusinessException(CommonError commonError,String errMsg) {
        super();
        this.commonError = commonError;
        this.commonError.setErrMSg(errMsg);
    }

    @Override
    public int getErrCode() {
        return this.commonError.getErrCode();
    }

    @Override
    public String getErrMsg() {
        return this.commonError.getErrMsg();
    }

    @Override
    public CommonError setErrMSg(String errMSg) {
        this.commonError.setErrMSg(errMSg);
        return this;
    }

    public CommonError getCommonError(){
        return commonError;
    }
}

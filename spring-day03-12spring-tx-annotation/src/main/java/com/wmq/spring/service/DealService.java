package com.wmq.spring.service;

/**
 * @Description：交易场景
 */
public interface DealService {

    /**
     * @Description 支付操作
     * @param money 金额
     * @param payId 支付账号ID
     * @param rePayId 收款账号
     * @return
     */
    Integer doDeal(Float money, Integer payId, Integer rePayId);


    /**
     * @Description 打印账户信息
     * @param payId 支付账号ID
     * @param rePayId 收款账号
     * @return
     */
    void printAccountInfo(Integer payId, Integer rePayId);
}

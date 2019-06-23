package com.xiemingzhong.dao;

import com.xiemingzhong.entity.Shop;

public interface ShopDao {
    //新增店铺
    int insertShop(Shop shop);
    int updateShop(Shop shop);
}

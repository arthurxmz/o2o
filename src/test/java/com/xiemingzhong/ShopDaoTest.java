package com.xiemingzhong;
import static org.junit.Assert.assertEquals;
import com.xiemingzhong.dao.ShopDao;
import com.xiemingzhong.entity.Area;
import com.xiemingzhong.entity.PersonInfo;
import com.xiemingzhong.entity.Shop;
import com.xiemingzhong.entity.ShopCategory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class ShopDaoTest extends BaseTest{
    @Autowired
    private ShopDao shopDao;
    @Test
    public void testInsertShop(){
        Shop shop = new Shop();
        PersonInfo owner= new PersonInfo();
        Area area = new Area();
        ShopCategory shopCategory = new ShopCategory();
        owner.setUserId(1L);
        area.setAreaId(2);
        shopCategory.setShopCategoryId(1L);
        shop.setOwner(owner);
        shop.setArea(area);
        shop.setShopCategory(shopCategory);
        shop.setShopName("测试店铺");
        shop.setShopAddr("test");
        shop.setShopDesc("test");
        shop.setShopImg("test");
        shop.setPhone("test");
        shop.setCreateTime(new Date());
        shop.setEnableStatus(1);
        shop.setAdvice("审核中");
        int effctedNum = shopDao.insertShop(shop);
        assertEquals(1,effctedNum);
    }

    @Test
    public void testUpdateShop(){
        Shop shop = new Shop();
        shop.setShopId(1L);

        shop.setShopAddr("地址");
        shop.setShopDesc("描述");

        int effctedNum = shopDao.updateShop(shop);
        assertEquals(1,effctedNum);
    }
}

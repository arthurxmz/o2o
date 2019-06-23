package com.xiemingzhong;

import static org.junit.Assert.assertEquals;
import com.xiemingzhong.dao.AreaDao;
import com.xiemingzhong.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AreaDaoTest extends BaseTest{
    @Autowired
    private AreaDao areaDao;
    @Test
    public  void testQueryArea(){
        List<Area> areaList=areaDao.queryArea();
        assertEquals (2,areaList.size());
    }


    }



package com.xiemingzhong;

import com.xiemingzhong.entity.Area;
import com.xiemingzhong.services.AreaService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.Assert.assertEquals;
import java.util.List;

public class AreaServiceTest extends BaseTest {
    @Autowired
    private AreaService areaService;
    @Test
    public void testGetAreaList(){
        List<Area>areaList=areaService.getAreaList();
        assertEquals("深圳",areaList.get(0).getAreaName());
    }

}

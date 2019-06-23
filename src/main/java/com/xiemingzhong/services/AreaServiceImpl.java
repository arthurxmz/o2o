package com.xiemingzhong.services;

import com.xiemingzhong.dao.AreaDao;
import com.xiemingzhong.entity.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaDao areaDao;
    @Override
    public List<Area> getAreaList(){
        return  areaDao.queryArea();
    }
}

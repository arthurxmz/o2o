package com.xiemingzhong.controller;

import com.xiemingzhong.entity.Area;
import com.xiemingzhong.services.AreaService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import org.slf4j.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/superadmin")
public class AreaController {
    Logger logger = LoggerFactory.getLogger(AreaController.class);

    @Autowired  //spring
    private AreaService areaService;

    @RequestMapping(value = "/listarea",method = RequestMethod.GET)  //spring mvc
    @ResponseBody
    private Map<String, Object> listArea() {
        logger.info("==start==");
        long starTime = System.currentTimeMillis();
        Map<String,Object> modelMap=new HashMap<String,Object>();
        List<Area> list = new ArrayList<Area>();
        try{
            list=areaService.getAreaList();
            modelMap.put("rows",list);
            modelMap.put("total",list.size());
        }catch(Exception e){
            logger.error(e.toString());
            modelMap.put("success",false);
            modelMap.put("errMsg",e.toString());

        }
        logger.error("test error!");
        long endTime=System.currentTimeMillis();
        logger.debug("costTime"+ (endTime-starTime) +"ms]");
        logger.info("===end===");
        return modelMap;
    }
}

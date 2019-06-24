package com.xiemingzhong.util;

import java.io.StringReader;

public class PathUtil {
    private static String seperator=System.getProperty("file.separator");


    //根据不同的操作系统来定义图片路径
    public static String getImgBasePath(){

        String os = System.getProperty("os.name");
        String basePath="";
        if (os.toLowerCase().startsWith("win")){
            basePath="E:/project/image";
        }else {
            basePath="/home/xiangze/image";
        }
        //替换"/"
        basePath = basePath.replace("/",seperator);
        return basePath;
    }



}

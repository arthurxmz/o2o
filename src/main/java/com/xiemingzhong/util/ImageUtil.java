package com.xiemingzhong.util;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ImageUtil {
	public static void main(String [] args) throws IOException {
		String basePath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		Thumbnails.of(new File("/Users/Administrator/Desktop/e1166fb6bf98f0d11d2c5a417619041a_th.jpg")).size(200,200)
				.watermark(Positions.BOTTOM_RIGHT,ImageIO.read(new File(basePath+"/watermark.jpg")),0.25f).outputQuality(0.8f)
				.toFile("/Users/Administrator/Desktop/e1166fb6bf98f0d11d2c5a417619041a_th.jpg");
	}



}
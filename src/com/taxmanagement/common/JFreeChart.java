package com.taxmanagement.common;

import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;

import org.jfree.chart.ChartFactory;
import org.jfree.data.general.DefaultPieDataset;

import com.sun.image.codec.jpeg.ImageFormatException;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGEncodeParam;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

public class JFreeChart {

	public static void main(String[] args) throws ImageFormatException, IOException{
		
		
		HashMap<String, Integer> dataset = new HashMap<String, Integer>();
		
		dataset.put("Apple",29);
		dataset.put("HTC",15);
		dataset.put("Samsung",24);
		dataset.put("LG",7);
		dataset.put("Motorola",10);

		String filePath = "D:/"+(new Date()).getTime()+".html";
		
		
		BufferedImage bimage = getPieChartAsImage(dataset, 500, 500);
		saveImage(bimage, filePath );
	}
	
	
	
	public static BufferedImage getPieChartAsImage(HashMap<String, Integer> dataset1,int width ,int height ){
		
		
		HashMap<String, Integer> dataset = new HashMap<String, Integer>();
		
		dataset.put("Apple",29);
		dataset.put("HTC",15);
		dataset.put("Samsung",24);
		dataset.put("LG",7);
		dataset.put("Motorola",10);
		
		
		DefaultPieDataset objDataset = new DefaultPieDataset();
		
		for (String key : dataset.keySet()) {
			objDataset.setValue(key,dataset.get(key));
		}
		
		org.jfree.chart.JFreeChart objChart = ChartFactory.createPieChart (
			    "Demo Pie Chart",   //Chart title
			    objDataset,         //Chart Data 
			    true,               // include legend?
			    true,               // include tooltips?
			    false               // include URLs?
			    );
		
		return objChart.createBufferedImage(width, height);
	}
	
	
	public static void saveImage(BufferedImage img, String filePath) throws ImageFormatException, IOException{
	
	        FileOutputStream fos = new FileOutputStream(filePath);
	        JPEGImageEncoder encoder2 = JPEGCodec.createJPEGEncoder(fos);
	        JPEGEncodeParam param2 = encoder2.getDefaultJPEGEncodeParam(img);
	        float quality = 100;
			param2.setQuality((float) quality, true);
			encoder2.encode(img,param2);
			fos.close(); 
	}
	
}

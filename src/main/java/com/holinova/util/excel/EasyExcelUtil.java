package com.holinova.util.excel;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.listener.PageReadListener;
import com.alibaba.fastjson.JSON;
import com.holinova.constant.TestConstant;
import com.holinova.pageobject.data.ErpSystemData;
import com.holinova.pageobject.data.RoadTestData;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EasyExcelUtil {

	public static InputStream getResourcesFileInputStream(String fileName) {
		return Thread.currentThread().getContextClassLoader().getResourceAsStream("" + fileName);
	}

	public static String getPath() {
		return EasyExcelUtil.class.getResource("/").getPath();
	}

	public static File createNewFile(String pathName) {
		File file = new File(getPath() + pathName);
		if (file.exists()) {
			file.delete();
		} else {
			if (!file.getParentFile().exists()) {
				file.getParentFile().mkdirs();
			}
		}
		return file;
	}

	public static File readFile(String pathName) {
		return new File(getPath() + pathName);
	}

	public static File readUserHomeFile(String pathName) {
		return new File(System.getProperty("user.home") + File.separator + pathName);
	}

	@SuppressWarnings({ "rawtypes", "null", "unchecked" })
	public static List readERPDataExcel() {
		List excelList = new ArrayList<>(); 
		EasyExcel.read(TestConstant.FILEPATH, ErpSystemData.class, new PageReadListener<ErpSystemData>(dataList -> {
			for (ErpSystemData demoData : dataList) {
                log.info("read a record{}", JSON.toJSONString(demoData));
                excelList.add(demoData);
            }
			
		})).sheet("testERPBook").doRead();
		return excelList;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static List readRoadTestDataExcel() {		
		List excelList = new ArrayList<>(); 
		EasyExcel.read(TestConstant.FILEPATH, RoadTestData.class, new PageReadListener<RoadTestData>(dataList -> {
			for (RoadTestData demoData : dataList) {
                log.info("read a record{}", JSON.toJSONString(demoData));
                excelList.add(demoData);
            }
			
		})).sheet("testRoad").doRead();
		return excelList;
	}

}

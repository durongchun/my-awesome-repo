package com.holinova.util.dataprovider;

import java.io.IOException;
import java.util.List;

import org.testng.annotations.DataProvider;

import com.holinova.util.excel.EasyExcelUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExcelDataProvider {

	@DataProvider(name = "ERPData")
	public static Object[][] ReadVariant() throws IOException {
		List dataList = EasyExcelUtil.readERPDataExcel();
		// count my number of Rows
		int RowNum = dataList.size();
		int ColNum = 1;
		// pass my count data in array
		Object Data[][] = new Object[RowNum][ColNum]; 
		for (int i = 0; i < dataList.size(); i++) {
			Data[i][0] = dataList.get(i);
		}
		return Data;
	}
	
	@DataProvider(name = "RoadData")
	public static Object[][] ReadRoad() throws IOException {
		List dataList = EasyExcelUtil.readRoadTestDataExcel();
		// count my number of Rows
		int RowNum = dataList.size();
		int ColNum = 1;
		// pass my count data in array
		Object Data[][] = new Object[RowNum][ColNum]; 
		for (int i = 0; i < dataList.size(); i++) {
			Data[i][0] = dataList.get(i);
		}
		return Data;
	}
}

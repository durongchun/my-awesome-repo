package com.holinova.pageobject.page.erpsystem;

import org.openqa.selenium.WebDriver;

import com.holinova.basepage.BasePage;
import com.holinova.pageobject.data.ErpSystemData;
import com.holinova.pageobject.locator.ErpSystemLocator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BookDemoPage extends BasePage {
	ErpSystemData erpSystemData = new ErpSystemData();

	public BookDemoPage(WebDriver driver) {
		super(driver);
	}

	public void bookDemo(ErpSystemData erpSystemData) {
		this.sendInput(ErpSystemLocator.BUISNESSEMAIL_INPUT, erpSystemData.getMail());
		this.sendInput(ErpSystemLocator.FIRSTNAME_INPUT, erpSystemData.getFn());
		this.sendInput(ErpSystemLocator.LASTNAME_INPUT, erpSystemData.getLn());
		this.sendInput(ErpSystemLocator.PHONENUMBER_INPUT, erpSystemData.getPhone());
		this.sendInput(ErpSystemLocator.COMPANY_INPUT, erpSystemData.getCompany());
		this.clickButton(ErpSystemLocator.BOOKDEMO_BUTTON);
	}
}

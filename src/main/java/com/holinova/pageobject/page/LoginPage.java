package com.holinova.pageobject.page;

import com.holinova.basepage.BasePage;
import com.holinova.util.MybatisUtil;
import com.holinova.util.RedisUtil;

import bsh.This;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Login page object
 *
 * @author lucy
 * @version 1.0.0
 * @date 2020/10/20 13:12
 */
@Slf4j
public class LoginPage extends BasePage {
    /**
     * Constructor 1
     *
     * @param driver 
     */
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Constructor 2
     *
     * @param driver    
     * @param redisUtil redis 
     */
    public LoginPage(WebDriver driver, RedisUtil redisUtil) {
        super(driver, redisUtil);
    }
    
    /**
     * Go login page
     */
    public void enterPage() {
        log.info("Go login page");
        // todo : super.enterPage(LoginData.URL);
    }

    /**
     * Login by UI clicking
     */
    public void loginByUI() {
        // todo : login by UI 
    }

    /**
     * Login by API 
     * HttpClient
     */
    public void loginByAPI() {
        // todo : login by API 
    }

    /**
     * Login by cookie/sessionid/access_token 
     * Use WebDriver to setCookies or save value in browser by js
     */
    public void loginBySession() {
        // todo : login by cookie/sessionid/access_token 
    }
}

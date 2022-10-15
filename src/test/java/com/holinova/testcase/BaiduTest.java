package com.holinova.testcase;

import com.holinova.basetest.BaseTest;
import com.holinova.pageobject.page.BaiduPage;

import org.testng.annotations.Test;

/**
 * 百度页面测试用例
 *
 * @author lucy
 * @version 1.0.0
 * @date 2020/1/28
 */
public class BaiduTest extends BaseTest {
    private BaiduPage baiduPage;

    @Test(description = "百度首页_搜索测试", priority = 1)
    public void testSearch() {
        // 初始化百度页面
        baiduPage = new BaiduPage(driver, redisUtil);
        // 进入百度首页
        baiduPage.enterPage();
        // 百度页面搜索检测
        assert baiduPage.search();
    }
}

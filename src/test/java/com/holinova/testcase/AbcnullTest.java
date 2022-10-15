package com.holinova.testcase;

import com.holinova.basetest.BaseTest;
import com.holinova.pageobject.page.AbcnullPage;

import org.testng.annotations.Test;

/**
 * lucy 页面测试用例
 *
 * @author lucy
 * @version 1.0.0
 * @date 2020/1/28
 */
public class AbcnullTest extends BaseTest {
    private AbcnullPage abcnullPage;

    @Test(description = "abcnull页面_搜索测试", priority = 1)
    public void testSearch() {
        // 初始化 lucy 页面
        abcnullPage = new AbcnullPage(driver, redisUtil);
        // 进入 lucy 首页
        abcnullPage.enterPage();
        // abncull 页面搜索检测
        assert abcnullPage.search();
    }
}

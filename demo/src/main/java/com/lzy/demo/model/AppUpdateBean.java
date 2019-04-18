package com.lzy.demo.model;

import java.io.Serializable;

/**
 * 时间：2019-04-18 15:45  <br/>
 * 作者：zhangzhi  <br/>
 * 邮箱：crazyhelloworld@163.com  <br/>
 * 描述：
 */
public class AppUpdateBean implements Serializable {
    public String updateContent;
    public String appVersion;
    public String downUrl;
    public int hasNew;
    public int flag;
}

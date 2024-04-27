package com.xxl.job.admin.core.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * 任务组：也称为执行器
 * Created by xuxueli on 16/9/30.
 */
public class XxlJobGroup {

    /** 主键、应用名称、标题 */
    private int id;
    private String appname;
    private String title;

    /** 执行器地址类型：0=系统自动注册、1=手动录入、执行器地址列表（addressType=1时，多地址逗号分隔）、 执行器地址列表（addressType=0时） */
    private int addressType;
    private String addressList;
    private List<String> registryList;

    /** 更新时间 */
    private Date updateTime;

    public List<String> getRegistryList() {
        if (addressList != null && addressList.trim().length() > 0) {
            registryList = new ArrayList<String>(Arrays.asList(addressList.split(",")));
        }
        return registryList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAddressType() {
        return addressType;
    }

    public void setAddressType(int addressType) {
        this.addressType = addressType;
    }

    public String getAddressList() {
        return addressList;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public void setAddressList(String addressList) {
        this.addressList = addressList;
    }

}

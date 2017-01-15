package com.sinkinchan.transport.module;

import java.util.Date;

/**
 * Created by apple on 16/10/7.
 */
public class UserBean extends BaseTransportBean {
    /*    `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
                `userName` varchar(150) DEFAULT '' COMMENT '用户名',
                `icon` text COMMENT '头像',
                `gender` int(11) DEFAULT NULL COMMENT '性别',
                `third_party_id` text COMMENT '第三方id',
                `platform` varchar(10) DEFAULT NULL COMMENT '第三方平台',*/
    private Integer id;
    private Date addTime;
    private String userName;
    private String icon;
    private String gender;
    private String third_party_id;
    private String platform;
    private int isOnline;
    private Date loginTime;
    private Date logOutTime;
    private long sessionId;
    /**
     * 积分
     */
    private long integral;
    //在线
    public static final int ON_LINE = 1;
    //离线
    public static final int OFF_LINE = 0;

    public String getUserName() {
        return userName;
    }

    public UserBean setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getIcon() {
        return icon;
    }

    public UserBean setIcon(String icon) {
        this.icon = icon;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public UserBean setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getThird_party_id() {
        return third_party_id;
    }

    public UserBean setThird_party_id(String third_party_id) {
        this.third_party_id = third_party_id;
        return this;
    }

    public String getPlatform() {
        return platform;
    }

    public UserBean setPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public UserBean setId(Integer id) {
        this.id = id;
        return this;
    }

    public Date getAddTime() {
        return addTime;
    }

    public UserBean setAddTime(Date addTime) {
        this.addTime = addTime;
        return this;
    }

    public int getIsOnline() {
        return isOnline;
    }

    public UserBean setIsOnline(int isOnline) {
        this.isOnline = isOnline;
        return this;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public UserBean setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
        return this;
    }

    public Date getLogOutTime() {
        return logOutTime;
    }

    public UserBean setLogOutTime(Date logOutTime) {
        this.logOutTime = logOutTime;
        return this;
    }

    public long getIntegral() {
        return integral;
    }

    public UserBean setIntegral(long integral) {
        this.integral = integral;
        return this;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "id=" + id +
                ", addTime=" + addTime +
                ", userName='" + userName + '\'' +
                ", icon='" + icon + '\'' +
                ", gender='" + gender + '\'' +
                ", third_party_id='" + third_party_id + '\'' +
                ", platform='" + platform + '\'' +
                ", isOnline=" + isOnline +
                ", loginTime=" + loginTime +
                ", logOutTime=" + logOutTime +
                '}';
    }

    @Override
    public String getCacheKey() {
        return "UserBean_" + third_party_id;
    }

    public long getSessionId() {
        return sessionId;
    }

    public UserBean setSessionId(long sessionId) {
        this.sessionId = sessionId;
        return this;
    }
}

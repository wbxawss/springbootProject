package com.springboot.model;


/**
 * @作者：hawk
 * @日期：2021/1/13 0013 21:27
 */
public class User {

    private String id;

    private String userName;

    private String passWord;

    private String realName;

    public void setId(String id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getRealName() {
        return realName;
    }
}

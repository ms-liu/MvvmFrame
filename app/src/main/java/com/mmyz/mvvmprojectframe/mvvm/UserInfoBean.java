package com.mmyz.mvvmprojectframe.mvvm;

/**
 * ==============================================
 * <p>
 * 类名：UserInfoBean
 * <p>
 * 作者：M-Liu
 * <p>
 * 时间：2017/4/6
 * <p>
 * 邮箱：ms_liu163@163.com
 * <p>
 * ==============================================
 */

public class UserInfoBean {
    public String mUsername;
    public String defaultAgeTip ="还未设置年龄";
    public int mAge;
    public int mSex;

    public UserInfoBean(String mUsername, int mAge, int mSex) {
        this.mUsername = mUsername;
        this.mAge = mAge;
        this.mSex = mSex;
    }

    public String getmUsername() {
        return mUsername;
    }

    public void setmUsername(String mUsername) {
        this.mUsername = mUsername;
    }

    public int getmAge() {
        return mAge;
    }

    public void setmAge(int mAge) {
        this.mAge = mAge;
    }

    public int getmSex() {
        return mSex;
    }

    public void setmSex(int mSex) {
        this.mSex = mSex;
    }
}

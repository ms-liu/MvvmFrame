package com.mmyz.mvvmprojectframe.mvpvm.v;

/**
 * ==============================================
 * <p>
 * 类名：
 * <p>
 * 作者：M-Liu
 * <p>
 * 时间：2017/4/6
 * <p>
 * 邮箱：ms_liu163@163.com
 * <p>
 * ==============================================
 */

public interface IView<T> {
    void showProgressbar();

    void hideProgressbar();

    void showData(T b);
}

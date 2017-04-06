package com.mmyz.mvvmprojectframe.mvpvm.m;

/**
 * ==============================================
 * <p>
 * 类名：IModel
 * <p>
 * 作者：M-Liu
 * <p>
 * 时间：2017/4/6
 * <p>
 * 邮箱：ms_liu163@163.com
 * <p>
 * ==============================================
 */

public interface IModel<T> {
    void addModel(T t);
    T getModel();
    boolean checkModel(T t);
}

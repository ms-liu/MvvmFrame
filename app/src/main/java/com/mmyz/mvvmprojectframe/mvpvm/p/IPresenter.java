package com.mmyz.mvvmprojectframe.mvpvm.p;

import com.mmyz.mvvmprojectframe.mvpvm.m.IModel;
import com.mmyz.mvvmprojectframe.mvpvm.v.IView;

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

public interface IPresenter<M extends IModel,V extends IView> {
    void bindView(V v);

    void unBindView();

    boolean checkView(V v);

}

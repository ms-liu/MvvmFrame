package com.mmyz.mvvmprojectframe.mvpvm.m;

import com.mmyz.mvvmprojectframe.mvpvm.m.bean.MvpVMBean;

/**
 * ==============================================
 * <p>
 * 类名：MvvmModel
 * <p>
 * 作者：M-Liu
 * <p>
 * 时间：2017/4/6
 * <p>
 * 邮箱：ms_liu163@163.com
 * <p>
 * ==============================================
 */

public class MvvmModel implements IModel<MvpVMBean> {

    private MvpVMBean bean ;

    @Override
    public void addModel(MvpVMBean mvpVMBean) {
        this.bean = mvpVMBean;
    }

    @Override
    public MvpVMBean getModel() {
        return this.bean;
    }

    @Override
    public boolean checkModel(MvpVMBean mvpVMBean) {
        return mvpVMBean != null;
    }
}

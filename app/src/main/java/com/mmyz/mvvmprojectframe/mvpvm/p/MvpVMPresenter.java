package com.mmyz.mvvmprojectframe.mvpvm.p;

import android.os.Handler;

import com.mmyz.mvvmprojectframe.mvpvm.m.MvvmModel;
import com.mmyz.mvvmprojectframe.mvpvm.m.bean.MvpVMBean;
import com.mmyz.mvvmprojectframe.mvpvm.v.IMvpVMView;
import com.mmyz.mvvmprojectframe.mvvm.MvvmBean;
import com.mmyz.mvvmprojectframe.mvvm.eventhandle.ClickHandler;

/**
 * ==============================================
 * <p>
 * 类名：MvpVMPresenter
 * <p>
 * 作者：M-Liu
 * <p>
 * 时间：2017/4/6
 * <p>
 * 邮箱：ms_liu163@163.com
 * <p>
 * ==============================================
 */

public class MvpVMPresenter implements IPresenter<MvvmModel,IMvpVMView> {



    private IMvpVMView mView;

    @Override
    public void bindView(IMvpVMView iMvpVMView) {
        this.mView = iMvpVMView;
        loadData();
    }

    @Override
    public void unBindView() {

    }

    @Override
    public boolean checkView(IMvpVMView iMvpVMView) {
        return iMvpVMView != null;
    }

    private void loadData() {
        mView.showProgressbar();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mView.hideProgressbar();
                mView.showData(new MvpVMBean());
            }
        },1000);
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(1000);
//                    runOnUiThread(new Runnable() {
//                        @Override
//                        public void run() {
//                            progressDialog.dismiss();
//                            binder.setMvvm(new MvvmBean());
//                            binder.setClickHandler(new ClickHandler(userInfoAdapter));
//                        }
//                    });
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();
    }

}

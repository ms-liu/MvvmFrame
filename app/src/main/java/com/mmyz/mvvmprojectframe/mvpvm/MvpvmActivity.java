package com.mmyz.mvvmprojectframe.mvpvm;

import android.app.ProgressDialog;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.mmyz.mvvmprojectframe.R;
import com.mmyz.mvvmprojectframe.databinding.ActivityMvpvmBinding;
import com.mmyz.mvvmprojectframe.mvpvm.m.bean.MvpVMBean;
import com.mmyz.mvvmprojectframe.mvpvm.p.MvpVMPresenter;
import com.mmyz.mvvmprojectframe.mvpvm.v.IMvpVMView;

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

public class MvpvmActivity extends AppCompatActivity implements IMvpVMView {

    private ProgressDialog progressDialog;
    private ActivityMvpvmBinding binder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binder = DataBindingUtil.setContentView(this, R.layout.activity_mvpvm);
        MvpVMPresenter mvpVMPresenter = new MvpVMPresenter();
        mvpVMPresenter.bindView(this);
    }

    @Override
    public void showProgressbar() {
        progressDialog = new ProgressDialog(this);
        progressDialog.show();
    }

    @Override
    public void hideProgressbar() {
        if (progressDialog != null){
            progressDialog.hide();
        }
    }

    @Override
    public void showData(MvpVMBean b) {
        binder.setMvpvm(b);
    }
}

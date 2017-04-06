package com.mmyz.mvvmprojectframe.mvvm;

import android.app.ProgressDialog;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.mmyz.mvvmprojectframe.R;
import com.mmyz.mvvmprojectframe.databinding.ActivityMvvmBinding;
import com.mmyz.mvvmprojectframe.mvvm.eventhandle.ClickHandler;

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

public class MvvmActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMvvmBinding binder =  DataBindingUtil.setContentView(this, R.layout.activity_mvvm);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        final UserInfoAdapter userInfoAdapter = new UserInfoAdapter();
        recyclerView.setAdapter(userInfoAdapter);
        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.show();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            progressDialog.dismiss();
                            binder.setMvvm(new MvvmBean());
                            binder.setClickHandler(new ClickHandler(userInfoAdapter));
                        }
                    });
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();


    }
}

package com.mmyz.mvvmprojectframe.mvvm.eventhandle;

import android.view.View;
import android.widget.Toast;

import com.mmyz.mvvmprojectframe.mvvm.MvvmBean;
import com.mmyz.mvvmprojectframe.mvvm.UserInfoAdapter;
import com.mmyz.mvvmprojectframe.mvvm.UserInfoBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

public class ClickHandler {

    private final UserInfoAdapter adapter;

    public ClickHandler(UserInfoAdapter userInfoAdapter) {
        this.adapter = userInfoAdapter;

    }

    public void refreshView(View view){
        List<UserInfoBean> datas = new ArrayList<>();
        for (int i=0;i<10;i++){
            datas.add(new UserInfoBean("张三",new Random().nextInt(100),new Random().nextInt(2)));
        }
        adapter.setData(datas);
//        System.out.println("============点击==="+mvvmBean);
    }
}

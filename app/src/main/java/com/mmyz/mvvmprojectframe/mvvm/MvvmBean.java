package com.mmyz.mvvmprojectframe.mvvm;

/**
 * ==============================================
 * <p>
 * 类名：MvvmBean
 * <p>
 * 作者：M-Liu
 * <p>
 * 时间：2017/4/6
 * <p>
 * 邮箱：ms_liu163@163.com
 * <p>
 * ==============================================
 */

public class MvvmBean {
    public String title="MVVM模式";
    public String descrption="MVVM模式，是通过数据绑定的方式，产生ViewModel，直接Layout文件，作出相应的简单" +
            "逻辑判断，达到数据控显View的目的。这里使用的是Google的DataBinding，但是目前只能实现单向的数据绑定，" +
            "并不能通过View的改变来改变数据。";

    @Override
    public String toString() {
        return "MvvmBean{" +
                "title='" + title + '\'' +
                ", descrption='" + descrption + '\'' +
                '}';
    }
}

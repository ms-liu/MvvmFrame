package com.mmyz.mvvmprojectframe.mvvm;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mmyz.mvvmprojectframe.R;
import com.mmyz.mvvmprojectframe.databinding.ItemUserInfoBinding;

import java.util.ArrayList;
import java.util.List;

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

public class UserInfoAdapter extends RecyclerView.Adapter<UserInfoAdapter.UserViewHolder> {

    private List<UserInfoBean> mData = new ArrayList<>();

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ItemUserInfoBinding binder = DataBindingUtil.inflate(inflater, R.layout.item_user_info, parent, false);
        UserViewHolder userViewHolder = new UserViewHolder(binder.getRoot());
        userViewHolder.setBinder(binder);
        return userViewHolder;
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        holder.getBinder().setUser(mData.get(position));
    }

    public void setData(List<UserInfoBean> data) {
        this.mData = data;
        notifyDataSetChanged();
//        notifyItemRangeInserted(0,data.size());
    }


    static class UserViewHolder extends RecyclerView.ViewHolder{

        private ItemUserInfoBinding binder;

        public UserViewHolder(View itemView) {
            super(itemView);
        }

        public void setBinder(ItemUserInfoBinding binder) {
            this.binder = binder;
        }

        public ItemUserInfoBinding getBinder() {
            return binder;
        }
    }
}

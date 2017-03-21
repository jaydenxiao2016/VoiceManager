package com.jaydenxiao.voicemanager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * 类名：BaseCommonAdapter.java
 * 作者：xsf
 * 描述：base适配器
 */
public  class BaseCommonAdapter<T> extends android.widget.BaseAdapter {

    protected Context mContext;
    protected LayoutInflater mInflater;
    protected List<T> data;

    public BaseCommonAdapter(Context context) {
        super();
        mContext = context;
        mInflater = LayoutInflater.from(mContext);
        this.data = new ArrayList<>();
    }

    public BaseCommonAdapter(Context context, List<T> data) {
        super();
        mContext = context;
        if (data != null) {
            this.data = data;
        }
        else {
            this.data = new ArrayList<>();
        }
        mInflater = LayoutInflater.from(mContext);
    }
    /**
     * 设置数据源
     *
     * @param d
     */
    public void setData(List<T> d) {
        data = d;
    }

    /**
     * 获取数据源
     *
     * @return
     */
    public List<T> getData() {
        return data;
    }

    /**
     * 替换数据源
     *
     * @param d
     */
    public void replaceAllData(List<T> d) {
        if (d == null) return;
        data.clear();
        data.addAll(d);
        notifyDataSetChanged();
    }

    /**
     * 增加单个数据
     *
     * @param d
     */
    public void add(T d) {
        if (d == null) return;
        if (data == null) data = new ArrayList<>();
        data.add(d);
        notifyDataSetChanged();
    }

    /**
     * 增加数据源
     *
     * @param d
     */
    public void addAll(List<T> d) {
        if (d == null) return;
        if (data == null) data = new ArrayList<>();
        data.addAll(d);
        notifyDataSetChanged();
    }

    /**
     * 在某个位置添加数据源
     *
     * @param position
     * @param d
     */
    public void addAllAt(int position, List<T> d) {
        if (d == null) return;
        if (data == null) data = new ArrayList<>();
        data.addAll(position, d);
        notifyDataSetChanged();
    }

    /**
     * 在某个位置添加单个数据源
     *
     * @param position
     * @param d
     */
    public void addAt(int position, T d) {
        if (d == null) return;
        if (data == null) data = new ArrayList<>();
        data.add(position, d);
        notifyDataSetChanged();
    }

    /**
     * 移除某个数据源
     *
     * @param position
     */
    public void remove(int position) {
        if (data == null) return;
        data.remove(position);
        notifyDataSetChanged();
    }

    /**
     * 清空所有数据
     */
    public void clearAll() {
        data.clear();
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public T getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }

}

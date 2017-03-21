package com.jaydenxiao.voicemanager;

import android.util.SparseArray;
import android.view.View;

/**
 * 类名：BaseCommonAdapter.java
 * 描述：viewholder工具
 * 作者：xsf
 * 创建时间：2016/11/24
 * 最后修改时间：2016/11/24
 */
public class ViewHolderUtil {

    @SuppressWarnings("unchecked")
    public static <T extends View> T get(View view, int id) {
        SparseArray<View> viewHolder = (SparseArray<View>) view.getTag();
        if (viewHolder == null) {
            viewHolder = new SparseArray<View>();
            view.setTag(viewHolder);
        }
        View childView = viewHolder.get(id);
        if (childView == null) {
            childView = view.findViewById(id);
            viewHolder.put(id, childView);
        }
        return (T) childView;
    }

	/*
     * 在getview里面的用法
	 * 
	 * @Override public View getView(int position, View convertView, ViewGroup
	 * parent) {
	 * 
	 * if (convertView == null) { convertView = LayoutInflater.from(context)
	 * .inflate(R.layout.banana_phone, parent, false); }
	 * 
	 * ImageView bananaView = ViewHolderUtil.get(convertView, R.id.banana);
	 * TextView phoneView = ViewHolderUtil.get(convertView, R.id.phone);
	 * 
	 * BananaPhone bananaPhone = getItem(position);
	 * phoneView.setText(bananaPhone.getPhone());
	 * bananaView.setImageResource(bananaPhone.getBanana());
	 * 
	 * return convertView;
	 * }
	 */

}

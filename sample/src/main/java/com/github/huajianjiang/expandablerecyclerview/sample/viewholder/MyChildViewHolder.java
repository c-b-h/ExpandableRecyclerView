package com.github.huajianjiang.expandablerecyclerview.sample.viewholder;

import android.view.View;
import android.widget.TextView;

import com.github.huajianjiang.baserecyclerview.viewholder.BaseViewHolder;
import com.github.huajianjiang.expandablerecyclerview.sample.R;
import com.github.huajianjiang.expandablerecyclerview.sample.model.MyChild;
import com.github.huajianjiang.expandablerecyclerview.sample.utils.Util;
import com.github.huajianjiang.expandablerecyclerview.widget.ChildViewHolder;

/**
 * Created by jhj_Plus on 2016/9/2.
 */
public class MyChildViewHolder extends ChildViewHolder {
    private static final String TAG = "MyChildViewHolder";

    public MyChildViewHolder(View itemView) {
        super(itemView);
    }

    public void bind(MyChild data) {
        String info = data.getInfo();
        TextView tv_info = getView(R.id.info);
        tv_info.setText(info);
        getView(R.id.dot).setBackgroundColor(data.getDot());
    }

    @Override
    public int[] onRegisterLongClickEvent() {
        return new int[]{itemView.getId()};
    }

    @Override
    public boolean onItemLongClick(BaseViewHolder vh, View v, int adapterPosition) {
        Util.showToast(v.getContext(), "Child LongClick=" + adapterPosition);
        return true;
    }
}
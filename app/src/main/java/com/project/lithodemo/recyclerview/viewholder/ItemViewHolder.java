package com.project.lithodemo.recyclerview.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.project.lithodemo.data.Article;

abstract public class ItemViewHolder extends RecyclerView.ViewHolder {

    public ItemViewHolder(View v) {
        super(v);
    }

    abstract public void setData(Article article);
}

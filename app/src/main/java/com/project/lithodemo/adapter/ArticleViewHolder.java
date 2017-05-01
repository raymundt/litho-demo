package com.project.lithodemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.project.lithodemo.R;
import com.project.lithodemo.object.Article;

public class ArticleViewHolder extends RecyclerView.ViewHolder {

    protected TextView mTitleLabel;

    public ArticleViewHolder(View v) {
        super(v);
        mTitleLabel = (TextView) v.findViewById(R.id.lbl_title);
    }

    public void setData(Article article) {
        mTitleLabel.setText(article.getTitle());
    }
}

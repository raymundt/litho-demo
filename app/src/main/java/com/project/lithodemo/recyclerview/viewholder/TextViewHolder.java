package com.project.lithodemo.recyclerview.viewholder;

import android.view.View;
import android.widget.TextView;

import com.project.lithodemo.R;
import com.project.lithodemo.data.Article;

public class TextViewHolder extends ItemViewHolder {

    protected TextView mTitleLabel;

    public TextViewHolder(View v) {
        super(v);
        mTitleLabel = (TextView) v.findViewById(R.id.lbl_title);
    }

    public void setData(Article article) {
        mTitleLabel.setText(article.getTitle());
    }
}

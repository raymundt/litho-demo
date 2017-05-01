package com.project.lithodemo.viewholder;

import android.net.Uri;
import android.view.View;

import com.facebook.drawee.view.SimpleDraweeView;
import com.project.lithodemo.R;
import com.project.lithodemo.object.Article;

public class ArticleSmallImageViewHolder extends ArticleViewHolder {

    protected SimpleDraweeView mThumbnailImage;

    public ArticleSmallImageViewHolder(View v) {
        super(v);
        mThumbnailImage = (SimpleDraweeView) v.findViewById(R.id.img_thumbnail);
    }

    public void setData(Article article) {
        super.setData(article);

        String[] images = article.getImages();
        if (images != null && images.length > 0) {
            Uri uri = Uri.parse(images[0]);
            mThumbnailImage.setImageURI(uri);
        }
    }
}

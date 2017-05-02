package com.project.lithodemo.recyclerview.viewholder;

import android.net.Uri;
import android.view.View;

import com.facebook.drawee.view.SimpleDraweeView;
import com.project.lithodemo.R;
import com.project.lithodemo.data.Article;

public class ThreeImagesViewHolder extends TextViewHolder {

    protected SimpleDraweeView mThumbnailImage1;
    protected SimpleDraweeView mThumbnailImage2;
    protected SimpleDraweeView mThumbnailImage3;

    public ThreeImagesViewHolder(View v) {
        super(v);
        mThumbnailImage1 = (SimpleDraweeView) v.findViewById(R.id.img_thumbnail_1);
        mThumbnailImage2 = (SimpleDraweeView) v.findViewById(R.id.img_thumbnail_2);
        mThumbnailImage3 = (SimpleDraweeView) v.findViewById(R.id.img_thumbnail_3);
    }

    public void setData(Article article) {
        super.setData(article);

        String[] images = article.getImages();
        if (images != null) {
            if (images.length > 0) {
                Uri uri = Uri.parse(images[0]);
                mThumbnailImage1.setImageURI(uri);
            }
            if (images.length > 1) {
                Uri uri = Uri.parse(images[1]);
                mThumbnailImage2.setImageURI(uri);
            }
            if (images.length > 2) {
                Uri uri = Uri.parse(images[2]);
                mThumbnailImage3.setImageURI(uri);
            }
        }
    }
}

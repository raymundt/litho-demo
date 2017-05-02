package com.project.lithodemo.lithoview.adapter;

import com.facebook.litho.ComponentContext;
import com.facebook.litho.ComponentInfo;
import com.facebook.litho.widget.LayoutInfo;
import com.facebook.litho.widget.RecyclerBinder;
import com.project.lithodemo.data.Article;
import com.project.lithodemo.lithoview.component.LargeImageItem;
import com.project.lithodemo.lithoview.component.SmallImageItem;
import com.project.lithodemo.lithoview.component.TextItem;
import com.project.lithodemo.lithoview.component.ThreeImagesItem;
import com.project.lithodemo.lithoview.component.WebItem;

import java.util.ArrayList;

import static com.project.lithodemo.data.Article.DisplayType.LARGE_IMAGE;
import static com.project.lithodemo.data.Article.DisplayType.TEXT_ONLY;
import static com.project.lithodemo.data.Article.DisplayType.THREE_IMAGES;
import static com.project.lithodemo.data.Article.DisplayType.WEB;

public class LithoRecyclerAdapter extends RecyclerBinder {

    private ArrayList<Article> mItems;
    protected ComponentContext mComponentContext;

    public LithoRecyclerAdapter(ComponentContext c, LayoutInfo layoutInfo) {
        super(c, 4f, layoutInfo, null, false);
        mComponentContext = c;
    }

    public void setItems(ArrayList<Article> items) {
        if (getItemCount() > 0)
            removeRangeAt(0, getItemCount());

        mItems = items;

        for (int i = 0; i < mItems.size(); i++) {
            Article article = mItems.get(i);
            ComponentInfo.Builder componentInfoBuilder = ComponentInfo.create();
            if (article.getDisplayType() == TEXT_ONLY) {
                componentInfoBuilder.component(
                        TextItem.create(mComponentContext)
                                .title(article.getTitle())
                                .build());
            } else if (article.getDisplayType() == LARGE_IMAGE) {
                componentInfoBuilder.component(
                        LargeImageItem.create(mComponentContext)
                                .title(article.getTitle())
                                .image(article.getImage())
                                .build());
            } else if (article.getDisplayType() == THREE_IMAGES) {
                componentInfoBuilder.component(
                        ThreeImagesItem.create(mComponentContext)
                                .title(article.getTitle())
                                .images(article.getImages())
                                .build());
            } else if (article.getDisplayType() == WEB) {
                componentInfoBuilder.component(
                        WebItem.create(mComponentContext)
                                .url(article.getLink())
                                .build());
            } else {
                componentInfoBuilder.component(
                        SmallImageItem.create(mComponentContext)
                                .title(article.getTitle())
                                .image(article.getImage())
                                .aspectRatio(1)
                                .build());
            }
            insertItemAt(i, componentInfoBuilder.build());
        }
    }

}

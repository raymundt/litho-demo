package com.project.lithodemo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.OrientationHelper;

import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.ComponentInfo;
import com.facebook.litho.LithoView;
import com.facebook.litho.widget.LinearLayoutInfo;
import com.facebook.litho.widget.Recycler;
import com.facebook.litho.widget.RecyclerBinder;
import com.project.lithodemo.component.ArticleLargeImageItem;
import com.project.lithodemo.component.ArticleSmallImageItem;
import com.project.lithodemo.component.ArticleTextOnlyItem;
import com.project.lithodemo.component.ArticleThreeImagesItem;
import com.project.lithodemo.data.SampleData;
import com.project.lithodemo.object.Article;

import java.util.ArrayList;

import static com.project.lithodemo.object.Article.DisplayType.LARGE_IMAGE;
import static com.project.lithodemo.object.Article.DisplayType.TEXT_ONLY;
import static com.project.lithodemo.object.Article.DisplayType.THREE_IMAGES;

public class LithoViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ComponentContext context = new ComponentContext(this);
        final RecyclerBinder recyclerBinder = new RecyclerBinder(context, new LinearLayoutInfo(this, OrientationHelper.VERTICAL, false));
        final Component component = Recycler.create(context)
                .binder(recyclerBinder)
                .itemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
                .build();

        ArrayList<Article> data = new SampleData().get();
        for (int i = 0; i < data.size(); i++) {
            Article article = data.get(i);
            ComponentInfo.Builder componentInfoBuilder = ComponentInfo.create();
            if (data.get(i).getDisplayType() == TEXT_ONLY) {
                componentInfoBuilder.component(
                        ArticleTextOnlyItem.create(context)
                                .title(article.getTitle())
                                .build());
            }
            else if (data.get(i).getDisplayType() == LARGE_IMAGE) {
                componentInfoBuilder.component(
                        ArticleLargeImageItem.create(context)
                                .title(article.getTitle())
                                .image(article.getImage())
                                .build());
            }
            else if (data.get(i).getDisplayType() == THREE_IMAGES) {
                componentInfoBuilder.component(
                        ArticleThreeImagesItem.create(context)
                                .title(article.getTitle())
                                .images(article.getImages())
                                .build());
            }
            else {
                componentInfoBuilder.component(
                        ArticleSmallImageItem.create(context)
                                .title(article.getTitle())
                                .image(article.getImage())
                                .aspectRatio(1)
                                .build());
            }
            recyclerBinder.insertItemAt(i, componentInfoBuilder.build());
        }

        setContentView(LithoView.create(context, component));
    }

}

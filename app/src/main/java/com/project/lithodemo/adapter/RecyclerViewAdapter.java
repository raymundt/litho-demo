package com.project.lithodemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.project.lithodemo.R;
import com.project.lithodemo.object.Article;
import com.project.lithodemo.viewholder.ArticleLargeImageViewHolder;
import com.project.lithodemo.viewholder.ArticleSmallImageViewHolder;
import com.project.lithodemo.viewholder.ArticleThreeImagesViewHolder;
import com.project.lithodemo.viewholder.ArticleViewHolder;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<ArticleViewHolder> {

    private ArrayList<Article> mArticles;

    public RecyclerViewAdapter(ArrayList<Article> articles) {
        mArticles = articles;
    }

    @Override
    public int getItemViewType(int position) {
        return mArticles.get(position).getDisplayType().ordinal();
    }

    @Override
    public ArticleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        ArticleViewHolder vh;
        switch (Article.DisplayType.values()[viewType]) {
            case TEXT_ONLY:
                v = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_text_only, parent, false);
                vh = new ArticleViewHolder(v);
                break;
            case LARGE_IMAGE:
                v = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_large_image, parent, false);
                vh = new ArticleLargeImageViewHolder(v);
                break;
            case THREE_IMAGES:
                v = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_three_images, parent, false);
                vh = new ArticleThreeImagesViewHolder(v);
                break;
            case SMALL_IMAGE:
            default:
                v = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_small_image, parent, false);
                vh = new ArticleSmallImageViewHolder(v);
                break;
        }
        return vh;
    }

    @Override
    public void onBindViewHolder(ArticleViewHolder holder, int position) {
        holder.setData(mArticles.get(position));
    }

    @Override
    public int getItemCount() {
        return mArticles.size();
    }
}

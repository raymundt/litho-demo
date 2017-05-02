package com.project.lithodemo.recyclerview.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.project.lithodemo.R;
import com.project.lithodemo.data.Article;
import com.project.lithodemo.recyclerview.viewholder.ItemViewHolder;
import com.project.lithodemo.recyclerview.viewholder.LargeImageViewHolder;
import com.project.lithodemo.recyclerview.viewholder.SmallImageViewHolder;
import com.project.lithodemo.recyclerview.viewholder.ThreeImagesViewHolder;
import com.project.lithodemo.recyclerview.viewholder.TextViewHolder;
import com.project.lithodemo.recyclerview.viewholder.WebViewHolder;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    private ArrayList<Article> mArticles;

    public RecyclerViewAdapter(ArrayList<Article> articles) {
        mArticles = articles;
    }

    @Override
    public int getItemViewType(int position) {
        return mArticles.get(position).getDisplayType().ordinal();
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        ItemViewHolder vh;
        switch (Article.DisplayType.values()[viewType]) {
            case TEXT_ONLY:
                v = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_text_only, parent, false);
                vh = new TextViewHolder(v);
                break;
            case LARGE_IMAGE:
                v = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_large_image, parent, false);
                vh = new LargeImageViewHolder(v);
                break;
            case THREE_IMAGES:
                v = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_three_images, parent, false);
                vh = new ThreeImagesViewHolder(v);
                break;
            case WEB:
                v = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_web, parent, false);
                vh = new WebViewHolder(v);
                break;
            case SMALL_IMAGE:
            default:
                v = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_small_image, parent, false);
                vh = new SmallImageViewHolder(v);
                break;
        }
        return vh;
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.setData(mArticles.get(position));
    }

    @Override
    public int getItemCount() {
        return mArticles.size();
    }
}

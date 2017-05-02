package com.project.lithodemo.recyclerview.viewholder;

import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.project.lithodemo.R;
import com.project.lithodemo.data.Article;

public class WebViewHolder extends ItemViewHolder {

    protected WebView mWebView;

    public WebViewHolder(View v) {
        super(v);
        mWebView = (WebView) v.findViewById(R.id.wv_web);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setUseWideViewPort(true);
        mWebView.setWebViewClient(new WebViewClient());
    }

    public void setData(Article article) {
        mWebView.loadUrl(article.getLink());
    }
}

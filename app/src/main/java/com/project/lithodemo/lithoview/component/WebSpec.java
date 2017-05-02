package com.project.lithodemo.lithoview.component;

import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.facebook.litho.ComponentContext;
import com.facebook.litho.annotations.MountSpec;
import com.facebook.litho.annotations.OnCreateMountContent;
import com.facebook.litho.annotations.OnMount;
import com.facebook.litho.annotations.Prop;

@MountSpec
public class WebSpec {

    @OnCreateMountContent
    static WebView onCreateMountContent(ComponentContext c) {
        WebView webView = new WebView(c.getBaseContext());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.setWebViewClient(new WebViewClient());
        return webView;
    }

    @OnMount
    static void onMount(
            ComponentContext context,
            WebView webView,
            @Prop String url) {
        webView.loadUrl(url);
    }
}

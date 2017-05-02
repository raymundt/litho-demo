package com.project.lithodemo.component;

import com.facebook.litho.Column;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.ComponentLayout;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.OnCreateLayout;
import com.facebook.litho.annotations.Prop;

@LayoutSpec
public class WebItemSpec {

    @OnCreateLayout
    static ComponentLayout onCreateLayout(
            ComponentContext c,
            @Prop String url) {
        return Column.create(c)
                .child(
                        Web.create(c)
                                .url(url)
                                .withLayout()
                                .heightDip(360))
                .build();
    }

}

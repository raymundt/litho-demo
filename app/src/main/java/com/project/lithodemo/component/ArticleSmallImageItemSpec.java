package com.project.lithodemo.component;

import android.view.View;
import android.widget.Toast;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.litho.ClickEvent;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.ComponentLayout;
import com.facebook.litho.Row;
import com.facebook.litho.annotations.FromEvent;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.OnCreateLayout;
import com.facebook.litho.annotations.OnEvent;
import com.facebook.litho.annotations.Prop;
import com.facebook.litho.annotations.PropDefault;
import com.facebook.litho.fresco.FrescoImage;
import com.facebook.litho.widget.Text;
import com.project.lithodemo.R;

import static com.facebook.yoga.YogaEdge.ALL;
import static com.facebook.yoga.YogaEdge.RIGHT;

@LayoutSpec
public class ArticleSmallImageItemSpec {

    @PropDefault
    protected static final float aspectRatio = 16f / 9;

    @OnCreateLayout
    static ComponentLayout onCreateLayout(
            ComponentContext c,
            @Prop String title,
            @Prop String image,
            @Prop(optional = true) float aspectRatio) {
        final DraweeController controller = Fresco.newDraweeControllerBuilder()
                .setUri(image)
                .build();
        return Row.create(c)
                .paddingDip(ALL, 10)
                .child(
                        Text.create(c)
                                .text(title)
                                .textSizeSp(16)
                                .textColorRes(R.color.black)
                                .withLayout()
                                .widthDip(0)
                                .marginDip(RIGHT, 6)
                                .flex(1))
                .child(
                        FrescoImage.create(c)
                                .controller(controller)
                                .aspectRatio(aspectRatio)
                                .actualImageScaleType(ScalingUtils.ScaleType.CENTER_CROP)
                                .placeholderImageRes(R.drawable.placeholder)
                                .withLayout()
                                .widthDip(100))
                .clickHandler(ArticleSmallImageItem.onClick(c))
                .build();
    }

    @OnEvent(ClickEvent.class)
    static void onClick(ComponentContext c, @FromEvent View view, @Prop String title) {
        Toast.makeText(c.getBaseContext(), "Clicked " + title, Toast.LENGTH_SHORT).show();
    }
}

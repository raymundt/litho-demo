package com.project.lithodemo.component;

import android.view.View;
import android.widget.Toast;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.litho.ClickEvent;
import com.facebook.litho.Column;
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
import static com.facebook.yoga.YogaEdge.LEFT;
import static com.facebook.yoga.YogaEdge.RIGHT;
import static com.facebook.yoga.YogaEdge.TOP;

@LayoutSpec
public class ArticleThreeImagesItemSpec {

    @PropDefault
    protected static final float aspectRatio = 16f / 9;

    @OnCreateLayout
    static ComponentLayout onCreateLayout(
            ComponentContext c,
            @Prop String title,
            @Prop String[] images,
            @Prop(optional = true) float aspectRatio) {
        String image1 = images != null && images.length > 0 ? images[0] : null;
        String image2 = images != null && images.length > 1 ? images[1] : null;
        String image3 = images != null && images.length > 2 ? images[2] : null;
        final DraweeController controller1 = Fresco.newDraweeControllerBuilder()
                .setUri(image1)
                .build();
        final DraweeController controller2 = Fresco.newDraweeControllerBuilder()
                .setUri(image2)
                .build();
        final DraweeController controller3 = Fresco.newDraweeControllerBuilder()
                .setUri(image3)
                .build();
        return Column.create(c)
                .paddingDip(ALL, 10)
                .child(
                        Text.create(c)
                                .text(title)
                                .textSizeSp(20)
                                .textColorRes(R.color.black))
                .child(
                        Row.create(c)
                                .marginDip(TOP, 6)
                                .child(
                                        FrescoImage.create(c)
                                                .controller(controller1)
                                                .aspectRatio(aspectRatio)
                                                .actualImageScaleType(ScalingUtils.ScaleType.CENTER_CROP)
                                                .placeholderImageRes(R.drawable.placeholder)
                                                .withLayout()
                                                .widthDip(0)
                                                .marginDip(LEFT, 3)
                                                .marginDip(RIGHT, 3)
                                                .flex(1))
                                .child(
                                        FrescoImage.create(c)
                                                .controller(controller2)
                                                .aspectRatio(aspectRatio)
                                                .actualImageScaleType(ScalingUtils.ScaleType.CENTER_CROP)
                                                .placeholderImageRes(R.drawable.placeholder)
                                                .withLayout()
                                                .widthDip(0)
                                                .marginDip(LEFT, 3)
                                                .marginDip(RIGHT, 3)
                                                .flex(1))
                                .child(
                                        FrescoImage.create(c)
                                                .controller(controller3)
                                                .aspectRatio(aspectRatio)
                                                .actualImageScaleType(ScalingUtils.ScaleType.CENTER_CROP)
                                                .placeholderImageRes(R.drawable.placeholder)
                                                .withLayout()
                                                .widthDip(0)
                                                .marginDip(LEFT, 3)
                                                .marginDip(RIGHT, 3)
                                                .flex(1))
                )
                .clickHandler(ArticleSmallImageItem.onClick(c))
                .build();
    }

    @OnEvent(ClickEvent.class)
    static void onClick(ComponentContext c, @FromEvent View view, @Prop String title) {
        Toast.makeText(c.getBaseContext(), "Clicked " + title, Toast.LENGTH_SHORT).show();
    }
}

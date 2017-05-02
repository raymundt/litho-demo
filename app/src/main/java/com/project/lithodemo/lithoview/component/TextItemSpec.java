package com.project.lithodemo.lithoview.component;

import android.view.View;
import android.widget.Toast;

import com.facebook.litho.ClickEvent;
import com.facebook.litho.Column;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.ComponentLayout;
import com.facebook.litho.annotations.FromEvent;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.OnCreateLayout;
import com.facebook.litho.annotations.OnEvent;
import com.facebook.litho.annotations.Prop;
import com.facebook.litho.widget.Text;

import static com.facebook.yoga.YogaEdge.ALL;

@LayoutSpec
public class TextItemSpec {

    @OnCreateLayout
    static ComponentLayout onCreateLayout(
            ComponentContext c,
            @Prop String title) {

        return Column.create(c)
                .paddingDip(ALL, 10)
                .child(
                        Text.create(c)
                                .text(title)
                                .textSizeSp(20)
                                .withLayout()
                                .clickHandler(TextItem.onClick(c)))
                .clickHandler(TextItem.onClick(c))
                .build();
    }

    @OnEvent(ClickEvent.class)
    static void onClick(ComponentContext c, @FromEvent View view, @Prop String title) {
        Toast.makeText(c.getBaseContext(), "Clicked " + title, Toast.LENGTH_SHORT).show();
    }
}

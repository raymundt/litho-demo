package com.project.lithodemo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.OrientationHelper;

import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.LithoView;
import com.facebook.litho.widget.LinearLayoutInfo;
import com.facebook.litho.widget.Recycler;
import com.project.lithodemo.lithoview.adapter.LithoRecyclerAdapter;
import com.project.lithodemo.data.SampleData;

public class LithoViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ComponentContext componentContext = new ComponentContext(this);

        //  Adapter (RecyclerBinder) setup
        final LithoRecyclerAdapter adapter = new LithoRecyclerAdapter(
                componentContext,
                new LinearLayoutInfo(this, OrientationHelper.VERTICAL, false));

        //  Recycler setup
        final Component component = Recycler.create(componentContext)
                .binder(adapter)
                //  Add divider
                .itemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
                .build();

        //  Set data
        adapter.setItems(new SampleData().get());

        setContentView(LithoView.create(componentContext, component));
    }

}

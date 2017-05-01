package com.project.lithodemo;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.litho.LithoWebKitInspector;
import com.facebook.soloader.SoLoader;
import com.facebook.stetho.Stetho;

public class MyApplication extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //  Initialize Fresco
        Fresco.initialize(this);

        //  Initialize Litho
        SoLoader.init(this, false);

        //  Initialize Stetho
        Stetho.initialize(
                Stetho.newInitializerBuilder(this)
                        .enableWebKitInspector(new LithoWebKitInspector(this))
                        .build());
    }
}
